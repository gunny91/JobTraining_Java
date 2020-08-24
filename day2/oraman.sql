--dml : insert, update, delete

--warning! commit or rollback must be processed! 

--tcl 
    --commit : dml is the act to store the work 
    --rollback : dml work cancel

--transaction
-- start : the fist dml sentence
-- end : commit /rollback excution

--Stringm,date must be ''
-- each sentence must be end with ; 

--insert 
--insert into tablename(column) values(values)

--insert into members01(ID, NAME , AGE, HIRE_DATE)
--values('hong', 'gillDong',100,'20/07/28');
--rollback;
--select * from members01;


--column name express
insert into members01(ID, NAME , AGE, HIRE_DATE)
values('hong', 'gillDong',100,'20/07/28');


--When we did not mark column name as table, it is inserted by order that we generated
insert into members01
values('Park', 'nimiral',400,'20/07/28');

--column name can make as developer's favorite
insert into members01( AGE, HIRE_DATE,ID, NAME)
values(100, '20/07/28','hong' , 'gillDong');

commit;
select * from members01;
desc members01;

--null data insert
insert into members01(ID, NAME , AGE)
values('Isds', 'NAm',100);
select * from members01;

--add null data
insert into members01(ID, NAME , AGE, hire_date)
values('Isds', 'NAm', null, null);
select * from members01;

commit;

--when it has a data already
insert into members02(id,name)
values('Moon','Jeang');
select * from members02;


--using default
insert into members02(id,name,age, hire_date)
values('Noo','Allra',default, default);

commit;
select * from members02;



-- basic key and not null column table
insert into members03( ID, NAME, AGE, HIRE_DATE)
values('hong' , 'gillDong',100, '20/07/28');

--basic key must be enetered, not not repeated
insert into members03( ID, NAME, AGE, HIRE_DATE)
values('hong' , 'gillDong',100, '20/07/28');
--ORA-00001: unique constraint (ORAMAN.SYS_C006997) violated

--null entered
insert into members03( ID, NAME, AGE, HIRE_DATE)
values(null , 'gillDong',100, '20/07/28');
--ORA-01400: cannot insert NULL into ("ORAMAN"."MEMBERS03"."ID")


insert into members03( ID, NAME, AGE, HIRE_DATE)
values('Kim' , null,100, '20/07/28');
--ORA-01400: cannot insert NULL into ("ORAMAN"."MEMBERS03"."NAME")


select * from members03;

--for update, make a new table
--Members04 = Members01+Members02 + Members03;
create table members04
as
select * from members01
union
select * from members02
union
select * from members03;

--column unit update;
--update table name set column1 = value1, column2 = value2...
--[where condition];
--change all workers age as 20
update members04 set age =20;
select * from members04;

--change all workers age to 230, hire_date 12/25
update members04 set age =30, hire_date = '20/12/25';
select * from members04;
rollback;


--age change at Isda NAM
update members04 set age =30
where name = 'NAm';
-- = --> equal
-- >, < , <=, >=, <>
--and(&&) , or(||) operator

--age under 100, hire_date 20/08/15
update members04 set hire_date= '20/08/15'
where age <100;
select * from members04;
rollback;

--as a number, we can calcuate it
update members04 set age=age+3;
select * from members04;

-- delete from where ;
--ID park delete
-- id park and age 400
--id park or kim delete

delete from members04 
where id = 'Park'; 
select * from members04;
rollback;

delete from members04 where id ='park' or age = 30;
select * from members04;
rollback;

delete from members04 where id ='park' or id ='kim';
select * from members04;

delete from members04 where id in('park', 'kim');
select * from members04;
rollback;


--name 'NAm' or age is 30 --> change their hire_date as 20/11/11
update members04 set hire_date = '20/11/11'
where (age =30) or(name ='NAm');

select * from members04;
rollback;

--sequence : number auto generate
--page primary key 
--      not for certain table
--      When it is not used, the number will perished.        


--sequence gap
--create sequence sequenceName
create sequence seq01;
select * from seq;
--pseudo column
    --nextval : select nect sequence
     --curral : current sequence number check
 --dual table
        --owner :Sys
        --simeple math operation, function test, sequence 
        
    select 5*5*5 from dual;
    select power(2,10) from dual;
    select seq01.nextval from dual;
        select seq01.currval from dual;
 
 rollback;
 
 --create table, use seq to add data
 -- number, writer, title
 create table boards(no number primary key, writer varchar2(30), subject varchar2(30));

--seqboard.nextval
-- sequence for board
create sequence seqboard; 

select * from boards;
desc boards;
 
alter table boards modify(subject varchar2(255));

commit;
insert into boards(no, writer, subject)
values(seqboard.nextval,'Hing GillDOng','Fun article'); 
 
 insert into boards(no, writer, subject)
values(seqboard.nextval,'Hing GillDOng','Not Fun article'); 

 insert into boards(no, writer, subject)
values(seqboard.nextval,'Park YonghHee','Awesome article'); 

 
 desc boards;
select * from boards;

--dql : can search data --> select
-- select :mark column
--from  :mark searching table
--[where] :filtering condition 
--[group by] : grouping with specific area 
--[having]   : filtering condition at group by
--[order by] : sorting
-- * all columns 

select * from members04;

select name , age from members04;
select hire_date,name , age from members04;

--Distinct --> show the not repeated data
select name from members04;
select distinct name from members04;

-- alias L column's name's  
select name, age from members04;
-- OriginalName [as] another name
select name as 性名, age 歲 from members04;

select name, age, age+5 as "5 years later" from members04;

-- null : unknown value , cannot comprare it
-- null = null ->> unknown
--3*5+2 = 17 ,,, 3*5+ null ->> unknown
        -- every result of null is null need to compare with is null 
        --    
select * from members04 where  hire_date = null; 
select * from members04 where  hire_date is null; 


-- || 문자열 연결 연산자
-- age is 10
select name || '의 나이는' || age || '살 입니다.' as 결과
from members04;

-- 이름 홍길동, 입사일자 : 20/12/25

select '이름 :'|| name || ', 입사 일자 : ' ||hire_date as 결과 from members04;


--sorting
--order sorting (ascending): 1, 2, 3 ... A, B ,C ...
select * from members04 order by name [asc];


select * from members04 order by name [desc];

-- name asc , age desc
select * from members04 order by name asc, age desc;

-- : = > <>
-- in keyword : or operation
-- is null : null checking
--mod (a,b) a %b

--age 3's time 

select * from members04 where mod(age, 3) !=0;

--between A and B : Over A and below B
select * from members04 where age between 20 and 100;


--lke sentence : patern matching

--wild card  _  ->> one character 1 , % more than 0 string

-- where name like '%수' : '수'으로 끝나는
-- where name like '박%' : '박'으로 시작하는
-- where name like '%순%' : '순' 자가 포함
-- where name like '_형' : 두글자 이면서 두번째 글짜가 '형'인 항목


-- 이름 중에 'kim' 글자 포함
select * from members04 where name like '%철%';
-- 이름 중에 '수'끝나는
select * from members04 where name like '%수';

-- 성이 '김'씨
select * from members04 where name like '김%';

--두번째 글자가 '철' 인 사람
select * from members04 where name like '_철%';

-- is !null  <-->is not null
-- in  <----> not in
-- like <----> not like
-- between A and B <----> not between A and B










commit;
