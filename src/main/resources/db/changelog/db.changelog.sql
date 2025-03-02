-- liquibase formatted sql

-- ChangeSet meiyappan:1
CREATE TABLE student (
    student_id INT PRIMARY KEY AUTO_INCREMENT,
    student_name VARCHAR(255) NOT NULL,
    student_age INT NOT NULL
);

-- ChangeSet mugundhan:2
INSERT INTO student (student_name, student_age) VALUES ('Alice', 22);
INSERT INTO student (student_name, student_age) VALUES ('Bob', 25);
