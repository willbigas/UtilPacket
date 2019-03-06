create database  if not exists planta;
use planta;

CREATE TABLE produtos (
  id int(10) NOT NULL auto_increment,
  nome varchar(50) NULL,
  valor double(10,2) NULL,
  dataCadastro date null,
  PRIMARY KEY(id)
);

CREATE TABLE usuarios (
  id int(10) NOT NULL auto_increment,
  nome varchar(50) NULL,
  email varchar(35) NULL,
  senha varchar(30) NULL,
  nivel integer(1) NULL,
  PRIMARY KEY(id)
);

select * from produtos;

select * from usuarios