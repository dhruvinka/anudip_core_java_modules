1.Consider two tables, customers and orders, with the following structures:
 Customers Table:
 customer_id (Primary Key)
 first_name
 Last_name
 Orders Table:
 order_id (Primary Key)
 customer_id (Foreign Key)
 order_date
 Total_amount



CREATE TABLE Customers (
  customer_id INT PRIMARY KEY,
  first_name VARCHAR(50),
  last_name VARCHAR(50)
);

	
desc Customers;

customer_id	int	NO	PRI	
first_name	varchar(50)	YES		
last_name	varchar(50)	YES	



CREATE TABLE Orders (
  order_id INT PRIMARY KEY,
  customer_id INT,
  order_date DATE,
  total_amount DECIMAL(10, 2),
  FOREIGN KEY (customer_id) REFERENCES Customers(customer_id)
);

desc Orders;

order_id	int	NO	PRI		
customer_id	int	YES	MUL		
order_date	date	YES			
total_amount	decimal(10,2)	YES	



Write an SQL query to retrieve the first and last names of customers along with the
 order date and total amount of their orders. Use an INNER JOIN to connect the two
 tables. 

SELECT 
  Customers.first_name,
  Customers.last_name,
  Orders.order_date,
  Orders.total_amount
FROM 
  Customers
INNER JOIN 
  Orders ON Customers.customer_id = Orders.customer_id;

first_name last_name    order_date      total_amount
Aarav	   Patel	2025-07-20	2500.00
Aarav	   Patel	2025-07-24	2100.00
Riya	    Shah	2025-07-21	1800.50
Kabir	   Mehta	2025-07-22	3200.75
Anaya	   Joshi	2025-07-23	1450.20



 2.Consider two tables, departments and employees, with the following structures:
 Departments Table:
 department_id (Primary Key)
 department_name
 Employees Table:
 employee_id (Primary Key)
 first_name
 last_name
 department_id (Foreign Key)




CREATE TABLE Departments (
  department_id INT PRIMARY KEY,
  department_name VARCHAR(100)
);

desc Departments;

department_id	int	NO	PRI
department_name	varchar(100)	YES	


CREATE TABLE Employees (
  employee_id INT PRIMARY KEY,
  first_name VARCHAR(50),
  last_name VARCHAR(50),
  department_id INT,
  FOREIGN KEY (department_id) REFERENCES Departments(department_id)
);


desc Employees;

employee_id	int	NO	PRI
first_name	varchar(50)	YES	
last_name	varchar(50)	YES	
department_id	int	YES	MUL



 Write an SQL query to retrieve a list of all departments and the names of employees
 who belong to each department. Use a LEFT JOIN to include departments that have no
 employees



Human Resources	Riya	Verma
Finance	Kabir	Gupta
Engineering	Aarav	Singh
Engineering	Anaya	Mishra
Marketing	Vivaan	Rathore
Customer Support		
			
