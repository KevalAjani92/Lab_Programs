------PART-A
USE BTECH_3A_101;
--1
SELECT * FROM DEPOSIT

--2
SELECT * FROM BORROW

--3
SELECT * FROM CUSTOMERS

--4
SELECT ACTNO,CNAME,AMOUNT FROM DEPOSIT

--5
SELECT LOANNO,AMOUNT FROM BORROW

--6
SELECT * FROM BORROW WHERE BNAME = 'ANDHERI'

--7
SELECT ACTNO,AMOUNT FROM DEPOSIT WHERE ACTNO = 106

--8
SELECT CNAME FROM BORROW WHERE AMOUNT > 5000

--9
SELECT CNAME FROM DEPOSIT WHERE ADATE > '1996-12-01'

--10
SELECT CNAME FROM DEPOSIT WHERE ACTNO < 105

--11
SELECT CNAME FROM CUSTOMERS WHERE CITY = 'NAGPUR' OR CITY = 'DELHI'
-- WHERE CITY IN('NAGPUR' ,'DELHI')

--12
SELECT CNAME FROM DEPOSIT WHERE AMOUNT > 4000 AND ACTNO < 105

--13
SELECT CNAME FROM BORROW WHERE AMOUNT BETWEEN 3000 AND 8000
--WHERE AMOUNT > 3000 AND AMOUNT <8000

--14
SELECT CNAME FROM DEPOSIT WHERE NOT BNAME = 'ANDHERI'

SELECT CNAME FROM DEPOSIT WHERE BNAME <> 'ANDHERI'

--15
SELECT ACTNO,CNAME,AMOUNT FROM DEPOSIT
WHERE BNAME IN('AJNI', 'KAROLBAGH', 'M.G.ROAD') AND ACTNO < 104


-----PART-B

--1
SELECT TOP 5 * FROM DEPOSIT

--2
SELECT TOP 3 * FROM DEPOSIT WHERE AMOUNT > 1000

--3
SELECT TOP 5 LOANNO,CNAME FROM BORROW WHERE BNAME <> 'ANDHERI'

--4
SELECT DISTINCT CITY FROM CUSTOMERS

--5
SELECT DISTINCT BNAME FROM BRANCH

-----PART-C

--1
SELECT TOP 50 PERCENT * FROM BORROW

--2
SELECT TOP 10 PERCENT AMOUNT FROM DEPOSIT

--3
SELECT TOP 25 PERCENT CNAME FROM DEPOSIT WHERE AMOUNT > 5000

--4
SELECT TOP 10 PERCENT AMOUNT FROM BORROW

--5
SELECT DISTINCT CNAME ,CITY FROM CUSTOMERS

--6
SELECT *,(AMOUNT*1.1) AS 'EXTRA AMOUNT' FROM BORROW

--7
SELECT LOANNO AS 'EVEN LOAN NUMBER' FROM BORROW WHERE (LOANNO%2=0)
SELECT LOANNO AS 'ODD LOAN NUMBER' FROM BORROW WHERE (LOANNO%2<>0)
