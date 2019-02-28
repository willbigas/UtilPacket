CREATE SCHEMA IF NOT EXISTS `petshop`;

USE `petshop`;

CREATE TABLE clinicas(
nroa INT NOT NULL,
andar INT(3) NOT NULL,
capacidade SMALLINT,
PRIMARY KEY (nroa));

CREATE TABLE veterinarios(
codm INT NOT NULL,
nome VARCHAR(20) NOT NULL,
idade SMALLINT NOT NULL,
especialidade CHAR(20),
CPF NUMERIC(11) UNIQUE,
cidade VARCHAR(30),
nroa INT,
PRIMARY KEY (codm),
FOREIGN KEY (nroa) REFERENCES clinicas(nroa));

CREATE TABLE pet(
codp INT NOT NULL,
nome VARCHAR(40) NOT NULL,
idade SMALLINT NOT NULL,
cidade CHAR(30), 
cpfd NUMERIC(11) UNIQUE,
doenca VARCHAR(40) NOT NULL,
animal CHAR(30) NOT NULL,
raca CHAR(30),
PRIMARY KEY(codp));

CREATE TABLE funcionarios(
codf INT NOT NULL,
nome varchar(40) NOT NULL,
idade SMALLINT,
cpf NUMERIC(11),
cidade VARCHAR(30),
salario NUMERIC(10),
cargo VARCHAR(20),
PRIMARY KEY(codf));

CREATE TABLE consultas(
codm INT NOT NULL,
codp INT,
data DATE,
hora TIME,
FOREIGN KEY (codm) REFERENCES veterinarios(codm),
FOREIGN KEY (codp) REFERENCES funcionarios(codf));

ALTER TABLE funcionarios ADD nroa INT;

CREATE UNIQUE INDEX medicos ON funcionarios(cpf);

CREATE INDEX doenca ON pet(doenca);

DROP INDEX doenca ON pet;

ALTER TABLE funcionarios DROP COLUMN cargo, DROP COLUMN nroa;

INSERT INTO `petshop`.`clinicas` (`nroa`, `andar`, `capacidade`) VALUES ('1', '1', '30');
INSERT INTO `petshop`.`clinicas` (`nroa`, `andar`, `capacidade`) VALUES ('2', '1', '50');
INSERT INTO `petshop`.`clinicas` (`nroa`, `andar`, `capacidade`) VALUES ('3', '2', '40');
INSERT INTO `petshop`.`clinicas` (`nroa`, `andar`, `capacidade`) VALUES ('4', '2', '25');
INSERT INTO `petshop`.`clinicas` (`nroa`, `andar`, `capacidade`) VALUES ('5', '2', '55');

INSERT INTO `petshop`.`veterinarios` (`codm`, `nome`, `idade`, `especialidade`, `CPF`, `cidade`, `nroa`) VALUES ('1', 'Joao', '40', ' Homeopatia', '10000100000', 'Florianopolis', '1');
INSERT INTO `petshop`.`veterinarios` (`codm`, `nome`, `idade`, `especialidade`, `CPF`, `cidade`, `nroa`) VALUES ('2', 'Maria', '42', 'Cirurgia', '10000110000', 'Blumenau', '2');
INSERT INTO `petshop`.`veterinarios` (`codm`, `nome`, `idade`, `especialidade`, `CPF`, `cidade`, `nroa`) VALUES ('3', 'Pedro', '51', 'Ocologia', ' 11000100000', 'São José', '2');
INSERT INTO `petshop`.`veterinarios` (`codm`, `nome`, `idade`, `especialidade`, `CPF`, `cidade`, `nroa`) VALUES ('4', 'Carlos', '28', 'Anestesiologia', '11000110000', 'Joinville', '2');
INSERT INTO `petshop`.`veterinarios` (`codm`, `nome`, `idade`, `especialidade`, `CPF`, `cidade`, `nroa`) VALUES ('5', 'Marcia', '33', 'Clinico Geral', '11000111000', 'Biguacu', '3');

INSERT INTO `petshop`.`pet` (`codp`, `nome`, `idade`, `cidade`, `cpfd`, `doenca`, `animal`, `raca`) VALUES ('1', 'Rex', '7', 'Florianopolis', '20000200000', 'Gripe', 'Cão', 'Poodle');
INSERT INTO `petshop`.`pet` (`codp`, `nome`, `idade`, `cidade`, `cpfd`, `doenca`, `animal`, `raca`) VALUES ('2', 'Thor', '3', 'Palhoça', '20000220000', 'Fratura', 'Gato', 'Angorá');
INSERT INTO `petshop`.`pet` (`codp`, `nome`, `idade`, `cidade`, `cpfd`, `doenca`, `animal`, `raca`) VALUES ('3', 'Lula', '2', 'Biguacu', '22000200000', 'Tendinite', 'Hamster', 'Chinês');
INSERT INTO `petshop`.`pet` (`codp`, `nome`, `idade`, `cidade`, `cpfd`, `doenca`, `animal`, `raca`) VALUES ('4', 'Velox', '1', 'Joinville', '11000110000', 'Alergia', 'Tartaruga', 'Cágado');

INSERT INTO `petshop`.`funcionarios` (`codf`, `nome`, `idade`, `cpf`, `cidade`, `salario`) VALUES ('1', 'Rita', '32', '20000100000', 'Sao Jose', '1200');
INSERT INTO `petshop`.`funcionarios` (`codf`, `nome`, `idade`, `cpf`, `cidade`, `salario`) VALUES ('2', 'Maria', '55', '30000110000', 'Palhoca', '1220');
INSERT INTO `petshop`.`funcionarios` (`codf`, `nome`, `idade`, `cpf`, `cidade`, `salario`) VALUES ('3', 'Caio', '45', '41000100000', 'Florianopolis', '1100');
INSERT INTO `petshop`.`funcionarios` (`codf`, `nome`, `idade`, `cpf`, `cidade`, `salario`) VALUES ('4', 'Carlos', '44', '51000110000', 'Florianopolis', '1200');
INSERT INTO `petshop`.`funcionarios` (`codf`, `nome`, `idade`, `cpf`, `cidade`, `salario`) VALUES ('5', 'Paula', '33', '61000111000', 'Florianopolis', '2500');

INSERT INTO `petshop`.`consultas` (`codm`, `codp`, `data`, `hora`) VALUES ('1', '1', '2018/08/12', '14:00');
INSERT INTO `petshop`.`consultas` (`codm`, `codp`, `data`, `hora`) VALUES ('2', '1', '2018/09/13', '9:00');
INSERT INTO `petshop`.`consultas` (`codm`, `codp`, `data`, `hora`) VALUES ('2', '2', '2018/09/13', '11:00');
INSERT INTO `petshop`.`consultas` (`codm`, `codp`, `data`, `hora`) VALUES ('2', '3', '2018/09/14', '14:00');
INSERT INTO `petshop`.`consultas` (`codm`, `codp`, `data`, `hora`) VALUES ('2', '4', '2018/09/14', '17:00');
INSERT INTO `petshop`.`consultas` (`codm`, `codp`, `data`, `hora`) VALUES ('3', '3', '2018/09/12', '10:00');
INSERT INTO `petshop`.`consultas` (`codm`, `codp`, `data`, `hora`) VALUES ('3', '4', '2018/09/19', '13:00');

DELETE FROM pet WHERE doenca = 'cancer';

DELETE FROM veterinarios WHERE cidade = 'biguacu' OR  cidade = 'palhoca';
