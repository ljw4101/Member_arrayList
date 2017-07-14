--id, pw, ssn, name, regdate
SELECT * FROM MEMBER;

delete from MEMBER;

select count(*) as count from MEMBER;

select * from MEMBER where name = 'jihun';

--dummy
INSERT INTO MEMBER(id, name, pw, ssn, regdate) VALUES ('hong','gildong','a','920615-234678',SYSDATE);
insert into member(id, name, pw, ssn, regdate) values ('kang','Danel','1','940101-1234517',SYSDATE);
insert into member(id, name, pw, ssn, regdate) values ('park','jihun','1','931230-1234527',SYSDATE);
insert into member(id, name, pw, ssn, regdate) values ('lee','jihun','1','921230-1234537',SYSDATE);
insert into member(id, name, pw, ssn, regdate) values ('kim','jihun','1','900201-1234547',SYSDATE);
insert into member(id, name, pw, ssn, regdate) values ('ong','jihun','1','930301-1235567',SYSDATE);
insert into member(id, name, pw, ssn, regdate) values ('ong2','sung','1','930301-1235567',SYSDATE);
insert into member(id, name, pw, ssn, regdate) values ('la','kan','1','931230-2234517',SYSDATE);
insert into member(id, name, pw, ssn, regdate) values ('jung', 'sehun','1','970101-2224567',SYSDATE);
insert into member(id, name, pw, ssn, regdate) values ('you', 'sunho','1','940620-2235567',SYSDATE);
insert into member(id, name, pw, ssn, regdate) values ('jung2', 'sehun','1','970101-2236567',SYSDATE);
insert into member(id, name, pw, ssn, regdate) values ('jun', 'jihun','1','970615-2234577',SYSDATE);


SELECT * FROM member WHERE id='lee';

