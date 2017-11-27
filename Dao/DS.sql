

DROP SEQUENCE equipment_seq cascade;
CREATE SEQUENCE equipment_seq;

DROP TABLE IF EXISTS equipment cascade;
CREATE TABLE equipment(
	id_equipment INTEGER DEFAULT nextval('equipment_seq'::regclass) NOT NULL PRIMARY KEY,
	serial VARCHAR(50)NOT NULL,
	name VARCHAR(60) NOT NULL,
	description VARCHAR(30) NOT NULL,
	state VARCHAR(20) NOT NULL

);

DROP SEQUENCE project_seq cascade;
CREATE SEQUENCE project_seq;

DROP TABLE IF EXISTS project cascade;
CREATE TABLE project(
	id_project INTEGER DEFAULT nextval('project_seq'::regclass) NOT NULL PRIMARY KEY,
	code VARCHAR(30) NOT NULL,
	name VARCHAR(50) NOT NULL,
	description VARCHAR(60) NOT NULL,
	state VARCHAR(30) NOT NULL
	
);

INSERT INTO project(code,name,description,state)
VALUES('1111' , 'Hola mundo' , 'Esto es prueba' , 'Activo');

DROP SEQUENCE users_seq cascade;
CREATE SEQUENCE users_seq;

DROP TABLE IF EXISTS users cascade;
CREATE TABLE users(
	id_user INTEGER DEFAULT nextval('users_seq'::regclass) NOT NULL PRIMARY KEY,
	identification VARCHAR(50)NOT NULL,
	project_id INTEGER,
	FOREIGN KEY (project_id) REFERENCES project(id_project),
	user_password VARCHAR(50) NOT NULL,
	name VARCHAR(60) NOT NULL,
	type VARCHAR(20) NOT NULL,
	state VARCHAR(30) NOT NULL,
	email VARCHAR(40) NOT NULL

);
INSERT INTO users(identification,project_id,user_password,name,type,state,email)
VALUES('1107520913' , 1 , 'nothing' , 'carloscuervo@','Director','Activo','Carlitos6131@...com');
DROP SEQUENCE request_seq cascade;
CREATE SEQUENCE request_seq;

DROP TABLE IF EXISTS request cascade;
CREATE TABLE request(
	
	id_request INTEGER DEFAULT nextval('request_seq'::regclass) NOT NULL PRIMARY KEY,
	state VARCHAR(10) NOT NULL,
	id_user INTEGER NOT NULL,
	id_equipment INTEGER NOT NULL,
	FOREIGN KEY (id_user) REFERENCES users(id_user),
	serial VARCHAR(50) NOT NULL,
	FOREIGN KEY (id_equipment) REFERENCES equipment(id_equipment),
	start_date DATE NOT NULL,
	end_date DATE NOT NULL
	);
	
DROP TABLE IF EXISTS mult cascade;
CREATE TABLE mult(
	id_user INTEGER NOT NULL,
	FOREIGN KEY (id_user) REFERENCES users(id_user),
	id_request INTEGER NOT NULL,
	FOREIGN KEY (id_request) REFERENCES request(id_request),
	value INTEGER NOT NULL,
	CONSTRAINT mult_pk PRIMARY KEY(id_user,id_request)
);



