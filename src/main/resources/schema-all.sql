DROP TABLE pessoa IF EXISTS;
create table pessoa
(
    pessoa_id BIGINT identity not null primary key,
    nome varchar(20),
    sobrenome varchar(20)
);