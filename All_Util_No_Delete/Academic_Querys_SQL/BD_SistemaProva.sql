CREATE SCHEMA IF NOT EXISTS `SistemaProvas`;

USE `SistemaProvas`;




CREATE TABLE pergunta(
np INT NOT NULL,
pergunta varchar(240) NOT NULL,
PRIMARY KEY (np));



CREATE TABLE resposta(
nr INT NOT NULL,
resposta varchar(240) NOT NULL,
PRIMARY KEY (np),
FOREIGN KEY (np) REFERENCES pergunta(np));

INSERT INTO pergunta (pergunta)
VALUES ('Esta é a pergunta1', 'Esta é a pergunta2', 'Esta é a pergunta3', 'Esta é a pergunta4' , 'Esta é a pergunta5');

INSERT INTO resposta (resposta)
VALUES ('Esta é a resposta1', 'Esta é a resposta2', 'Esta é a resposta3');
