drop table member;

create table member(
    id varchar2(50) primary key,
    pw varchar2(50) not null,
    nick varchar2(50) not null,
    email varchar2(100) not null,
    phone varchar2(100) not null,
    gender varchar2(100) not null,
    age number not null
);

select * from member;
insert into member values('admin', '1234', '관리자', 'admin@google.com', '010-1111-2222', '남자', 20);
commit;