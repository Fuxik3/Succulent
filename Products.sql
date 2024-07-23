Create Database J6S5
Go
Use  J6S5
Go

CREATE TABLE [dbo].[Categories](
	Id Nvarchar(50) NOT NULL Primary Key,
	Name Nvarchar(255) NULL
)
GO

CREATE TABLE [dbo].[Products](
	Id Int IDENTITY(1,1) NOT NULL Primary Key,
	Name Nvarchar(255) NULL,
	Image Nvarchar(255) NULL,
	Price Float NULL,
	Createdate Date NULL,
	Available Bit NULL,
	Categoryid Nvarchar(50) NULL FOREIGN KEY REFERENCES [dbo].[Categories] (Id)
) 
GO

CREATE TABLE [dbo].[Accounts](
	Username Nvarchar(50) NOT NULL  Primary Key,
	Password Nvarchar(255) NULL,
	Fullname Nvarchar(255) NULL,
	Email Nvarchar(255) NULL,
	Photo Nvarchar(255) NULL,
)
GO

CREATE TABLE [dbo].[Orders](
	Id Int IDENTITY(1,1) NOT NULL Primary Key,
	Username Nvarchar(50) NULL FOREIGN KEY REFERENCES [dbo].[Accounts] (Username),
	Createdate Date NULL,
	Address Nvarchar(255) NULL,
)
GO

CREATE TABLE [dbo].[Orderdetails](
	Id Int IDENTITY(1,1) NOT NULL,
	Price Float NULL,
	Quantity Int NULL,
	Orderid Int NULL FOREIGN KEY REFERENCES [dbo].[Orders] (Id),
	Productid Int NULL FOREIGN KEY REFERENCES [dbo].[Products] ([Id])
)
GO