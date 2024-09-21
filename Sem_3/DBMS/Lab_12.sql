USE BTECH_3A_101;

-------COMPLEX JOINS------------

----------------------PART-A------------------

CREATE TABLE DEPT (
    DEPARTMENTID INT PRIMARY KEY,
    DEPARTMENTNAME VARCHAR(100) NOT NULL UNIQUE,
    DEPARTMENTCODE VARCHAR(50) NOT NULL UNIQUE,
    LOCATION VARCHAR(50) NOT NULL
);

CREATE TABLE PERSON (
    PERSONID INT PRIMARY KEY,
    PERSONNAME VARCHAR(100) NOT NULL,
    DEPARTMENTID INT NULL,
    SALARY DECIMAL(8, 2) NOT NULL,
    JOININGDATE DATETIME NOT NULL,
    CITY VARCHAR(100) NOT NULL,
    FOREIGN KEY (DEPARTMENTID) REFERENCES DEPT(DEPARTMENTID)
);

INSERT INTO DEPT (DEPARTMENTID, DEPARTMENTNAME, DEPARTMENTCODE, LOCATION) VALUES
(1, 'ADMIN', 'ADM', 'A-BLOCK'),
(2, 'COMPUTER', 'CE', 'C-BLOCK'),
(3, 'CIVIL', 'CI', 'G-BLOCK'),
(4, 'ELECTRICAL', 'EE', 'E-BLOCK'),
(5, 'MECHANICAL', 'ME', 'B-BLOCK');

SELECT * FROM DEPT;

INSERT INTO PERSON (PERSONID, PERSONNAME, DEPARTMENTID, SALARY, JOININGDATE, CITY) VALUES
(101, 'RAHUL TRIPATHI', 2, 56000, '2000-01-01', 'RAJKOT'),
(102, 'HARDIK PANDYA', 3, 18000, '2001-09-25', 'AHMEDABAD'),
(103, 'BHAVIN KANANI', 4, 25000, '2000-05-14', 'BARODA'),
(104, 'BHOOMI VAISHNAV', 1, 39000, '2005-02-08', 'RAJKOT'),
(105, 'ROHIT TOPIYA', 2, 17000, '2001-07-23', 'JAMNAGAR'),
(106, 'PRIYA MENPARA', NULL, 9000, '2000-10-18', 'AHMEDABAD'),
(107, 'NEHA SHARMA', 2, 34000, '2002-12-25', 'RAJKOT'),
(108, 'NAYAN GOSWAMI', 3, 25000, '2001-07-01', 'RAJKOT'),
(109, 'MEHUL BHUNDIYA', 4, 13500, '2005-01-09', 'BARODA'),
(110, 'MOHIT MARU', 5, 14000, '2000-05-25', 'JAMNAGAR');

SELECT * FROM PERSON;

-- 1. Find all persons with their department name & code.

SELECT P.PERSONNAME,D.DEPARTMENTNAME,D.DEPARTMENTCODE FROM PERSON P LEFT JOIN DEPT D ON P.DEPARTMENTID = D.DEPARTMENTID;

-- 2. Find the person's name whose department is in C-Block.

SELECT P.PERSONNAME FROM PERSON P JOIN DEPT D ON P.DEPARTMENTID = D.DEPARTMENTID WHERE D.[LOCATION] = 'C-BLOCK';

-- 3. Retrieve person name, salary & department name who belongs to Jamnagar city.

SELECT P.PERSONNAME,P.SALARY,D.DEPARTMENTNAME FROM PERSON P JOIN DEPT D ON P.DEPARTMENTID = D.DEPARTMENTID WHERE P.CITY = 'JAMNAGAR';

-- 4. Retrieve person name, salary & department name who does not belong to Rajkot city.

SELECT P.PERSONNAME,P.SALARY,D.DEPARTMENTNAME FROM PERSON P JOIN DEPT D ON P.DEPARTMENTID = D.DEPARTMENTID WHERE P.CITY <> 'RAJKOT';

-- 5. Retrieve person’s name of the person who joined the Civil department after 1-Aug-2001.

SELECT P.PERSONNAME FROM PERSON P JOIN DEPT D ON P.DEPARTMENTID = D.DEPARTMENTID WHERE D.DEPARTMENTNAME = 'CIVIL' AND P.JOININGDATE > '2001-08-01';

-- 6. Find details of all persons who belong to the computer department.

SELECT P.*,D.DEPARTMENTNAME FROM PERSON P JOIN DEPT D ON P.DEPARTMENTID = D.DEPARTMENTID WHERE D.DEPARTMENTNAME = 'COMPUTER'

