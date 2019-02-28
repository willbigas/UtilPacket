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



create table fornecedor_loja ( 

idfornecedorloja int not null auto_increment,
primary key (idfornecedorloja)
) DEFAULT CHARSET = utf8;

 

alter table fornecedor_loja
add constraint fk_idfornecedor foreign key (idfornecedorloja) references fornecedor (idfornecedor);



alter table fornecedor_loja 
add constraint fk_idloja foreign key (idfornecedorloja) references loja (idloja);


create table loja_estoque ( 

idlojaestoque int not null auto_increment,
primary key (idlojaestoque)
) DEFAULT CHARSET = utf8;

alter table loja_estoque  
add foreign key  fk_idloja (idlojaestoque) references loja (idloja);


alter table loja_estoque 
add constraint fk_idestoque foreign key (idlojaestoque) references estoque (idestoque);


create table estoque_produto ( 

idestoqueproduto int not null auto_increment,
primary key (idestoqueproduto)
) DEFAULT CHARSET = utf8;


alter table estoque_produto 
add foreign key fk_idestoque (idestoqueproduto) references estoque (idestoque);


alter table estoque_produto
add constraint fk_idproduto foreign key (idestoqueproduto) references produto (idproduto);


create table produto_pedido ( 

idprodutopedido int not null auto_increment,
primary key (idprodutopedido)
) DEFAULT CHARSET = utf8;

alter table produto_pedido  
add foreign key  fk_idproduto (idprodutopedido) references produto (idproduto);


alter table produto_pedido 
add constraint fk_idpedido foreign key (idprodutopedido) references pedido (idpedido);


create table pedido_cliente ( 

idpedidocliente int not null auto_increment,
primary key (idpedidocliente)
) DEFAULT CHARSET = utf8;


alter table pedido_cliente  
add foreign key  fk_idpedido (idpedidocliente) references pedido (idpedido);


alter table pedido_cliente 
add constraint fk_idcliente foreign key (idpedidocliente) references cliente (idcliente);	
