create database kahoot;

use kahoot;

CREATE TABLE disciplina(
id INT(11) not null auto_increment,
nome varchar(50) NOT NULL,
professor varchar(50) NOT NULL,
PRIMARY KEY (id));

CREATE TABLE usuario(
id INT(11) NOT NULL auto_increment,
nome varchar(50) NOT NULL,
pontos int(4) NOT NULL,
ip varchar(50) not null,
PRIMARY KEY (id));

CREATE TABLE assunto(
id INT(11) NOT NULL auto_increment,
nome varchar(50) NOT NULL,
id_disciplina int,
PRIMARY KEY (id),
foreign key(id_disciplina) references disciplina(id));

CREATE TABLE pergunta(
id INT(11) NOT NULL auto_increment,
pergunta varchar(100) NOT NULL,
tempo int(11) NOT NULL,
id_Assunto int,
PRIMARY KEY (id),
foreign key (id_Assunto) references assunto(id));

CREATE TABLE resposta(
id INT(11) NOT NULL auto_increment,
resposta varchar(100) NOT NULL,
correta boolean NOT NULL,
id_pergunta int,
PRIMARY KEY (id),
foreign key (id_pergunta) references pergunta(id));


select * from disciplina;

select * from assunto;

select * from usuario;

select * from resposta;

select * from pergunta

