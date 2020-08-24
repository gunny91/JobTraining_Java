-----practice of DCL

--나는 데이터베이스 관리자이다.
--신규 사원인 김철수 사원에 대한 데이터베이스 작업을 수행하고자 한다.
--김철수 사원에 대한 계정 kim/oracle을 생성하세요.
--최초 로그인시 사용자 계정을 만료시키고, 비번을 iloveyou로 변경하세요.

--다음과 같은 기능을 충족하기 위한 문장들을 작성하세요.
--	데이터베이스 접근 권한이 있어야 한다.
--	기본 테이블스페이스는 users로 지정한다.
--	users 테이블스페이스에 대한 공간을 무제한 제공하세요.

-----create user temp/oracle expire password and change it to iloveyou with default tablespace
create user temp identified by oracle password expire
default tablespace users
quota unlimited on users
account unlock;
--------------create role as kimrole, then grant it to temp user
create role kimrole;
grant kimrole to temp;
grant kimrole to oraman;

-----grant to create session, create tablem create view, create seq
grant create table, create session, create view, create sequence to kimrole;




--oraman의 members 테이블에 대한 조회 권한을 부여하세요.
grant select on members to temp;

--oraman 사용자에 대하여 다음 문장을 이용하여 뷰 viewtest를 생성하시오.
select name, address from members ;

create or replace view viewtest
as
select name, address from members;

grant select on members to temp;
grant select on viewtest to temp;



--관리자가 kimrole이라는 롤을 생성하시오.
--kimrole에는 테이블/뷰/시쿼스 생성 권한을 부여하세요.
--kim 사원에게 kimrole 롤을 부여 하세요.
--이 롤이 잘 동작하는 지 테스트 하시오.



--oraman 사용자의 뷰 viewtest를 kim 사원이 볼 수 있도록 처리하세요.
select * from oraman.members;
select * from oraman.viewtest;


--kim 계정을 삭제하시오.
drop user temp;