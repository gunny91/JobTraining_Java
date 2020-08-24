-- datapump : change the data to binary value
select * from members;

-- find max salary
-- where to find max
select max(salary) from members;
select * from members where salary = 400;


-- Single row sub quray : searching resulting will be 1
-- Usable operation : =, >=, > , < , <=, <>

select * from members -- >>main quary
where salary = (select max(salary) -- >>sub quary
                from members);

--who get the more salray from avg salaray 
select * from members where salary > (select avg(salary) from members);


select * from members;
-- get name, ID and address who wrote the [spt
select * from boards;

select distinct writer from boards ;

--multiple sub-quary
select id, name, address
from members
where id in (select distinct writer from boards);



--set union, intersept, minus

create table mem01 
as 
select id, name ,salary 
from members 
where id in ('hong', 'park', 'kim');

select * from mem01;

create table mem02
as 
select id, name ,salary, address 
from members 
where id in ('hong', 'choi');

select * from mem02;

--column number need to be matched!!!
select id, name, salary from mem01
union 
select id, name, salary from mem02;

select id, name, salary from mem01
union all 
select id, name, salary from mem02;

select id, name, salary from mem01
intersect
select id, name, salary from mem02;

select id, name, salary from mem01
minus 
select id, name, salary from mem02;




