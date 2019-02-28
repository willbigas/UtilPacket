1 - select categorias.nomeCategoria,produtos.nomeProduto from produtos join categorias on categorias.categoriaID = categorias.categoriaID order by nomeCategoria;



2 - select pedidos.clienteid as ID,clientes.nomeCliente AS Nome,produtos.nomeProduto as Produto,pedidos_item.pedidoID as idPedido,pedidos_item.quantidade as QTD from pedidos join pedidos_item on pedidos.pedidoid = pedidos_item.pedidoid 
join clientes on clientes.clienteID = pedidos.ClienteID
join produtos on produtos.produtoID = pedidos_item.produtoID 
order by (pedidos_item.quantidade) desc limit 10;


3 - select departamentos.nomedepartamento as nomeDept , fornecedores_contatos.nome as NomeFornecedor , fornecedores_contatos.email as EmailFornecedor from fornecedores_contatos join departamentos on departamentos.departamentoID = fornecedores_contatos.departamentoID order by fornecedores_contatos.nome asc


4 - select count(distinct produtos.produtoID) as QtdProduto,count(distinct clientes.clienteID) as qtdClientes,count(distinct fornecedores.fornecedorID) as qtdFornecedor from produtos join clientes join fornecedores;

5 - select nomeCliente , pedidos.pedidoid, pedidos.data_pedido  from clientes left join pedidos on clientes.clienteid = pedidos.clienteid 
where pedidos.pedidoid is null




7 - select ClienteID,nomeCliente,CEP from clientes where CEP between '9000' and '9999';


8 - select pedidos.clienteID as Cliente,pedidos.pedidoID as nrPedido,pedidos.valor_pedido as Valor, pedidos_item.quantidade as Qtd from pedidos join pedidos_item on pedidos.pedidoID = pedidos_item.pedidoID where pedidos_item.quantidade > '10';

9 - select NomeCliente as Cliente, Endereco, cidade as Cidade,email as Email from clientes where cidade = 'São Paulo';

10 - select clientes.NomeCliente,clientes.Endereco,estados.nome,estados.sigla from clientes inner join estados on clientes.estado = estados.codestado where estados.sigla = 'PR' or estados.sigla = 'SC' or estados.sigla = 'RS';

11 - select nomeCliente as CLIENTE, usuario  as LOGIN, Endereco  as ENDERECO, nivel as ACESSO from clientes where clientes.nomeCliente like 'A%' or 'B%' and clientes.nivel = 'user';


  