-- 7. Display all the person's name with the department whose joining date difference with the current date is more than 365 days.

SELECT P.PERSONNAME,D.DEPARTMENTNAME FROM PERSON P JOIN DEPT D ON P.DEPARTMENTID = D.DEPARTMENTID WHERE DATEDIFF(DAY,P.JOININGDATE,GETDATE()) > 365

-- 8. Find department wise person counts.

SELECT D.DEPARTMENTNAME,COUNT(P.PERSONID) FROM PERSON P JOIN DEPT D ON P.DEPARTMENTID = D.DEPARTMENTID GROUP BY D.DEPARTMENTNAME;

-- 9. Give department wise maximum & minimum salary with department name.

SELECT D.DEPARTMENTNAME,MAX(P.SALARY) AS MAX_SAL,MIN(P.SALARY) AS MIN_SAL FROM PERSON P JOIN DEPT D ON P.DEPARTMENTID = D.DEPARTMENTID GROUP BY D.DEPARTMENTNAME;

-- 10. Find city wise total, average, maximum and minimum salary.

SELECT P.CITY,MAX(P.SALARY) AS MAX_SAL,MIN(P.SALARY) AS MIN_SAL,AVG(P.SALARY) AS AVG_SAL FROM PERSON P JOIN DEPT D ON P.DEPARTMENTID = D.DEPARTMENTID GROUP BY P.CITY;

-- 11. Find the average salary of a person who belongs to Ahmedabad city.

SELECT PERSONNAME,AVG(SALARY) AS AVG_SAL FROM PERSON WHERE CITY = 'AHMEDABAD' GROUP BY PERSONNAME;

-- 12. Produce Output Like: <PersonName> lives in <City> and works in <DepartmentName> Department. (In single column)

SELECT P.PERSONNAME+' LIVES IN '+P.CITY+' AND WORKS IN '+D.DEPARTMENTNAME+' DEPARTMENT' FROM PERSON P JOIN DEPT D ON P.DEPARTMENTID = D.DEPARTMENTID;

----------------------PART-B------------------

-- 1. Produce Output Like: <PersonName> earns <Salary> from <DepartmentName> department monthly. (In single column)

SELECT CONCAT(P.PERSONNAME,' EARNS ',P.SALARY,' FROM ',D.DEPARTMENTNAME,' DEPARTMENT MONTHLY.')  FROM PERSON P JOIN DEPT D ON P.DEPARTMENTID = D.DEPARTMENTID;

-- 2. Find city & department wise total, average & maximum salaries.

SELECT D.DEPARTMENTNAME,P.CITY,SUM(P.SALARY) AS TOTAL_SAL,AVG(P.SALARY) AS AVG_SAL,MAX(P.SALARY) AS MAX_SAL FROM PERSON P JOIN DEPT D ON P.DEPARTMENTID = D.DEPARTMENTID GROUP BY D.DEPARTMENTNAME,P.CITY;

-- 3. Find all persons who do not belong to any department.

SELECT * FROM PERSON WHERE DEPARTMENTID IS NULL;

-- 4. Find all departments whose total salary is exceeding 100000.

SELECT D.DEPARTMENTNAME,SUM(P.SALARY) AS TOTAL_SAL FROM PERSON P JOIN DEPT D ON P.DEPARTMENTID = D.DEPARTMENTID GROUP BY D.DEPARTMENTNAME HAVING SUM(P.SALARY) > 100000;


----------------------PART-C------------------

-- 1. List all departments who have no person.

SELECT D.DEPARTMENTNAME FROM PERSON P JOIN DEPT D ON P.DEPARTMENTID = D.DEPARTMENTID GROUP BY D.DEPARTMENTNAME HAVING COUNT(P.PERSONID) = 0;

-- 2. List out department names in which more than two persons are working.

SELECT D.DEPARTMENTNAME,COUNT(P.PERSONID) FROM PERSON P JOIN DEPT D ON P.DEPARTMENTID = D.DEPARTMENTID GROUP BY D.DEPARTMENTNAME HAVING COUNT(P.PERSONID) > 2;

-- 3. Give a 10% increment in the computer department employee’s salary. (Use Update)

UPDATE PERSON SET SALARY = SALARY+0.1*SALARY FROM PERSON P JOIN DEPT D ON P.DEPARTMENTID = D.DEPARTMENTID WHERE D.DEPARTMENTNAME = 'COMPUTER';

SELECT * FROM PERSON;