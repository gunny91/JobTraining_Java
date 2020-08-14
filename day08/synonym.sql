--Synonym : Alias of each object

--select * from tab;

--admin session
gran create synonym to oraman;

--oraman session
select * from bigbang;

--my books is synonym of bigbang.books
create synonym mybook from bigbang.books;
select * from mybook;


--Using role
-- bigbang user create myrole.
--myrole includes with select and other priviligies
--myrole grant to practice
--Check that practice user can select books 

--1. admin session
grant create role to bigbang;

--2. bigbang session
create role myrole;

--give the permission to select and insert on books
grant select,insert on books to myrole;

grant to myrole to practice;




--1. create new user kim and table space user, quota is unlimited
--admin session
create user Lee identified by oracle password expire
quota unlimited on users
account unlock;
grant create session to Lee;

alter user Lee
identified by soo1234;



create user kim identified  by oracle 
quota unlimited on users
account unlock;
grant create session to kim;
--2. expire the password and chang it to soo1234
--admin session
grant resource to kim;

alter user kim 
identified by soo1234 
password expire;


--practice session
grant select on books to kim;

--kim session
select * from practice.books;

--admin
grant create synonym to kim;

--kim
create synonym mybook for practice.books;

