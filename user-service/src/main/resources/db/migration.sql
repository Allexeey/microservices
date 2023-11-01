-- liquibase formatted sql

-- changeset alexey:1698580753418-1
CREATE SEQUENCE  IF NOT EXISTS user_ds_seq START WITH 1 INCREMENT BY 50;

-- changeset alexey:1698580753418-2
CREATE TABLE user_ds (id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL, company_id BIGINT, email VARCHAR(255), enabled BOOLEAN NOT NULL, login VARCHAR(255), name VARCHAR(255), password VARCHAR(255), CONSTRAINT "user_dsPK" PRIMARY KEY (id));
