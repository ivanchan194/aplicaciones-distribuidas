create table usuarios(
	idUsuario int not null identity constraint pk_usuarios primary key,
	mail varchar(150) unique,
	nickname varchar(100)  not null,
	habilitado varchar(2) constraint chk_habilitado check (habilitado in ('Si','No')),
	nombre varchar(150),
	avatar varchar(300), -- url de la imagen del avatar.
	tipo_usuario varchar(10) constraint chk_tipo_usuario check (tipo_usuario in ('Alumno','Visitante')),
)

create table tipos(
	idTipo int not null identity constraint pk_tipos primary key,
	descripcion varchar(250)
)

create table recetas(
	idReceta int not null identity constraint pk_recetas primary key,
	idUsuario int,
	nombre varchar(500),
	descripcion varchar(1000),
	foto varchar(300), -- url de la imagen del plato, siempre tiene al menos una les demas estaràn en la tabla fotos.
	porciones int,
	cantidadPersonas int,
	idTipo int,
	constraint fk_recetas_usuarios foreign key (idUsuario) references usuarios,
	constraint fk_recetas_tipos foreign key (idTipo) references tipos
)

create table ingredientes(
	idIngrediente int not null identity constraint pk_ingredientes primary key,
	nombre varchar(200)
)

create table unidades(
	idUnidad int not null identity constraint pk_unidades primary key,
	descripcion varchar(50) not null
)

create table utilizados (
	idUtilizado int not null identity constraint pk_utilizados primary key,
	idReceta int,
	idIngrediente int,
	cantidad int,
	idUnidad int,
	observaciones varchar(500)
	constraint fk_utilizados_recetas foreign key (idReceta) references recetas,
	constraint fk_utilizados_ingredientes foreign key (idIngrediente) references ingredientes,
	constraint fk_utilizados_unidades foreign key (idUnidad) references unidades
)

create table calificaciones(
	idCalificacion int not null identity constraint pk_calificaciones primary key,
	idusuario int,
	idReceta int,
	calificacion int,
	comentarios varchar(500),
	constraint fk_calificaciones_usuarios foreign key (idUsuario) references usuarios,
	constraint fk_calificaciones_recetas foreign key (idReceta) references recetas
)

create table conversiones(
	idConversion int not null identity constraint pk_conversiones primary key,
	idUnidadOrigen int not null,
	idUnidadDestino int not null,
	factorConversiones float,
	constraint fk_unidad_origen foreign key (idUnidadOrigen) references unidades (idUnidad),
	constraint fk_unidad_destino foreign key (idUnidadDestino) references unidades (idUnidad)
)

create table pasos(
	idPaso int not null identity constraint pk_pasos primary key,
	idReceta int,
	nroPaso int,
	texto varchar(2000),
	constraint fk_pasos_recetas foreign key (idReceta) references recetas
)

create table fotos(
	idfoto int not null identity constraint pk_fotos primary key,
	idReceta int not null,
	urlFoto varchar(300),
	extension varchar(5),
	constraint fk_fotos_recetas foreign key (idReceta) references recetas
)

create table multimedia(
	idContenido int not null identity constraint pk_multimedia primary key,
	idPaso int not null,
	tipo_contenido varchar(10) constraint chk_tipo_contenido check (tipo_contenido in ('foto','video','audio')),
	extension varchar(5),
	urlContenido varchar(300),
	constraint fk_multimedia_pasos foreign key (idPaso) references pasos
)