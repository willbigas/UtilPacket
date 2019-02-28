create database ecommerce
default character  set utf8
default collate utf8_general_ci;

create table cliente (

idcliente int not null auto_increment,
cpf varchar (14) not null,
nome varchar(30) not null,
nascimento date,
sexo enum('M','F'),
endereço tinytext,
email varchar (30),
primary key (idcliente)

) DEFAULT CHARSET = utf8;



create table pedido (

idpedido int not null auto_increment,
metpagamento enum('CREDITO','DEBITO','DINHEIRO'),
quantproduto tinyint(2),
frete enum('PAC','SEDEX','TRANSPORTADORA'),
primary key (idpedido)

) DEFAULT CHARSET = utf8;




create table produto (

idproduto int not null auto_increment,
codean int(13) not null,
nomeproduto varchar(30) not null,
valorproduto decimal(5,2),
primary key (idproduto)

) DEFAULT CHARSET = utf8;



create table tipoproduto (

idtipo int not null auto_increment,
nometipo varchar(30) not null,
materialtipo text(50),
quanttipo int(9),
primary key (idtipo)
) DEFAULT CHARSET = utf8;



create table estoque (

idestoque int not null auto_increment,
quantestoque decimal (3,3),
endereco tinytext,
primary key (idestoque)

) DEFAULT CHARSET = utf8;


create table loja ( 
idloja int not null auto_increment,
cnpj varchar(18),
inscricaoest varchar(15),
endereco tinytext,
razaosocial tinytext,
nomefantasia tinytext,
primary key (idloja)

) DEFAULT CHARSET = utf8;



create table fornecedor (

idfornecedor int not null auto_increment,
nomefornecedor varchar(30) not null,
cnpj varchar(18),
endereco tinytext,
razaosocial tinytext,
inscricaoest varchar(15),
primary key (idfornecedor)
) DEFAULT CHARSET = utf8;


alter table produto
add fk_tipoproduto int not null;


alter table tipoproduto
add fk_produto int not null;


alter table produto  
add constraint fk_tipoproduto foreign key (fk_tipoproduto) references tipoproduto (idtipo);


alter table tipoproduto 
add constraint fk_produto foreign key (fk_produto) references produto (idproduto);








