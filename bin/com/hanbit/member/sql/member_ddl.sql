--id, pw, ssn, name, regdate

CREATE TABLE Member(
	id VARCHAR2(10), 
	name VARCHAR2(10),
	pw VARCHAR2(10), 
	ssn VARCHAR2(15), 
	regdate DATE,
	PRIMARY KEY(id)
);


DROP TABLE Member;