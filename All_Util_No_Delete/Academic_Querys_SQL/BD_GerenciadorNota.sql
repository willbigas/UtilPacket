create database  if not exists GerenciadorNota;

use GerenciadorNota;

CREATE TABLE notafiscals (
  idNF int(10) NOT NULL auto_increment,
  numnf varchar(45) NULL,
  serie int(4) NULL,
  data_emissao varchar(10) NULL,
  totalgeral double(10,2)  NULL,
  PRIMARY KEY(idNF)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE clientes (
  idCliente int(8) NOT NULL auto_increment,
  codCliente int(8) NOT NULL,
  NomeCliente varchar(50)  NULL,
  Endereco varchar(50) NULL,
  CgcCliente varchar(50) NULL,
  PRIMARY KEY(idCliente)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE produtos (
  idProduto int(8) NOT NULL auto_increment,
  codProduto int(8) NULL,
  descricao varchar(255) NULL,
  quantidadeEstoque int(8) NULL,
  preco decimal(10,2) NULL,
  PRIMARY KEY(idProduto)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE pedidos (
  idPedido int(8) NOT NULL auto_increment,
  codPedido int(8) NULL,
  observacao varchar(255) NULL,
  valorTotal decimal(10,2) NULL,
  quantidadeVendida int (10) NULL,
  PRIMARY KEY(idPedido)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
