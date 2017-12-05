




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
	email VARCHAR(40) NOT NULL,
	secret_answer VARCHAR(80) NOT NULL,
	secret_question VARCHAR(80) NOT NULL,
	adress_photo VARCHAR(80)

);
INSERT INTO users(identification,project_id,user_password,name,type,state,email,secret_answer,secret_question)
VALUES('1107520913' , 1 , 'nothing' , 'carloscuervo@','Director','Activo','Carlitos6131@...com','andres','¿Mejor amigo de la infancia?');



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



DROP SEQUENCE mult_seq cascade;
CREATE SEQUENCE mult_seq;	
DROP TABLE IF EXISTS mult cascade;
CREATE TABLE mult(
	id_mult INT DEFAULT nextval('mult_seq'::regclass) NOT NULL,
	id_request INTEGER NOT NULL,
	FOREIGN KEY (id_request) REFERENCES request(id_request),
	value INTEGER NOT NULL
);

--FUNCION CREAR MULTA
CREATE OR REPLACE FUNCTION f_createMult() RETURNS TRIGGER AS $$
BEGIN
IF(TG_OP = 'UPDATE') THEN
	IF(NEW.end_date<now()) THEN
		INSERT INTO mult(id_request,value) VALUES (NEW.id_request,5000);
	ELSIF(NEW.end_date>now()) THEN
		INSERT INTO mult(id_request,value) VALUES (NEW.id_request,0);
	END IF;
END IF;
RETURN NULL;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER insert_mult AFTER UPDATE
ON request FOR EACH ROW EXECUTE PROCEDURE f_createMult();




