
CREATE TABLE PersonInfo ( 
	PersonID INT PRIMARY KEY, 
	PersonName VARCHAR(100) NOT NULL, 
	Salary DECIMAL(8,2) NOT NULL, 
	JoiningDate DATETIME NULL, 
	City VARCHAR(100) NOT NULL, 
	Age INT NULL, 
	BirthDate DATETIME NOT NULL 
); 

CREATE TABLE PersonLog ( 
	PLogID INT PRIMARY KEY IDENTITY(1,1), 
	PersonID INT NOT NULL, 
	PersonName VARCHAR(250) NOT NULL, 
	Operation VARCHAR(50) NOT NULL, 
	UpdateDate DATETIME NOT NULL, 
); 

---------Part-A-------------
--1. Create a trigger that fires on INSERT, UPDATE and DELETE operation on the PersonInfo table to display a message “Record is Affected.”  

Create Trigger TR_PersonInfo_Insert_Update_Delete
On PersonInfo
After Insert, Update, Delete
As
Begin
	Print 'Record is Affected'
End

Insert Into PersonInfo Values (1, 'Keval', 20000, '1998-05-01', 'Rajkot', 19, '2006-02-09')
Select * From PersonInfo

Update PersonInfo Set PersonID = 2 Where PersonName = 'Keval'
Select * From PersonInfo

Delete From PersonInfo Where PersonID = 2
Select * From PersonInfo

Drop Trigger TR_PersonInfo_Insert_Update_Delete


--2. Create a trigger that fires on INSERT, UPDATE and DELETE operation on the PersonInfo table. For that, log all operations performed on the person table into PersonLog. 

Create Trigger TR_PersonInfo_Insert
On PersonInfo
After Insert
As
Begin
	Declare @PersonID Int, @PersonName Varchar(250)

	Select @PersonID = PersonID, @PersonName = PersonName From Inserted

	Insert Into PersonLog Values (@PersonID, @PersonName, 'Insert', GetDate())
End

Insert Into PersonInfo Values (1, 'Keval', 20000, '1998-05-01', 'Rajkot', 19, '2006-02-09')
Select * From PersonInfo
Select * From PersonLog

Drop Trigger TR_PersonInfo_Insert

-----------Update

Create Trigger TR_PersonInfo_Update
On PersonInfo
After Update
As
Begin
	Declare @PersonID Int, @PersonName Varchar(250)

	Select @PersonID = PersonID, @PersonName = PersonName From Inserted

	Insert Into PersonLog Values (@PersonID, @PersonName, 'Update', GetDate())
End

Update PersonInfo Set PersonID = 3 Where PersonName = 'Keval'
Select * From PersonInfo
Select * From PersonLog

Drop Trigger TR_PersonInfo_Update

-----------Delete

Create Trigger TR_PersonInfo_Delete
On PersonInfo
After Delete
As
Begin
	Declare @PersonID Int, @PersonName Varchar(250)

	Select @PersonID = PersonID, @PersonName = PersonName From Deleted

	Insert Into PersonLog Values (@PersonID, @PersonName, 'Delete', GetDate())
End

Delete From PersonInfo Where PersonID = 3
Select * From PersonInfo
Select * From PersonLog

Drop Trigger TR_PersonInfo_Delete

--3. Create an INSTEAD OF trigger that fires on INSERT, UPDATE and DELETE operation on the PersonInfo table. For that, log all operations performed on the person table into PersonLog. 



--4. Create a trigger that fires on INSERT operation on the PersonInfo table to convert person name into uppercase whenever the record is inserted. 
--5. Create trigger that prevent duplicate entries of person name on PersonInfo table. 
--6. Create trigger that prevent Age below 18 years.