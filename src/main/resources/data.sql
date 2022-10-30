DROP TABLE BOOKS;

CREATE TABLE BOOKS (
SERIALNUMBER NUMBER PRIMARY KEY,
AUTHOR VARCHAR2,
NAME VARCHAR2
);

INSERT INTO books (serialNumber, author, name) VALUES (1, 'Akshat', 'Book1');
INSERT INTO books (serialNumber, author, name) VALUES (2, 'Akshat', 'Book2');