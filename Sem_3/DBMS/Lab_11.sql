USE BTECH_3A_101;

-------SQL JOINS------------

----------------------PART-A------------------

CREATE TABLE STU_INFO(
    RNO INT,
    NAME VARCHAR(20),
    BRANCH VARCHAR(5)
);

INSERT INTO STU_INFO VALUES
(101,'RAJU','CE'),
(102,'AMIT','CE'),
(103,'SANJAY','ME'),
(104,'NEHA','EC'),
(105,'MEERA','EE'),
(106,'MAHESH','ME');

SELECT * FROM STU_INFO;

CREATE TABLE RESULT(
    RNO INT,
    SPI DECIMAL(4,2)
);

INSERT INTO RESULT VALUES
(101,8.8),
(102,9.2),
(103,7.6),
(104,8.2),
(105,7.0),
(107,8.9);

SELECT * FROM RESULT;

CREATE TABLE EMPLOYEE_MASTER(
    EMPLOYEENO VARCHAR(5),
    NAME VARCHAR(20),
    MANAGERNO VARCHAR(5)
);

INSERT INTO EMPLOYEE_MASTER VALUES
('E01','TARUN',NULL),
('E02','ROHAN','E02'),
('E03','PRIYA','E01'),
('E04','MILAN','E03'),
('E05','JAY','E01'),
('E06','ANJANA','E04');

SELECT * FROM EMPLOYEE_MASTER;

-- 1. Combine information from student and result table using cross join or Cartesian product.

SELECT * FROM STU_INFO CROSS JOIN RESULT;

-- 2. Perform inner join on Student and Result tables.

SELECT * FROM STU_INFO JOIN RESULT ON STU_INFO.RNO = RESULT.RNO;

-- 3. Perform the left outer join on Student and Result tables.

SELECT * FROM STU_INFO LEFT JOIN RESULT ON STU_INFO.RNO = RESULT.RNO;

-- 4. Perform the right outer join on Student and Result tables.

SELECT * FROM STU_INFO RIGHT JOIN RESULT ON STU_INFO.RNO = RESULT.RNO;

-- 5. Perform the full outer join on Student and Result tables. 

SELECT * FROM STU_INFO FULL OUTER JOIN RESULT ON STU_INFO.RNO = RESULT.RNO;

-- 6. Display Rno, Name, Branch and SPI of all students.

SELECT S.RNO,S.NAME,S.BRANCH,R.SPI FROM STU_INFO AS S LEFT JOIN RESULT AS R ON S.RNO = R.RNO;

-- 7. Display Rno, Name, Branch and SPI of CE branch’s student only.

SELECT S.RNO,S.NAME,S.BRANCH,R.SPI FROM STU_INFO AS S LEFT JOIN RESULT AS R ON S.RNO = R.RNO WHERE S.BRANCH = 'CE';

-- 8. Display Rno, Name, Branch and SPI of other than EC branch’s student only.

SELECT S.RNO,S.NAME,S.BRANCH,R.SPI FROM STU_INFO AS S LEFT JOIN RESULT AS R ON S.RNO = R.RNO WHERE S.BRANCH <> 'EC';

-- 9. Display average result of each branch.

SELECT S.BRANCH,AVG(R.SPI) AS AVG_SPI FROM STU_INFO AS S LEFT JOIN RESULT AS R ON S.RNO = R.RNO GROUP BY S.BRANCH;

-- 10. Display average result of CE and ME branch.

SELECT S.BRANCH,AVG(R.SPI) AS AVG_SPI FROM STU_INFO AS S LEFT JOIN RESULT AS R ON S.RNO = R.RNO WHERE S.BRANCH IN ('CE','ME') GROUP BY S.BRANCH;


----------------------PART-B------------------

-- 1. Display average result of each branch and sort them in ascending order by SPI.

SELECT S.BRANCH,AVG(R.SPI) AS AVG_SPI FROM STU_INFO AS S JOIN RESULT AS R ON S.RNO = R.RNO GROUP BY S.BRANCH ORDER BY AVG(R.SPI);

-- 2. Display highest SPI from each branch and sort them in descending order.

SELECT S.BRANCH,MAX(R.SPI) AS AVG_SPI FROM STU_INFO AS S LEFT JOIN RESULT AS R ON S.RNO = R.RNO GROUP BY S.BRANCH ORDER BY MAX(R.SPI) DESC;


----------------------PART-C------------------

-- 1. Retrieve the names of employee along with their manager’s name from the Employee table.

SELECT E1.NAME AS EMPLOYEE_NAME , E2.NAME AS MANAGER_NAME FROM EMPLOYEE_MASTER E1 INNER JOIN EMPLOYEE_MASTER E2 ON E1.MANAGERNO = E2.EMPLOYEENO;

