CREATE DATABASE poc_batch_db OWNER postgres;
GRANT ALL PRIVILEGES ON DATABASE poc_batch_db TO postgres;

\c poc_batch_db

-- INIT SCRIPT EXPORTED FROM MASTERDATA ON 11/16/2022

CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

DROP TABLE people IF EXISTS;

CREATE TABLE people  (
 person_id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
 first_name VARCHAR(20),
 last_name VARCHAR(20)
);

