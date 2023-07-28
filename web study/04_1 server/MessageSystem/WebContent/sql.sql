--1. È¸ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ ï¿½Ö´ï¿½ 'web_member'ï¿½ï¿½ï¿½Ìºï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½Ã¿ï¿?.
--   ï¿½Ã·ï¿½ï¿½ï¿½ : email / pw / tel / address

CREATE TABLE MSGMEMBER(
    EMAIL VARCHAR2(100) PRIMARY KEY,
    PW VARCHAR2(100) NOT NULL,
    PHONE VARCHAR2(100) NOT NULL,
    ADDR VARCHAR2(100) NOT NULL
);

INSERT INTO MSGMEMBER VALUES('admin@gmail.com', '12345', '010-1234-5678', 'ï¿½ï¿½ï¿½Ö±ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ 92');

select * from msgmember;

CREATE TABLE MESSAGE(
    NUM             NUMBER      PRIMARY KEY,
    SEND_NAME       VARCHAR2(100),
    RECEIVE_EMAIL   VARCHAR2(100),
    CONTENT         VARCHAR2(1000),
    SEND_DATE       DATE
);

CREATE SEQUENCE MSG_NUM START WITH 1 INCREMENT BY 1;

INSERT INTO MESSAGE VALUES(MSG_NUM.NEXTVAL, 'test10 ', 'admin@gmail.com', 'Å×½ºÆ®¸ÞÀÏº¸³»±â!', SYSDATE);

SELECT * FROM MESSAGE where receive_email = 'admin@gmail.com';