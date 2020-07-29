--Function

--Single Function : absolute, root, round

--Multi-Function (Group function) : max, min, avg
-- ------------------------------------------------
--numeric function
--abs(n) : absolute value
select abs(12), abs(-12) from dual;
select * from dual;

--ceil(n):round up , floor(n): throw;
select ceil(10.123), floor(10.123) from dual;

--power(a,b) 
select power(2,4), power(2,5) from dual;

--sqrt(n)
select sqrt(4), sqrt(5) from dual;

--exp(n), ln(n), log(n,m)
select exp(1), ln(exp(1)),log(10,100) from dual;

--greatest(list) :bigest value from list
--least(list) : lowest value from list
select greatest(10,20,15,3), least(10,20,15,3) from dual;

select greatest('Kim', 'PARK','니가'), least('Kim', 'PARK','니가') from dual;

--round(n [,m]) 
--Positive or 0 
--Negative : left 
select round(3.12345,2), round(3.12345,1),round(3.12345), round(3.12345,0), round(31111.12345,-2) from dual;

--int 7 root value, until 0.333 something

select round(sqrt(7),3) from dual;
select sqrt(abs(-7)) from dual;


--trunc(n[,m]) : 절삭하기?
select trunc(345.678,1), trunc(345.678,-2),trunc(345.678) from dual;


--mod(n,m)

select mod(14, 5), mod(1700,500) from dual;

--where mod(age, 3) =0; if age is 3 times

--books table price select * from books where mod(price,5)=0;
-- -----------------------------------------------------------------


--String fucntion
create table sample( test varchar2(30));

insert into sample values('wonder girls 123');
insert into sample values('bingbang 456');
insert into sample values('girls generations 789');
commit;
select *from sample;

select lower(test) from sample;
select upper(test) from sample;
--make it capital for fist letter
select initcap(test) from sample;

select upper('oh my love') from dual;

--concat combination of strings (concatenate) || 
select concat(test,' my ass') from sample;
select * from sample;

--substr(strng,startpoint[,number of string])
select substr(test,3,2) from sample;

select substr('abcdefg',4,3) from dual;
select substr('abcdefg',4) from dual;

--count from back g f e d and start from d to get two char value, which is de
select substr('abcdefg',-4, 2) from dual;

--length
select length('가al') from dual;

select length(test) from sample;

--instr(searched String, searching)
select instr('abcdef', 'bc') from dual;
select instr('abcdefg', 'bd') from dual;
select instr(test, 'gi') from sample;


-- lpad, rpad left right
select lpad('abc',5 ,'*') from dual;
select lpad('abc',4 ,'*') from dual;

--replace()
select replace('원더걸스', '걸스', '우먼') from dual;

--trim(some String) : split left and right
--trim(some String, split string) : split left and right

select '*' || trim('  abc  ') ||'*'from dual;

--rtrim(some string, string) : right split
--ltrim(some string, string) : left split

select rtrim('xabcxdefx','x') from dual;
select ltrim('xabcxdefx','x') from dual;

select trim('H' from 'HelloWorldHH') from dual;
--Q avcd@naver.com
--print 아이디는 abcd 입니다
--print 메일은 naver.com 입니다
select '아이디는'|| rtrim('avcd@naver.com','@naver.com') ||'입니다' from dual;
select '메일은'|| ltrim('avcd@naver.com','avcd@' ) ||'입니다' from dual;

select substr('avcd@naver.com', 1, instr('avcd@naver.com', '@')-1)||'입니다' from dual;

select substr('avcd@naver.com', instr('avcd@naver.com', '@')+1) from dual;

select  instr('avcd@naver.com', '@')-1 from dual;
select  instr('avcd@naver.com', '@')+1 from dual;

