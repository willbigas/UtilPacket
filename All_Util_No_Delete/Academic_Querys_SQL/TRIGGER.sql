ALTER TABLE pedidos
ADD valor_dolares decimal;


DELIMITER $
 
CREATE TRIGGER TR_DolarConvertido BEFORE INSERT
ON pedidos
FOR EACH ROW
BEGIN
	
	set new.valor_dolares = fn_conversor(new.data_pedido, new.valor_pedido); 
    
END$

