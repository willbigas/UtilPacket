CREATE DATABASE CadastrarFuncionarios;

use CadastrarFuncionarios;

CREATE TABLE Funcionarios (
id int (11) NOT NULL auto_increment,
nomeFuncionario varchar (55) NOT NULL,
dataNascimento date default NULL,
estadoCivil varchar(20) default NULL,
cpf int (15) default NULL,
rg int (15) default NULL,
sexo enum ('M, F') default NULL,
nacionalidade varchar (45)default NULL,
idDependentes int,
idTelefone int,
idEndereco int,
idCargo int,
PRIMARY KEY (id)
)  DEFAULT CHARSET=latin1;

CREATE TABLE Telefone (
idTelefone int (11) NOT NULL auto_increment,
ddd int (3) NOT NULL ,
ddi int (3) default null,
numero int(15) default NULL,
ramal int(15) default NULL,
descricao varchar(45) default NULL,
PRIMARY KEY (idTelefone)
)  DEFAULT CHARSET=latin1;

CREATE TABLE endereco (
idEndereco int (11) NOT NULL auto_increment,
cep int(8) default NULL,
logradouro varchar(45) default NULL,
estado varchar(2) default null,
pais varchar(45) default null,
cidade varchar(45) default null,
bairro varchar(45) default null,
PRIMARY KEY (idEndereco)
 )  DEFAULT CHARSET=latin1;
 
 CREATE TABLE cargos(
idCargo int (11) NOT NULL auto_increment,
nomeCargo varchar(45) default null,
descricao varchar(45) ,
idCargosOcp int,
PRIMARY KEY (idCargo)
 )   DEFAULT CHARSET=latin1;
 
 
 CREATE TABLE cargosOcupados (
idCargosOcp int (11) NOT NULL auto_increment, 
dtInicio date default null,
dtFinal date default null,
idCargo int,
PRIMARY KEY(idCargosOcp)
) DEFAULT CHARSET=latin1;

CREATE TABLE dependentes(
idDependentes int (11) NOT NULL auto_increment,
nome varchar(45) default null,
PRIMARY KEY (idDependentes)
) DEFAULT CHARSET=latin1;


ALTER TABLE `Funcionarios` ADD CONSTRAINT `fk_Telefone` FOREIGN KEY ( `idTelefone` ) REFERENCES `Telefone` ( `idTelefone` ) ;
ALTER TABLE `Funcionarios` ADD CONSTRAINT `fk_Endereco` FOREIGN KEY ( `idEndereco` ) REFERENCES `endereco` ( `idEndereco` ) ;
ALTER TABLE `Funcionarios` ADD CONSTRAINT `fk_Cargos` FOREIGN KEY ( `idCargo` ) REFERENCES `cargos` ( `idCargo` ) ;
ALTER TABLE `Funcionarios` ADD CONSTRAINT `fk_Dependentes` FOREIGN KEY ( `idDependentes` ) REFERENCES `dependentes` ( `idDependentes` ) ;
ALTER TABLE `cargos` ADD CONSTRAINT `fk_cargosOcupados` FOREIGN KEY ( `idCargosOcp` ) REFERENCES `cargosOcupados` ( `idCargosOcp` ) ;
ALTER TABLE `cargosOcupados` ADD CONSTRAINT `fk_Cargos2` FOREIGN KEY ( `idCargo` ) REFERENCES `Cargos` ( `idCargo` ) ;


