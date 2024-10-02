DROP TABLE IF EXISTS customer;

CREATE TABLE customer (

  cid bigint AUTO_INCREMENT  PRIMARY KEY,
  fname VARCHAR(250) NULL,
  lname VARCHAR(250) NULL,
  username VARCHAR(250) NULL,
  password varchar(250) NULL
  createdAt TIMESTAMP NULL,
  updatedAt TIMESTAMP
);

DROP TABLE IF EXISTS cardtype;

CREATE TABLE cardtype (

  ccType VARCHAR(250)  PRIMARY KEY,
  ccTypeD VARCHAR(250) NULL,
  createdAt TIMESTAMP NULL,
  updatedAt TIMESTAMP
);

DROP TABLE IF EXISTS credit_card;

CREATE TABLE credit_card(

  ccId VARCHAR(250)  PRIMARY KEY,
  credit_Number VARCHAR(250) NULL,
  cvv VARCHAR(250) NULL,
  expirationMonth VARCHAR(250) NULL,
  expirationYear VARCHAR(250) NULL,
  createdAt TIMESTAMP NULL,
  updatedAt TIMESTAMP

  );


