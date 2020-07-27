--table name should be multiple
--Create table name(
    --colum_name1 type1,
    --colum_name1 type2,
--  ...
-- );
-- member : ID, name, age, entry date

create table members01(
    id varchar2(15), -- character is using varchar2(15-> 자리수)
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
