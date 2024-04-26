create database bancoPi;
use bancoPi;
CREATE TABLE listaUx (
    id int auto_increment primary key,
    nome VARCHAR(70),
    username VARCHAR(30),
    senha VARCHAR(30)
);

select * from listaUx;