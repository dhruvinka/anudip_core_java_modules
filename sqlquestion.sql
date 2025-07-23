Question:
create student table contains columns id int primary key,name varchar(10) not null,address varchar(10) not null,age int not null.
 insert 5 records in student tables .
 and perform all aggregate function (sum,avg,min,max.count)in age column.

//creating the table

CREATE TABLE student (
  id INT PRIMARY KEY,
  name VARCHAR(10) NOT NULL,
  address VARCHAR(10) NOT NULL,
  age INT NOT NULL
);


shoe desc;

id	int	NO	PRI		
name	varchar(10)	NO			
address	varchar(10)	NO			
age	int	NO			


// inserting the record into the student table


INSERT INTO student (id, name, address, age) VALUES
(1, 'dhruvin', 'Rajkot', 21),
(2, 'dhruv', 'Ahmedabad', 22),
(3, 'omm', 'Surat', 20),
(4, 'jay', 'Vadodara', 23),
(5, 'pintoo', 'Bhavnagar', 19);


select * from student ;

id      name    address         age
1	dhruvin	Rajkot	        21
2	dhruv	Ahmedabad	22
3	omm	Surat	        20
4	jay	Vadodara	23
5	pintoo	Bhavnagar	19


//aggregate function

SELECT sum(age) FROM student;
SELECT min(age) FROM student;
SELECT max(age) FROM student;
SELECT avg(age) FROM student;
SELECT count(age) FROM student;


