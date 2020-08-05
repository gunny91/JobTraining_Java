-- user bigbang forgot the pw
-- admin provide the temparay pw, alter user account 

-- admin session // temp pw is abc1234 and expire the password 


--admin session
alter user bigbang 
identified by abc1234 
password expire;


--on the SQL command line, type
--SQL> connect bigbang/abc1234
--ERROR:
--ORA-28001: the password has expired
--
--
--Changing password for bigbang
--New password:
--Retype new password:
--Password changed
--Connected.


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