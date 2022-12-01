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
select *
  from
  (
    select
        sal
          ,dense_rank() over (order by sal desc) ranking
    from   table
  )
  where ranking = 4;-- Replace 4 with any value of N

  SELECT sal FROM (
      SELECT sal, row_number() OVER (order by sal desc) AS rn FROM emp
  )
  WHERE rn = 3;-- Replace 3 with any value of N

  show databases;

  use `awesome chocolates`;

  show tables;

  select * from sales ;
//to get sales desc order
  select * from sales order by Amount desc;
//to get the top 3 sales
  select Amount from (select Amount,row_number()  OVER (order BY Amount desc ) as cu from sales ) as s where cu BETWEEN  1 and 8;
  select Amount from (select Amount,row_number()  OVER (order BY Amount desc ) as cu from sales ) as s where cu=1;

   //truncate to delete all the data from the table
    truncate table tablename;

    //drop to delete the table
    drop table tablename;

    //delete to delete the data from the table
    delete from sales where id=1;

    //Find the third-highest salary from the EmployeeInfo table.
    select * from EmployeeInfo order by Salary desc limit 2,1;

    ✅Find the Nth highest salary from the table without using TOP/limit keyword.

    select * from EmployeeInfo e1 where 3 = (select count(distinct e2.Salary) from EmployeeInfo e2 where e2.Salary > e1.Salary);
    ✅Find duplicate rows in a table.
    select *,count(empid) from EmployeeInfo group by empid having count(empid)>1;
    ✅Calculate the even and odd records from a table.
    select * from EmployeeInfo where mod(empid,2)=0;
    ✅Display the first and the last record from the EmployeeInfo table.

    select * from EmployeeInfo where empid = (select min(empid) from EmployeeInfo);
    ✅How do you copy all rows of a table using SQL query?
    create table EmployeeInfo_copy as select * from EmployeeInfo;
    ✅Retrieve the list of employees working in the same department.

    select distinct e1.empid,e1.empname,e1.deptid,e2.empid,e2.empname,e2.deptid from EmployeeInfo e1,EmployeeInfo e2 where e1.deptid=e2.deptid and e1.empid<>e2.empid;
    ✅Retrieve the last 3 records from the EmployeeInfo table.
    select * from(select * from EmployeeInfo order by empid desc limit 3) as t order by empid asc;
    ✅Fetch details of employees whose EmpLname ends with an alphabet ‘A’ and contains five alphabets.
    select * from EmployeeInfo where empname like '%a' and length(empname)=5;



