#--------------- VALIDACAO DO CPF SEM MASCARA ----------------------

CREATE TABLE UNIVERSITARIO(NOME VARCHAR(50), CPF VARCHAR(14));
INSERT INTO UNIVERSITARIO VALUES("Jukinha","36547197738");
INSERT INTO UNIVERSITARIO VALUES("Mariazinha","36547147738");

SELECT nome, cpf, IF(SUBSTR(cpf, 10, 2) = CONCAT( @dig1:=(
      SUBSTR(cpf,1,1)   + SUBSTR(cpf,2,1)*2 + SUBSTR(cpf,3,1)*3+
      SUBSTR(cpf,4,1)*4 + SUBSTR(cpf,5,1)*5 + SUBSTR(cpf,6,1)*6+
      SUBSTR(cpf,7,1)*7 + SUBSTR(cpf,8,1)*8 + SUBSTR(cpf,9,1)*9 ) % 11 % 10
   ,(
      SUBSTR(cpf,2,1)   + SUBSTR(cpf,3,1)*2 + SUBSTR(cpf,4,1)*3 + 
      SUBSTR(cpf,5,1)*4 + SUBSTR(cpf,6,1)*5 + SUBSTR(cpf,7,1)*6 + 
      SUBSTR(cpf,8,1)*7 + SUBSTR(cpf,9,1)*8 + @dig1          *9 ) % 11 % 10
   ), "VALIDO","INVALIDO") AS digito FROM UNIVERSITARIO;


#--------------- VALIDACAO DO CPF COM MASCARA ----------------------

CREATE TABLE UNIVERSITARIO(NOME VARCHAR(50), CPF VARCHAR(14));
INSERT INTO UNIVERSITARIO VALUES("Jukinha","365.471.977-38");
INSERT INTO UNIVERSITARIO VALUES("Mariazinha","365.471.477-38");

SELECT cpf, IF( SUBSTR(cpf, 13, 2) = CONCAT( @dig1:=(
SUBSTR(cpf, 1,1) + SUBSTR(cpf, 2,1)*2 + SUBSTR(cpf, 3,1)*3 +
SUBSTR(cpf, 5,1)*4 + SUBSTR(cpf, 6,1)*5 + SUBSTR(cpf, 7,1)*6 +
SUBSTR(cpf, 9,1)*7 + SUBSTR(cpf,10,1)*8 + SUBSTR(cpf,11,1)*9 ) % 11 % 10
,(
SUBSTR(cpf, 2,1) + SUBSTR(cpf, 3,1)*2 + SUBSTR(cpf, 5,1)*3 +
SUBSTR(cpf, 6,1)*4 + SUBSTR(cpf, 7,1)*5 + SUBSTR(cpf, 9,1)*6 +
SUBSTR(cpf,10,1)*7 + SUBSTR(cpf,11,1)*8 + @dig1 *9 ) % 11 % 10
) 
,"Valido", "Invalido") AS valido
FROM universitario


#--------------- UTILIZANDO FUNCAO REPLACE PARA REMOVER MASCARA DO CPF ----------------------

SELECT "Uso da funcao replace" as OBS, CPF,  REPLACE(CPF,"-","") AS "CPF sem traco", REPLACE(REPLACE(CPF,".",""),"-","") AS "CPF sem ponto e traco" FROM UNIVERSITARIO
