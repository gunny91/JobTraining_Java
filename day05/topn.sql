-- afternoon 2pm!
-- top N statement
-- on some table, we are using ranking to deal with uper Nth data
-- usage : web programming's paging
-- how to write?
    -- sub quary select ...from (select.. from table)
    -- inline view --> lined on the select
    --select ... from (select ... from table)
    
select * from boards;

-- top n practice
delete from boards;

alter table boards add(no number);
create sequence boardseq; 

begin
        for i in 1..30 loop
            insert into boards 
            values('hong', 'aa','111','haha',0, boardseq.nextval);
        end loop;
end;
/
commit;
select * from boards;

--top n statement
--rank() over(order by something [desc/asc]) as name
select no, rank() over(order by no desc) as ranking, writer, subject, password, content, readhit
from boards;

select no, writer, subject, password, content, readhit
from (select no, rank() over(order by no desc) as ranking,
        writer, subject, password, content, readhit
        from boards)
where ranking between 1 and 10;

