
/*Creacion de la base de datos, checando si no existe*/
CREATE DATABASE if not exists Featherstore;
use Featherstore;
/*Creacion de tablas Usuarios,Software,Desarrolladores,user_has_software*/

/*
	________________________Usuarios_______________________-
    idUsuarios int
    Username varchar
    Password_ varchar
    Correo varchar
    Nombre varchar
    Pais varchar
    Direccion Varchar
*/
CREATE table featherstore.Usuarios(
	idUsuarios int not null primary key Auto_increment,
    Username varchar(60),
    Password_ varchar(20),
	Correo varchar(50),
    Nombre varchar(60),
    Pais varchar(45)
);
/*
	__________________________Desarrolladores_________________
	idDesarrolladores
	Correo VARCHAR
	Username VARCHAR
	Nombre VARCHAR
	Pais VARCHAR
	Password_ VARCHAR
	Titulo VARCHAR
*/
CREATE table featherstore.Desarrolladores(
	idDesarrolladores int not null primary key Auto_increment,
    Username varchar(60),
    Password_ varchar(20),
	Correo varchar(50),
    Nombre varchar(60),
    Pais varchar(45),
    Titulo varchar(30)
);
/*_____________________________Software________________________
	idSoftware INT
	Nombre VARCHAR
	Precio VARCHAR
	Descripcion VARCHAR
	Desarrollador_es VARCHAR
	Repo_Git VARCHAR
	Categoria VARCHAR
*/
CREATE table featherstore.Software(
	idSoftware int not null auto_increment,
    Nombre varchar(45),
    Precio varchar(10),
    Descripcion varchar(120),
    Desarrolladores varchar(45),
    Repo_Git varchar(45),
    Categoria varchar(60)
);

