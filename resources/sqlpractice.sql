use database_ak;
show tables;
drop table laptop;
drop table student;
drop table hibernate_sequence;
CREATE TABLE employee (
	name varchar(25),
	age int,
	gender varchar(25));
ALTER TABLE employee
RENAME TO employee_information;
truncate table employee_information;

insert into employee_information values('venki',40,'M');
select * from employee_information;
drop table employee_information;
select distinct gender from employee_information;
select * from employee_information
where gender not IN('N');
select * from employee_information
where gender  IN('M');
