/* Selecionar Top 10  quantidade de produtos /*

select sum(a.quantidade) as total, b.Descricao from pedidos_item a inner join produtos b on a.produtoId = b.produtoId group by b.Descricao order by total desc limit 10



/** Select com filtro da hora **/

select concat('R$', format(sum(a.precoUnitario * a.quantidade),2,'de_De')) as 'total 1º trim 2007' from pedidos_item a inner join pedidos b on a.pedidoID = b.pedidoID where b.DATA_pedido between '2007-01-01 00:00' and '2007-03-31 23:59'; 

/** Selecionar Cliente Ordenado por Nomecliente **/

select  nomeCliente,Email,Usuario from clientes order by nomeCliente;

/** Selecionar Cliente e concatenas valores /**
	
Select a.nomeCliente, a.usuario, concat(lower(a.nomeCliente),’@minhaempresa.com’) as ‘email corporativo’ from Clientes A;

/** Selecionar Cliente Ordenado por Usuario**/

select  nomeCliente,Email,Usuario from clientes order by Usuario;

/** Selecionar tabelas de Cliente com regra de  email  com final “.com” **/

select  nomeCliente,Email,Usuario from clientes where email like '%.com';

/** Selecionar tabelas de Cliente com regra de  nome que começam com “M” **/

select  nomeCliente,Email,Usuario from clientes where nomeCliente like 'M%';
