USE BTECH_3A_101;

-------SQL VIEWS------------

----------------------PART-A------------------

CREATE TABLE STUDENT_INFO(
    RNO INT,
    NAME VARCHAR(10),
    BRANCH VARCHAR(5),
    SPI DECIMAL(4,2),
    BKLOG INT
);

INSERT INTO STUDENT_INFO VALUES
(101,'RAJU','CE',8.80,0),
(102,'AMIT','CE',2.20,3),
(103,'SANJAY','ME',1.50,6),
(104,'NEHA','EC',7.65,1),
(105,'MEERA','EE',5.52,2),
(106,'MAHESH','EC',4.52,3);


SELECT * FROM STUDENT_INFO;

-- 1. Create a view Personal with all columns.
CREATE VIEW PERSONAL AS SELECT * FROM STUDENT_INFO;

-- 2. Create a view Student_Details having columns Name, Branch & SPI. 
CREATE VIEW STUDENT_DETAIL AS SELECT NAME,BRANCH,SPI FROM STUDENT_INFO;

-- 3. Create a view AcademicData having columns RNo, Name, Branch.
CREATE VIEW ACADEMICDATA AS SELECT RNO,NAME,BRANCH FROM STUDENT_INFO;

-- 4. Create a view Student_ bklog having all columns but students whose bklog more than 2.
CREATE VIEW STUDENT_BKLOG AS SELECT * FROM STUDENT_INFO WHERE BKLOG>2;

-- 5. Create a view Student_Pattern having RNo, Name & Branch columns in which Name consists of four letters.
CREATE VIEW STUDENT_PATTERN AS SELECT RNO,NAME,BRANCH FROM STUDENT_INFO WHERE NAME LIKE '____';

-- 6. Insert a new record to AcademicData view. (107, Meet, ME)
INSERT INTO ACADEMICDATA VALUES(107,'MEET','CE');

-- 7. Update the branch of Amit from CE to ME in Student_Details view.
UPDATE STUDENT_DETAIL SET BRANCH='ME' WHERE NAME='AMIT';

-- 8. Delete a student whose roll number is 104 from AcademicData view.
DELETE FROM ACADEMICDATA WHERE RNO=104;

SELECT * FROM PERSONAL;
SELECT * FROM STUDENT_DETAIL;
SELECT * FROM ACADEMICDATA;
SELECT * FROM STUDENT_BKLOG;
SELECT * FROM STUDENT_PATTERN;
----------------------PART-B------------------

-- 1. Create a view that displays information of all students whose SPI is above 8.5
CREATE VIEW VW_SPI AS SELECT * FROM STUDENT_INFO WHERE SPI>8.5;

-- 2. Create a view that displays 0 backlog students.
CREATE VIEW VW_BKLOG AS SELECT * FROM STUDENT_INFO WHERE BKLOG=0;

-- 3. Create a view Computerview that displays CE branch data only.
CREATE VIEW COMPUTERVIEW AS SELECT * FROM STUDENT_INFO WHERE BRANCH='CE';


SELECT * FROM VW_SPI;
SELECT * FROM VW_BKLOG;
SELECT * FROM COMPUTERVIEW;



----------------------PART-C------------------

-- 1. Create a view Result_EC that displays the name and SPI of students with SPI less than 5 of branch EC.
CREATE VIEW RESULT_EC AS SELECT NAME,SPI FROM STUDENT_INFO WHERE SPI<5 AND BRANCH='EC';

-- 2. Update the result of student MAHESH to 4.90 in Result_EC view.
UPDATE RESULT_EC SET SPI=4.90 WHERE NAME='MAHESH';

-- 3. Create a view Stu_Bklog with RNo, Name and Bklog columns in which name starts with ‘M’ and having bklogs more than 5.
CREATE VIEW STU_BKLOG AS SELECT RNO,NAME,BKLOG FROM STUDENT_INFO WHERE NAME LIKE 'M%' AND BKLOG>5;

-- 4. Drop Computerview form the database.
DROP VIEW COMPUTERVIEW;

SELECT * FROM RESULT_EC;
SELECT * FROM STU_BKLOG;
