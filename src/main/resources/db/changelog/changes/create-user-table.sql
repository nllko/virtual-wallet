--liquibase formatted sql

--changeset nikolajs:1

CREATE TABLE users
(
    id VARCHAR(255) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);