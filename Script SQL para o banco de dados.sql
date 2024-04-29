create database bancoPi;
use bancoPi;
CREATE TABLE tbusuario (
    id int auto_increment primary key,
    nome VARCHAR(70),
    username VARCHAR(30),
    senha VARCHAR(30),
    perfil varchar(20) not null
);

select * from tbusuario;