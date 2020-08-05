--Synonym : Alias of each object

--select * from tab;

--admin session
gran create synonym to oraman;

--oraman session
select * from bigbang;

--my books is synonym of bigbang.books
create synonym mybook from bigbang.books;
select * from mybook;