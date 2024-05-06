create database bancoPi;
use bancoPi;
CREATE DATABASE bancoPi;
CREATE TABLE tbusuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(70) NOT NULL, 
    username VARCHAR(30) NOT NULL UNIQUE,
    senha VARCHAR(30) NOT NULL,
    perfil VARCHAR(20) DEFAULT 'usuario' NOT NULL
);

CREATE TABLE jogos_brasileirao (
    id INT AUTO_INCREMENT PRIMARY KEY,
    data DATE,
    horario TIME,
    campeonato VARCHAR(100),
    preco VARCHAR(50),
    estadio VARCHAR(100),
    time_casa VARCHAR(100),
    time_visitante VARCHAR(100)
);

CREATE TABLE historico_ingressos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT,
    id_jogo INT,
    data_compra DATE,
    FOREIGN KEY (id_usuario) REFERENCES tbusuario(id),
    FOREIGN KEY (id_jogo) REFERENCES jogos_brasileirao(id)
);



	select * from jogos_brasileirao;
	select * from tbusuario;
	select * from historico_ingressos;