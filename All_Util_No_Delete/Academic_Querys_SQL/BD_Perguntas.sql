
CREATE TABLE `PERGUNTAS` 
( 
`codPergunta` INT(6) NOT NULL, 
`descricao` VARCHAR(255) NOT NULL, 
`pontos` INT(6) NOT NULL,
PRIMARY KEY(codPergunta)
);

CREATE TABLE `RESPOSTAS` 
(
`codRespostas` INT(6) NOT NULL, 
`codPergunta` INT(6) NOT NULL, 
`descricao` VARCHAR(255) NOT NULL, 
`correta` TINYINT(1) DEFAULT NULL,

PRIMARY KEY(codRespostas),

CONSTRAINT `FK_PERGUNTA_RESPOSTA`
FOREIGN KEY (codPergunta)
REFERENCES `PERGUNTAS`(codPergunta)
ON UPDATE CASCADE ON DELETE RESTRICT

);
INSERT INTO `PERGUNTAS` (`codPergunta`, `descricao`, `pontos`) VALUES
(1, 'Quanto é 1+1?', 1),
(2, 'Quanto é 1+2?', 1),
(3, 'Quanto é 1+3?', 1),
(4, 'Quanto é 1+4?', 1),
(5, 'Quanto é 1+5?', 1);


INSERT INTO `RESPOSTAS` (`codRespostas`, `codPergunta`, `descricao`, `correta`) VALUES
(1, 1, 'É 2', true),
(2, 1, 'É 1', false),
(3, 1, 'É 0', false),
(4, 2, 'É 3', true),
(5, 2, 'É 1', false),
(6, 2, 'É 0', false),
(7, 3, 'É 4', true),
(8, 3, 'É 1', false),
(9, 3, 'É 0', false),
(10, 4, 'É 5', true),
(11, 4, 'É 1', false),
(12, 4, 'É 0', false),
(13, 5, 'É 6', true),
(14, 5, 'É 1', false),
(15, 5, 'É 0', false);
