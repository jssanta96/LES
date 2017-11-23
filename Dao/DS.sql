DROP TABLE users cascade;
CREATE TABLE users(

	identification VARCHAR(50)NOT NULL PRIMARY KEY,
	project_id VARCHAR(30),
	FOREIGN KEY (project_id) REFERENCES project(code),
	user_password VARCHAR(50) NOT NULL,
	name VARCHAR(60) NOT NULL,
	type VARCHAR(20) NOT NULL,
	state VARCHAR(30) NOT NULL,
	email VARCHAR(40)

);
DROP TABLE equipment cascade;
CREATE TABLE equipment(

	serial VARCHAR(50)NOT NULL PRIMARY KEY,
	name VARCHAR(60) NOT NULL,
	description VARCHAR(30) NOT NULL,
	state VARCHAR(20) NOT NULL

);
DROP TABLE project cascade;
CREATE TABLE project(
	
	code VARCHAR(30) NOT NULL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	description VARCHAR(60) NOT NULL,
	state VARCHAR(30) NOT NULL
	
);

DROP TABLE request cascade;
CREATE TABLE request(
	
	state VARCHAR(10) NOT NULL,
	user_id VARCHAR(50) NOT NULL,
	FOREIGN KEY (user_id) REFERENCES users(identification),
	serial VARCHAR(50) NOT NULL,
	FOREIGN KEY (serial) REFERENCES equipment(serial),
	start_date DATE NOT NULL,
	CONSTRAINT request_pk PRIMARY KEY(user_id,serial,start_date)
);
