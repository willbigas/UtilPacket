CREATE DATABASE IF NOT EXISTS `SistemaDeVendas`;

USE `SistemaDeVendas`;

CREATE TABLE Endereco(
idEndereco INT NOT NULL auto_increment,
logradouro varchar(140) NOT NULL,
bairro varchar(45) NOT NULL,
cidade varchar(25) NOT NULL,
estado varchar(20) NOT NULL,
sigla varchar(2) NOT NULL,
complemento varchar(200),
observacao varchar(200),
PRIMARY KEY (idEndereco));

CREATE TABLE Cliente(
idCliente INT NOT NULL auto_increment,
nome varchar(100) NOT NULL,
cpf varchar(14) NOT NULL,
email varchar(45) NOT NULL,
telefone varchar(25) NOT NULL,
idEndereco int NOT NULL,
PRIMARY KEY (idCliente),
FOREIGN KEY (idEndereco) REFERENCES Endereco(idEndereco));


CREATE TABLE CategoriaProduto(
idCategoriaProduto INT NOT NULL auto_increment,
nome varchar(200) NOT NULL,
descricao varchar(200),
PRIMARY KEY (idCategoriaProduto));

CREATE TABLE Produto(
idProduto INT NOT NULL auto_increment,
nome varchar(100) NOT NULL,
descricao varchar(200),
idCategoriaProduto int,
quantidadeEstoque integer(6) NOT NULL,
PRIMARY KEY (idProduto),
FOREIGN KEY (idCategoriaProduto) REFERENCES CategoriaProduto(idCategoriaProduto));


CREATE TABLE ItemPedido(
idItemPedido INT NOT NULL auto_increment,
quantidade Integer(9) NOT NULL,
precoUnitario decimal(10,2) NOT NULL,
idProduto int,
PRIMARY KEY (idItemPedido),
FOREIGN KEY (idProduto) REFERENCES Produto(idProduto));


CREATE TABLE Pedido(
idPedido INT NOT NULL auto_increment,
notaFiscal varchar(50) NOT NULL,
cadastro date NOT NULL,
idItemPedido int,
idCliente int,
totalPedido decimal(10,2) NOT NULL,
PRIMARY KEY (idPedido),
FOREIGN KEY (idItemPedido) REFERENCES ItemPedido(idItemPedido),
FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente));











