




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
INSERT INTO equipment(serial,name,description,state)
VALUES('31654971' , 'Portatil DELL' , 'nothing' , 'Disponible');
INSERT INTO equipment(serial,name,description,state)
VALUES('9461E654' , 'Kinet ' , 'nothing' , 'Disponible');
INSERT INTO equipment(serial,name,description,state)
VALUES('E313C874' , 'ACCER 2' , 'portatil accer' , 'Disponible');
INSERT INTO equipment(serial,name,description,state)
VALUES('FKDJQ654' , 'LIP MOTION' , 'nothing' , 'Disponible');
INSERT INTO equipment(serial,name,description,state)
VALUES('ES98746D' , 'GLASS VR' , 'Gafas realidad Virtual' , 'Disponible');


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
INSERT INTO project(code,name,description,state)
VALUES('1111' , 'DS' , 'Desarrollo de software 1' , 'Activo');
INSERT INTO project(code,name,description,state)
VALUES('1111' , 'BD' , 'Bases de Datos' , 'Activo');
INSERT INTO project(code,name,description,state)
VALUES('1111' , 'SO' , 'Sistemas operativos' , 'Activo');
INSERT INTO project(code,name,description,state)
VALUES('1111' , 'TGS' , 'Teoria general de sistemas' , 'Activo');

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
	email VARCHAR(40) NOT NULL,
	secret_answer VARCHAR(80) NOT NULL,
	secret_question VARCHAR(80) NOT NULL,
	adress_photo VARCHAR(80),
        UNIQUE(identification)

);
INSERT INTO users(identification,project_id,user_password,name,type,state,email,secret_answer,secret_question)
VALUES('1107520913' , 1 ,'gnihton' , 'Carlos Cuervo','Director','Activo','Carlitos6131@...com','andres','¿Mejor amigo de la infancia?');
INSERT INTO users(identification,project_id,user_password,name,type,state,email,secret_answer,secret_question)
VALUES('1625606' , 2 ,'gnihton' , 'Diana KT','Director','Activo','LaKt@...com','andres','¿Mejor amigo de la infancia?');
INSERT INTO users(identification,project_id,user_password,name,type,state,email,secret_answer,secret_question)
VALUES('1632149' , 1 ,'gnihton' , 'Andres Serrato','Director','Activo','serratoandres@...com','andres','¿Mejor amigo de la infancia?');
INSERT INTO users(identification,project_id,user_password,name,type,state,email,secret_answer,secret_question)
VALUES('1631506' , 1 ,'gnihton' , 'Juan Santa','Director','Activo','santasebastian@...com','andres','¿Mejor amigo de la infancia?');


DROP SEQUENCE request_seq cascade;
CREATE SEQUENCE request_seq;

DROP TABLE IF EXISTS request cascade;
CREATE TABLE request(
	
	id_request INTEGER DEFAULT nextval('request_seq'::regclass) NOT NULL PRIMARY KEY,
	state VARCHAR(10) NOT NULL,
	id_user INTEGER NOT NULL,
	id_equipment INTEGER NOT NULL,
	FOREIGN KEY (id_user) REFERENCES users(id_user),
	FOREIGN KEY (id_equipment) REFERENCES equipment(id_equipment),
	start_date DATE NOT NULL,
	end_date DATE NOT NULL
);
INSERT INTO request(state,id_user,id_equipment,start_date,end_date)
VALUES('Activo',1,1,'2017-11-29','2017-12-6');
INSERT INTO request(state,id_user,id_equipment,start_date,end_date)
VALUES('Activo',3,3,'2017-11-20','2017-12-27');
INSERT INTO request(state,id_user,id_equipment,start_date,end_date)
VALUES('Activo',2,2,'2017-12-10','2017-12-17');



DROP SEQUENCE mult_seq cascade;
CREATE SEQUENCE mult_seq;	
DROP TABLE IF EXISTS mult cascade;
CREATE TABLE mult(
	id_mult INT DEFAULT nextval('mult_seq'::regclass) NOT NULL,
	id_request INTEGER NOT NULL,
	FOREIGN KEY (id_request) REFERENCES request(id_request),
	value INTEGER NOT NULL
);

--Funcion eliminar multa cuando se inserte una con valor 0
CREATE OR REPLACE FUNCTION f_deleteMult() RETURNS TRIGGER AS $$
BEGIN
IF(TG_OP = 'INSERT') THEN
	IF(NEW.value=0) THEN
		DELETE FROM mult WHERE id_mult=new.id_mult;
	END IF;
END IF;
RETURN NULL;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER delete_mult AFTER INSERT
ON mult FOR EACH ROW EXECUTE PROCEDURE f_deleteMult();




