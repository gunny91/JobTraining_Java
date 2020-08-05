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