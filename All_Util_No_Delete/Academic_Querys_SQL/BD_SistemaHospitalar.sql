create database  if not exists SistemaHospitalar;

use SistemaHospitalar;

CREATE TABLE pessoas (
  idPessoa int(10) NOT NULL auto_increment,
  nascimento date NULL,
  nacionalidade varchar(35) NULL,
  estadoCivil varchar(35) NULL,
  sexo enum('M','F')  NULL,
  rg varchar(20) null,
  cpf varchar(15) null,
  idDependente int,
  PRIMARY KEY(idPessoa)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



CREATE TABLE funcionarios (
  idFuncionario int(10) NOT NULL auto_increment,
  matricula varchar(25) NULL,
  dataAdmissao date null,
  PRIMARY KEY(idFuncionario)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE medicos (
  idMedico int(10) NOT NULL auto_increment,
  crm varchar(25) NULL,
  dataAdmissao date null,
  PRIMARY KEY(idMedico)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE dependentes (
  idDependente int(10) NOT NULL auto_increment,
  nome varchar(25) NULL,
  idade int(3) NULL,
  PRIMARY KEY(idDependente)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;




CREATE TABLE cargos (
  idCargo int(10) NOT NULL auto_increment,
  tipoCargo varchar(25) NULL,
  descricao varchar(120) NULL,
  dataInicio date null,
  dataFim date null,
  PRIMARY KEY(idCargo)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE fichaMedicas(
  idFichaMedica int(10) NOT NULL auto_increment,
  numeroPaciente int(10) NOT NULL auto_increment,
  convenio varchar(35) NULL,
  observacao varchar(35) NULL,
  PRIMARY KEY(idFichaMedica)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE enderecos(
  idEndereco int(10) NOT NULL auto_increment,
  logradouro varchar(25) NULL,
  cep varchar (20) null,
  numero int(6) NULL,
  observacao varchar(35) NULL,
  PRIMARY KEY(idEndereco)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE telefones(
  idTelefone int(10) NOT NULL auto_increment,
  ddi int(3) null,
  ddd int(3) null,
  numero varchar (20) null,
  ramal varchar(6) NULL,
  observacao varchar(35) NULL,
  PRIMARY KEY(idTelefone)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE consultas(
  idConsulta int(10) NOT NULL auto_increment,
  numeroConsulta int(10) NOT NULL auto_increment,
  dataConsulta date NULL,
  diagnostico varchar(250) NULL,
  PRIMARY KEY(idConsulta)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE exames(
  idExame int(10) NOT NULL auto_increment,
  nomeExame varchar(70) null,
  numeroConsulta int(10) NOT NULL auto_increment,
  dataExame date NULL,
  PRIMARY KEY(idExame)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;









