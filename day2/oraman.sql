--dml : insert, update, delete

--warning! commit or rollback must be processed! 

--tcl 
    --commit : dml is the act to store the work 
    --rollback : dml work cancel

--transaction
-- start : the fist dml sentence
-- end : commit /rollback excution

--Stringm,date must be ''
-- each sentence must be end with ; 

--insert 
--insert into tablename(column) values(values)

--insert into members01(ID, NAME , AGE, HIRE_DATE)
--values('hong', 'gillDong',100,'20/07/28');
--rollback;
--select * from members01;


--column name express
insert into members01(ID, NAME , AGE, HIRE_DATE)
values('hong', 'gillDong',100,'20/07/28');


--When we did not mark column name as table, it is inserted by order that we generated
insert into members01
values('Park', 'nimiral',400,'20/07/28');

--column name can make as developer's favorite
insert into members01( AGE, HIRE_DATE,ID, NAME)
values(100, '20/07/28','hong' , 'gillDong');

commit;
select * from members01;
desc members01;

--null data insert
insert into members01(ID, NAME , AGE)
values('Isds', 'NAm',100);
select * from members01;

--add null data
insert into members01(ID, NAME , AGE, hire_date)
values('Isds', 'NAm', null, null);
select * from members01;

commit;

--when it has a data already
insert into members02(id,name)
values('Moon','Jeang');
select * from members02;


--using default
insert into members02(id,name,age, hire_date)
values('Noo','Allra',default, default);

commit;
select * from members02;



-- basic key and not null column table
insert into members03( ID, NAME, AGE, HIRE_DATE)
values('hong' , 'gillDong',100, '20/07/28');

--basic key must be enetered, not not repeated
insert into members03( ID, NAME, AGE, HIRE_DATE)
values('hong' , 'gillDong',100, '20/07/28');
--ORA-00001: unique constraint (ORAMAN.SYS_C006997) violated

--null entered
insert into members03( ID, NAME, AGE, HIRE_DATE)
values(null , 'gillDong',100, '20/07/28');
--ORA-01400: cannot insert NULL into ("ORAMAN"."MEMBERS03"."ID")


insert into members03( ID, NAME, AGE, HIRE_DATE)
values('Kim' , null,100, '20/07/28');
--ORA-01400: cannot insert NULL into ("ORAMAN"."MEMBERS03"."NAME")


select * from members03;

--for update, make a new table
--Members04 = Members01+Members02 + Members03;
create table members04
as
select * from members01
union
select * from members02
union
select * from members03;

--column unit update;
--update table name set column1 = value1, column2 = value2...
--[where condition];
--change all workers age as 20
update members04 set age =20;
select * from members04;

--change all workers age to 230, hire_date 12/25
update members04 set age =30, hire_date = '20/12/25';
select * from members04;
rollback;


--age change at Isda NAM
update members04 set age =30
where name = 'NAm';
-- = --> equal
-- >, < , <=, >=, <>
--and(&&) , or(||) operator

--age under 100, hire_date 20/08/15
update members04 set hire_date= '20/08/15'
where age <100;
select * from members04;
rollback;

--name 'NAm' or age is 30 --> change their hire_date as 20/11/11
update members04 set hire_date = '20/11/11'
where (age =30) or(name ='NAm');

select * from members04;
rollback;





commit;
