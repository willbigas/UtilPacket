create database  if not exists planta;
use planta;

CREATE TABLE produtos (
  id int(10) NOT NULL auto_increment,
  nome varchar(50) NULL,
  valor double(10,2) NULL,
  dataCadastro date null,
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;