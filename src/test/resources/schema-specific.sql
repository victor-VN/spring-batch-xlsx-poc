DROP TABLE people IF EXISTS;

CREATE TABLE people  (
                         person_id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                         first_name VARCHAR(20),
                         last_name VARCHAR(20)
);
