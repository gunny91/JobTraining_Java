--orama (ID),  oracle(PW)
create user oraman identified by oracle account unlock;
alter user oraman default tablespace users;
grant connect, resource to oraman;
-- connect :access permissio
--resource : table create/modification/delete

--oraman user create the connect Icon


create user gomdori identified by oracle account unlock;
alter user gomdori default tablespace users;
grant connect, resource to gomdori;

