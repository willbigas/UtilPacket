CREATE Database exemplo;

use exemplo;

CREATE TABLE usuario (
idUsuario int NOT NULL AUTO_INCREMENT,
idDepartamento int,
idTelefone int,
nome varchar(80),
nascimento DATE,
PRIMARY KEY(idUsuario)
); 

CREATE TABLE departamento(
idDepartamento int NOT NULL AUTO_INCREMENT,
idUsuario int,
nome varchar (30),
descricao varchar (30),
PRIMARY KEY (idDepartamento),
foreign key (idUsuario) references usuario(idUsuario)
);

CREATE TABLE telefone(
idTelefone int NOT NULL AUTO_INCREMENT,
idUsuario int,
numero varchar (20),
tipo varchar (20),
ddd int,
PRIMARY KEY (idTelefone),
foreign key (idUsuario) references usuario(idUsuario)
);



insert into usuario (nome, nascimento) values 
('Joao', str_to_date('10/10/1970','%d/%m/%Y')); 

insert into usuario (nome, nascimento) values 
('Maria', str_to_date('10/10/1965','%d/%m/%Y'));

ALTER TABLE usuario ADD fOREIGN KEY fk_user_dep(idDepartamento) references departamento(idDepartamento);

ALTER TABLE usuario ADD fOREIGN KEY fk_user_tel(idTelefone) references telefone(idTelefone);

SELECT * FROM departamento;
SELECT * FROM usuario;
SELECT * FROM telefone;