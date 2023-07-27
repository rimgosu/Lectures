--1. ȸ�������� ������ ������ �� �ִ� 'web_member'���̺��� ����ÿ�.
--   �÷��� : email / pw / tel / address

CREATE TABLE MSGMEMBER(
    EMAIL VARCHAR2(100) PRIMARY KEY,
    PW VARCHAR2(100) NOT NULL,
    PHONE VARCHAR2(100) NOT NULL,
    ADDR VARCHAR2(100) NOT NULL
);

INSERT INTO MSGMEMBER VALUES('admin@gmail.com', '12345', '010-1234-5678', '���ֱ����� ���� ������ 92');

select * from msgmember;





