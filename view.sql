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




--when column is not matched, we can just make it
-- put order by at the end 
select id 아이디, name 이름, salary 급여, '' 주소 from mem01
union all
select id, name, salary, address from mem02
order by 3 desc;

-- view : virtual table of logis 
-- purpose 
        -- limitation : Not allowed the direct access or not allow to show the specific columns
        -- Make it shows simply 
-- note
        -- user can get the view creation authorization
        -- grant create view to oraman;
        -- desc view name;
        -- sekect * from viewname;
        -- dml some part ok
        -- alias can be used at operation or function

    -- create [or replace] view viewname
    -- as
    -- select ~~~;


--view01: workers id, name, address
--grant create view to oraman; at admin
create or replace view view01 
as 
select upper(id) as uppid, name, address from members;
select * from members;
select * from tab;
select * from view01;
desc view01;

insert into view01 values('hahahaha', 'MFS', 'Ganam style');




create or replace view view02
as 
select id, name, address from members;
insert into view02 values('haha', 'MFG', 'GangNam style');
select  * from view02;

--(complex) member and boards join 
create or replace view view03
as 
select m.id, m.name, b.subject, b.content
from members m join boards b
on m.id = b.writer;

select *from view03;

-- dictionary view : data dictionary
    -- To manage oracle's object information
    -- used_something
    -- user_constraints
    select *from user_tables;
    select *from user_sequences;
    select * from user_indexes;
    select * from user_views;
    select * from user_constraints;
  --  select * from DBA_tables;
desc user_tables;
desc user_views;

select view_name, text from user_views;

select view_name, text from user_views
where view_name ='view01';
-- object name must be capitalized
select view_name, text from user_views
where view_name ='VIEW01';
-- afternoon 2pm!
-- top N statement
-- on some table, we are using ranking to deal with uper Nth data
-- usage : web programming's paging
-- how to write?
    -- sub quary select ...from (select.. from table)
    -- inline view --> lined on the select
    --select ... from (select ... from table)
    
select * from boards;

-- top n practice
delete from boards;

alter table boards add(no number);
create sequence boardseq; 

begin
        for i in 1..30 loop
            insert into boards 
            values('hong', 'aa','111','haha',0, boardseq.nextval);
        end loop;
end;
/
commit;
select * from boards;

--top n statement
--rank() over(order by something [desc/asc]) as name
select no, rank() over(order by no desc) as ranking, writer, subject, password, content, readhit
from boards;

select no, writer, subject, password, content, readhit
from (select no, rank() over(order by no desc) as ranking,
        writer, subject, password, content, readhit
        from boards)
where ranking between 1 and 10;



























    
























--DCL  
--      Data Control Language 
--      Give the permission to objectm and use/control it

--Privilege
    -- Range between ability from data base.
    -- ctreate, delete, sequence ... etc
    
    --grant : Give the permission to User or object 
    --revoke : Revoke the permission

-- role : Bundle of several privileges
    --connect : create session ->> only one
    --resource : create table/delete/update, index etc...

--create user practice identified by oracle account unlock;
--alter user practice default tablespace users;
--grant connect, resource to practice;


--table space
    --Stored the data bases's object(table, index etc...) like logical storage
    --system ,users table space's default value is system.
--Quota 
    --privilege user can use (OS's sotrage)
    
--create user bigbang
--Copy the madang.books table (테이블 복제)
--oraman user grant the privilege of select members table to bigbang.

--admin session  system privilege (create session)
create user bigbang identified  by oracle 
quota unlimited on users
account unlock;
grant create session to bigbang;


--practice session  
-- madang give a permission to bigbang to select books table in practice 
    
-- object privilege
-- grant select on books to bigbang;
    
-- bigbang session
-- see the practice's books list
select * from practice.books;

-- table copy
create table books
as
select * from practice.books;
--    오류 보고 -
--ORA-01031: insufficient privileges
--01031. 00000 -  "insufficient privileges"
--*Cause:    An attempt was made to perform a database operation without
--           the necessary privileges.
--*Action:   Ask your database administrator or designated security
--           administrator to grant you the necessary privileges

--so, we move on to adimin
-- admin session
--Give the resource role to bigbang  
grant resource to bigbang;

--bigbang session 
-- reconnect the session, and excute it again.
create table books
as
select * from bigbang.books;

select * from bigbang.books;

--bigbang session
grant select on books to oraman;

--oraman select * from bigbang.books;

--oraman session
grant select on members to bigbang;

-- big bang session
select * from oraman.members;




--allow bigbang user to select the members table
grant select on members to bigbang;

    
    




















