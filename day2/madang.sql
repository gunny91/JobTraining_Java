create table books (bookid NUMBER(5), bookname varchar2(30), publisher varchar2(30), price number(10));

select * from books;
desc books;
create sequence seqboard; 

insert into books(bookid, bookname,publisher, price )
values(seqboard.nextval, '축구의 역사', '굿스포츠',7000); 

insert into books(bookid, bookname,publisher, price )
values(seqboard.nextval, '축구아는 여자', '나무수',17000); 

insert into books(bookid, bookname,publisher, price )
values(seqboard.nextval, '축구의 이해', '대한미디어',22000); 

insert into books(bookid, bookname,publisher, price )
values(seqboard.nextval, '골프 바이블', '대한미디어',35000); 

insert into books(bookid, bookname,publisher, price )
values(seqboard.nextval, '피겨 교본', '굿스포츠',8000);

insert into books(bookid, bookname,publisher, price )
values(seqboard.nextval, '역도의 단계별기술', '굿스포츠',6000);

insert into books(bookid, bookname,publisher, price )
values(seqboard.nextval, '야구의 추억', '이상미디어',20000); 

insert into books(bookid, bookname,publisher, price )
values(seqboard.nextval, '야구를 부탁해', '이상미디어',13000); 

insert into books(bookid, bookname,publisher, price )
values(seqboard.nextval, '올림픽 이야기', '삼성당',7500); 

insert into books(bookid, bookname,publisher, price )
values(seqboard.nextval, 'Olympic Champions', 'Pearson',13000); 

select * from books;

create sequence seqmember; 
create table members (custid number(10), name varchar2(40), address varchar2(50), phone varchar(60) );

insert into members (custid, name, address, phone )
values(seqmember.nextval, '박지성', '영국 맨체스타',010-2222-112323);
update members set phone='010-2323-4454' where name= '박지성';
rollback;
insert into members (custid, name, address, phone)
values(seqmember.nextval, '김연아','대한민국 서울', '010-4234-5567');

insert into members (custid, name, address, phone)
values(seqmember.nextval, '장미란','대한민국 강원도', '010-7000-0001');

insert into members (custid, name, address, phone)
values(seqmember.nextval, '추신수','미국 클리블랜드', '515-8000-0001');

insert into members (custid, name, address, phone)
values(seqmember.nextval, '박세리','대한민국 대전','' );

--update members set phone=(not null) where name= '박지성';
--alter table members modify(phone varchar(50)not null);
select * from members;


create table orders(orderid number(5), custid number(5), bookid number(5),saleprice number(10), orderdate date);
create SEQUENCE seqorder;

insert into orders(orderid, custid,bookid, saleprice, orderdate)
values(seqorder.nextval, 1,1,6000, '2020-07-01');

insert into orders(orderid, custid,bookid, saleprice, orderdate)
values(seqorder.nextval, 1,3,21000, '2020-07-03');

insert into orders(orderid, custid,bookid, saleprice, orderdate)
values(seqorder.nextval, 2,5,8000, '2020-07-03');

insert into orders(orderid, custid,bookid, saleprice, orderdate)
values(seqorder.nextval, 3,6,6000, '2020-07-04');

insert into orders(orderid, custid,bookid, saleprice, orderdate)
values(seqorder.nextval, 4,7,8000, '2020-07-05');

insert into orders(orderid, custid,bookid, saleprice, orderdate)
values(seqorder.nextval, 1,2,12000, '2020-07-07');

insert into orders(orderid, custid,bookid, saleprice, orderdate)
values(seqorder.nextval, 4,8,13000, '2020-07-13');

insert into orders(orderid, custid,bookid, saleprice, orderdate)
values(seqorder.nextval, 3,10,12000, '2020-07-08');

insert into orders(orderid, custid,bookid, saleprice, orderdate)
values(seqorder.nextval, 2,10,7000, '2020-07-09');

insert into orders(orderid, custid,bookid, saleprice, orderdate)
values(seqorder.nextval, 3,8,13000, '2020-07-10');

select * from orders;
select * from members;
select * from books;

select bookname, price from books ;
select bookname, price*0.9 from books ;
select * from books order by price asc;
select * from books order by bookname desc;

select  bookname as "책 이름" , price 가격 from books ;
select bookname, price from books where  price is not null; 
select * from books where bookid =3;

select * from books where bookname ='축구의 이해';
select * from books where bookid= 1 or bookname  ='축구의 역사';

select * from books where bookid in(1,3);
select * from books where bookname = '골프 바이블' or bookname ='야구의 추억';
select * from books where bookname like  '%구%';
select*from books where bookname like '피%';

select*from books where bookname like '%기';

select*from books where bookname like '_겨%';
select * from books where bookname like '피%기'; 

select *from books where bookname like '%구%' and bookid > 5 ;

select * from books where bookid between 3 and 5;
select * from books 
where bookname between '시' and '지';


select bookname, price*1.1 from books ;
select price*1.1 from books;
rollback;

update books set price=price*1.1;
select *from books;

update books set price= price+100
where bookid=3;
select * from books;

update books set price = price*2
where bookid >=6;
select * from books;

update books name set publisher = '사이버출판사'
where publisher = '대한미디어';
select * from books;
rollback;
update books name set price = price+300
where price <=10000;
select * from books;

commit;
delete from books 
where  bookid = 1 or bookid =3; 
select * from books;

commit;

rollback;

delete from books
where mod(bookid, 2) =1;
select * from books;
rollback;


