Create Database J6S5
Go
Use  J6S5
Go
Create Table Students(
	Email Nvarchar(50) Primary Key,
	Fullname Nvarchar(50) ,
	Marks Float,
	Gender Bit,
	Country Nvarchar(2)
)
-- Student 1
INSERT INTO Students (Email, Fullname, Marks, Gender, Country)
VALUES ('student1@example.com', 'John Doe', 85.5, 0, 'US');

-- Student 2
INSERT INTO Students (Email, Fullname, Marks, Gender, Country)
VALUES ('student2@example.com', 'Jane Smith', 78.2, 1, 'CA');

-- Student 3
INSERT INTO Students (Email, Fullname, Marks, Gender, Country)
VALUES ('student3@example.com', 'Alice Johnson', 92.0, 1, 'GB');

-- Student 4
INSERT INTO Students (Email, Fullname, Marks, Gender, Country)
VALUES ('student4@example.com', 'Bob Brown', 65.8, 0, 'AU');

-- Student 5
INSERT INTO Students (Email, Fullname, Marks, Gender, Country)
VALUES ('student5@example.com', 'Emily Davis', 88.9, 1, 'NZ');

Select * From Students