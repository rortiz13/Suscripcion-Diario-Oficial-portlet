create table GEO_CIUDAD (
	id_ciudad INTEGER not null primary key IDENTITY,
	nombre VARCHAR(75) null,
	id_departamento INTEGER
);

create table GEO_DEPARTAMENTO (
	id_departamento INTEGER not null primary key IDENTITY,
	nombre VARCHAR(75) null,
	id_pais INTEGER
);

create table GEO_PAIS (
	id_pais INTEGER not null primary key IDENTITY,
	nombre VARCHAR(75) null
);

create table suscripcion_Suscripcion (
	id_suscripcion INTEGER not null primary key,
	nombres VARCHAR(75) null,
	id_tipo_doc INTEGER,
	num_documento VARCHAR(75) null,
	email VARCHAR(75) null,
	direccion VARCHAR(75) null,
	telefono VARCHAR(75) null,
	id_ciudad INTEGER,
	nombres_contacto VARCHAR(75) null,
	telefono_contacto VARCHAR(75) null,
	medio VARCHAR(75) null,
	tipo VARCHAR(75) null,
	estado_pago VARCHAR(75) null,
	valor_pagado VARCHAR(75) null,
	tipo_persona INTEGER
);

create table suscripcion_TipoDocumento (
	id_tipo INTEGER not null primary key IDENTITY,
	nombre VARCHAR(75) null
);