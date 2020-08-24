create table emp01(
    EMPNO NUMBER(4),
    ENAME VARCHAR2(10),
    JOB VARCHAR2(9),
    MGR NUMBER(4)
);

create table copyEMP01
as
select * from emp01;

describe emp01;

drop table copyEMP01;
describe copyEMP01;

create table dept01(DEPTNO number(2), DNAME VARCHAR2(14), LOC varchar2(13));
describe dept01;

alter table dept01 add(hirerate DATE);
describe dept01;

alter table emp01 drop (MGR);
describe emp01;

alter table emp01 modify(JOB VARCHAR2(20));
describe emp01;

ALTER TABLE emp01
RENAME TO emp02;

describe emp02;

drop table emp02;
flashback table emp02 to before drop;
select * from emp02;
show recyclebin

