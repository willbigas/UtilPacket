/** STORED PROCEDURE - EXPORTANDO PARA TXT **/

delimiter //

CREATE PROCEDURE simpleproc ()
BEGIN
SELECT
"",
"",
"",
concat("RECIBO"),
concat("======"),
concat("RECEBEMOS DE " ,trim(b.nomeCliente) ," A QUANTIA DE ", trim(a.valor_pedido) ," (",  valorExtenso(a.valor_pedido), "), REFERENTE AO"),
concat("PAGAMENTO DO PEDIDO NUMERO ",trim(a.pedidoID), " REALIZADO EM 2006-11-19.
E PARA TANTO FIRMAMOS O PRESENTE", '\r\n'),
"",
concat("EMPRESA XPTO"),
"",
concat("PALHOÇA-SC " ,NOW()),
"",
"",
concat("<--------------------------------- RECORTE AQUI ------------------------------------------->")
INTO OUTFILE "c:/temp/emails.txt"
FIELDS TERMINATED BY '\r\n'
from pedidos a inner join clientes b;

END//

delimiter ;

CALL simpleproc();


SELECT @a;