-- join : combine with mroe than 2 tables abd get tge bew data combination
-- n-1 =join --> if n =5, then it is 4 join

--select atable.col1 ,btable.col2,...
--from atable join btable
--on atable.column= btable.col; -- like a equal join

select *
from members join boards
on members.id = boards.writer;

-- table name also do alice, but as keyword cannot use
--inner and eqal join
select members.name, boards.subject
from members join boards
on members.id = boards.writer;

select m.name, b.subject
from members m join boards b
on m.id = b.writer;

-- show the user who did not write the board post
select members.name, boards.subject
from members left outer join boards boards
on members.id = boards.writer;

-- show the deleted user's post
select members.name, boards.subject
from members right outer join boards boards
on members.id = boards.writer;

-- non equal join --> non equi
create table grades(
    glevel varchar2(3),
    lowsal number,
    highsal number
);

insert into grades values('A', 0 , 100);
insert into grades values('B', 101 , 200);
insert into grades values('C', 201 , 300);
insert into grades values('D', 301, 400);
commit;
select * from grades;

-- non-between
-- join without using '='
select m.name, m.salary , g.glevel 
from members m join grades g
on m.salary between g.lowsal and g.highsal;

--add self join column
alter table members add(manager varchar2(50));
select * from members;

update members set manager ='hong' where id='park';
update members set manager ='park' where id='kim';
update members set manager ='kim' where id='choi';
commit;

-- while join, 사원.managerid = admin.id
--emp : 사원, mgr 관리자
select '사원 : ' || emp.name || ', 관리자: ' || mgr.name
from members emp join members mgr 
on emp.manager = mgr.id;



--delete members  where name ='hong';

--rollback;


