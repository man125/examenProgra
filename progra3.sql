create database progra3_exa2;

use progra3_exa2;

create table author(
idAuthor int auto_increment,
nombre TEXT,
primary key(idAuthor)
);

create table authorcontact(
id_autorContact int auto_increment,
idAuthor int,
contact  TEXT,
tipo   TEXT,
primary key(id_autorContact)

);


create table booktype(
idType int auto_increment,
tipo TEXT,
primary key(idType)
);

create table book(
idBook int auto_increment,
idAuthor int,
tipo TEXT,
nombre TEXT,
calendar DATE,
price float,
primary key(idBook)
);

insert into author (nombre)values ("Manuel");
insert into authorcontact (idAuthor,contact,tipo)values(1,"2444-4556","casa");
insert into booktype(tipo) values("drama");
