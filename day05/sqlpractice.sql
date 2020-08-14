--sub quary
-- 최저 단가를 가지고 서적의 정보를 출력해 보세요.
select * from books where price = (select min(price) from books);

-- 평균 단가보다 적은 단가를 가지는 서적들만 조회해 보세요.
select * from books where price < (select avg(price) from books);

-- 주문한 내역이 있는 사원들의 이름과 전화 번호를 조회해 보세요.
select * from customers where  custid in (select custid from orders);
-- 주문한 내역이 한번도 없는 서적들의 정보를 출력해 보세요.
select * from books where bookid not in(select bookid from orders);

-- 다음 문장들을 수행하세요.
create table book01
as
select bookid, bookname, publisher, price
from books
where bookid between 1 and 4 ;

create table book02
as
select bookid, bookname, publisher, price
from books
where bookid between 4 and 6 ;

-- book01, book02 테이블에 대한 집합 연산 실습을 수행해 보세요.

--union
select  bookid, bookname, publisher, price from book01
union
select  bookid, bookname, publisher, price from book02;

--intersept
select  bookid, bookname, publisher, price from book01
intersect
select  bookid, bookname, publisher, price from book02;

-- 뷰
출판사 '굿스포츠'의 책이름과 단가를 출력해주는 뷰 view01을 작성해 보세요.
create or replace view view21
as 
select bookname, price from books
where publisher in('굿스포츠');


-- 다음 요구 사항대로 출력해주는 뷰 view02을 작성해 보세요.  
-- 출판사별로 책들의 단가의 총합을 구하되, '대한미디어'는 제외하도록 하고, 단가의 총합이 큰 것부터 정렬하세요.
create or replace view view022
as 
select publisher pub, sum(price) sum from books
where publisher not in('대한미디어')
group by publisher
order by sum desc;


create or replace view view012
as 
select publisher pub, sum(price) sum from books
--where publisher not in('대한미디어')
group by publisher
having publisher not in('대한미디어')
order by sum desc;




-- 출판사별로 책들의 단가의 총합을 구해주는 뷰 view03을 작성해 보세요.
create or replace view view003
as 
select publisher , sum(price) sum from books
group by publisher;

select * from view003;



-- books 테이블에 50건의 데이터를 인서트 하세요.
-- 이 데이터를 사용하여 top-n 구문을 구현해 보세요.


select bookname ,	publisher ,	price, bookCount 
from (select bookcount, rank() over(order by bookcount asc) as ranking ,bookname ,	publisher ,	price
        from anotherbooks)
where ranking between 1 and 10;

