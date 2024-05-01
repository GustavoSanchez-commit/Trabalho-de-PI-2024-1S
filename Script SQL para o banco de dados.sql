create database bancoPi;
use bancoPi;

CREATE TABLE tbusuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(70) NOT NULL, 
    username VARCHAR(30) NOT NULL,
    senha VARCHAR(30) NOT NULL,
    perfil VARCHAR(20) DEFAULT 'usuario' NOT NULL,
    INDEX idx_username (username) 
);

CREATE TABLE historico_ingressos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(30),
    ingresso VARCHAR(100),
    estadio varchar(60),
    preco double,
    data_compra DATE,
    FOREIGN KEY (username) REFERENCES tbusuario(username)
);

select * from tbusuario;

select * from historico_ingressos;

CREATE TABLE tbusuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(70) NOT NULL, 
    username VARCHAR(30) NOT NULL UNIQUE,
    senha VARCHAR(30) NOT NULL,
    perfil VARCHAR(20) DEFAULT 'usuario' NOT NULL
);

CREATE TABLE historico_ingressos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT,
    ingresso VARCHAR(100),
    data_compra DATE,
    FOREIGN KEY (id_usuario) REFERENCES tbusuario(id)
);

CREATE TABLE jogos_brasileirao (
    id INT AUTO_INCREMENT PRIMARY KEY,
    data DATE,
    horario TIME,
    preco varchar(50),
    estadio VARCHAR(100),
    time_casa VARCHAR(100),
    time_visitante VARCHAR(100)
);


select * from jogos_brasileirao