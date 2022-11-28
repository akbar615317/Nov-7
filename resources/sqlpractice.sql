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


