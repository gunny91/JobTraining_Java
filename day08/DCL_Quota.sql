--bigbang quota limit as 1MB
alter user bigbang 
default tablespace users
quota 1m on users;


--bigbang session
create table a(
    id varchar2(100),
    num number
);

insert into a values('abc',100);

insert into a
select * from a; -->> insert data 

select * from a;

---------------quota -----------------------------
--admin session
create user cho identified by oracle
default tablespace users
quota 1m on users
account unlock ;

create role myrole;
grant create session, create table to myrole;
--roll priviligy list
select * from role_sys_privs
where role ='MYROLE';

--grant role to user
grant myrole to cho, Lee, practice;

-- add create view privilege (3 people can get it)
grant create view to myrole;
grant create synonym to myrole;


------------------------------system TBS (Table space)----------------
alter user park
quota 0m on system;



------------------------------Cho session----------------------
--cho session

create table a(
id varchar2(10)
);
insert into a values('my g');
commit;

select * from a;

create or replace view someview
as
select * from a;
--need more privileges!!
--오류 보고 -
--ORA-01031: insufficient privileges
--01031. 00000 -  "insufficient privileges"
--*Cause:    An attempt was made to perform a database operation without
--           the necessary privileges.
--*Action:   Ask your database administrator or designated security
--           administrator to grant you the necessary privileges


create or replace view someview
as
select * from a;
--View SOMEVIEW이(가) 생성되었습니다.

--create synonym 
create synonym mysyn 
for a;
--Synonym MYSYN이(가) 생성되었습니다.

select * from mysyn;


-------------------admin-----------------
alter user cho 
quota unlimited on users;



-------------------Cho ---------------------------

begin 
    for i in 1..30 loop
            insert into a select * from a;
    end loop;
end;
/

----working!



-----------------------Park resign the user -------------------------------

-------------------admin-----------------
-- check wether park's session is on the database or not.
--cascade option : delete all table related objects
drop user park cascade;







