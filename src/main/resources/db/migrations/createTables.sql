--liquibase formatted sql
--changeset TestUsers_sql:1

CREATE TABLE users
(
    username VARCHAR NOT NULL,
    id serial primary key
);

--changeset TestUsers_sql:2

CREATE TABLE subscriptions
(
    subname VARCHAR NOT NULL,
    id serial primary key
);

CREATE TABLE subsdata
(
    data DATE,
    deadline DATE,
    user_id INT,
    sub_id INT,
    id serial primary key
);