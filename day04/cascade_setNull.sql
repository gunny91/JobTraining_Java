

-- Join!!!!!

-- 참조 무결성 조건 (referential integrity)

create table members(
id varchar2(10) primary key, 
name varchar2(255),
address varchar2(255),
hobby varchar2(244),
salary number(8,2)
);
drop table boards;
create table boards(
writer varchar2(10),
subject varchar2(255),
password varchar2(255),
content varchar2(255),
readhit number
);

commit;

insert into members
values('hong', '홍길동', '마포 공덕', '당구',100);

insert into members
values('park', '박영희', '용상 도원', '퀄트',200);

insert into boards
values('hong', '어떤 글', 'abc1234', '재미있는 글',10);

--No rule tha referential integrity. So, we added kang as insert values

insert into boards
values('kang', '열공하자', 'abc1234', '데이터 베이스',20);

drop table members;
drop table boards;

-- make referential integrity condition

--id is primary key, name is not null
create table members(
id varchar2(10) constraint members_id_pk primary key, 
name varchar2(255) constraint members_name_nn not null,
address varchar2(255),
hobby varchar2(244),
salary number(8,2)
);

-- generate the table and alter table to make  referential integrity condition 
create table boards(
writer varchar2(10),
subject varchar2(255),
password varchar2(255),
content varchar2(255),
readhit number
);

--  referential integrity condition
alter table boards
add constraint boards_writer_fk
foreign key(writer) references members(id);

-- data adable
insert into members
values('hong' ,'홍길동', '마포 공덕', '당구',100);

--key error
insert into members
values('hong', '홍길순', '마포 공덕', '당구',100);

--not using null
insert into members
values('홍길동' ,null, '마포 공덕', '당구',100);
rollback;
commit;
--add park

insert into members
values('park', '박영희', '용상 도원', '퀄트',200);

--add board
insert into boards
values('hong', '나', 'abc1234', '재미있는 글',10);

insert into boards
values('hong', '가', 'abc1234', '재미있는 글',10);

--cannot insert it!!!
insert into boards
values('kang', '어떤 글', 'abc1234', '재미있는 글',10);

commit;
delete from members where id = 'hong';
delete from members where id = 'park';
rollback;

--delete the key
alter table boards
drop constraint boards_writer_fk;

delete from members where id= 'hong';
--update set 
select * from members;

--still keep the hong's post even though we deleted hong at members
select * from boards;


drop table members;
drop table boards;

----------------------------cascade-------------------------------------
create table members(
id varchar2(10) constraint members_id_pk primary key, 
name varchar2(255) constraint members_name_nn not null,
address varchar2(255),
hobby varchar2(244),
salary number(8,2)
);

-- generate the table and alter table to make  referential integrity condition 
create table boards(
writer varchar2(10),
subject varchar2(255),
password varchar2(255),
content varchar2(255),
readhit number
);

--  referential integrity condition
alter table boards
add constraint boards_writer_fk
foreign key(writer) references members(id)
on delete CASCADE;


insert into members
values('park', '박영희', '용상 도원', '퀄트',200);

--add board
insert into boards values('park', 'rk', 'abc1234', '재미있는 글',10);
insert into boards values('park', '나', 'abc1234', '재미있는 글',10);

delete from members where id ='park';

select * from boards;


--------------------------set null---------------------------
drop table members;
drop table boards;

create table members(
id varchar2(10) constraint members_id_pk primary key, 
name varchar2(255) constraint members_name_nn not null,
address varchar2(255),
hobby varchar2(244),
salary number(8,2)
);

-- generate the table and alter table to make  referential integrity condition 
create table boards(
writer varchar2(10),
subject varchar2(255),
password varchar2(255),
content varchar2(255),
readhit number
);

--  referential integrity condition
alter table boards
add constraint boards_writer_fk
foreign key(writer) references members(id)
on delete set null;


insert into members
values('park', '박영희', '용상 도원', '퀄트',200);

--add board
insert into boards values('park', 'rk', 'abc1234', '재미있는 글',10);
insert into boards values('park', '나', 'abc1234', '재미있는 글',10);

delete from members where id ='park';

select * from boards;


















