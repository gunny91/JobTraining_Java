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

grant select,insert on books to myrole;

grant to myrole to practice;




