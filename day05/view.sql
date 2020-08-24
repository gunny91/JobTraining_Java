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
