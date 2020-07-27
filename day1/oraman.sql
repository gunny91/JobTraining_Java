--table name should be multiple
--Create table name(
    --colum_name1 type1,
    --colum_name1 type2,
--  ...
-- );
-- member : ID, name, age, entry date

create table members01(
    id varchar2(15), -- character is using varchar2(15-> ÀÚ¸®¼ö)
    name varchar2(100),
    age number,
    hire_date date    
);

--default value
--sysdate: current time
create table members02(
    id varchar2(15),
    name varchar2(100),
    age number default 10,
    hire_date date default sysdate 
);

-- primaray key: default key, must put and unique
-- enhance the searching speed, it generate the key by itself.

-- not null : must be entered colum!
create table members03(
    id varchar2(15) primary key,
    name varchar2(100) not null,
    age number default 10,
    hire_date date default sysdate
    
);

--Talbe that I owed table list command
--tab is user_tables synonyms
select * from tab;


--table structure show 
describe members02;


-- add data
insert into members03 values('kim','±èÃ¶¼ö',30,'20/07/27');
insert into members03 values('Park','¹Ú¿µÈÖ',30,'20/07/27');
commit;

describe members03;
select * from members03;
--table copy
--create table tablename
--as
--select * from tablename;


create table cloneTalbe
as
select * from members03;
select * from cloneTalbe;


create table cloneTalbeMember01
as
select * from members01;
describe clonetalbemember01


create table cloneTalbeMember02
as
select * from members02;
describe clonetalbemember02


--data exception, copy the structure
create table  members03_new
as
select * from members03
where 1 = 2; -->exception to just copy the structure
describe members03_new;

--delete the table == > drop

drop table members03_new;
drop table clonetalbemember01;
drop table clonetalbeMember02;
drop table clonetable;


--table structure change (alter)
--DDL = CREATE + ALTER + DROP + ...

-- add column
    --alter table tableName add(columname dataType);
--add colun hphone colum to members01 table
alter table members01 add(hphone varchar2(20));
describe members01

-- Modify column
    --alter table tableName modify(columname dataType);
alter table members01 modify(hphone varchar2(30));

--Change column name
    --alter table tablename rename column oldname to new name;
alter table member01 rename column hphone to myphone;
describe members01

-- Delete column
    --alter table tableName drop(columname dataType);
--remove the colum
--alter table members01 drop(hphone);
--describe members01















