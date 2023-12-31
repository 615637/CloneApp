--[회원기능]
--회원 테이블
create table tonic_member(
id number CONSTRAINT TONIC_ID_PK PRIMARY KEY,
instrument number(3) NOT NULL,
age number(3) NOT NULL,
name varchar2(50) NOT NULL,
email NOT NULL,
password NOT NULL
);

--회원 시퀀스
CREATE SEQUENCE SEQ_TONIC_MEMBER
INCREMENT BY 1;

--회원 트리거
CREATE OR REPLACE TRIGGER TRG_TONIC_MEMBER_PK
BEFORE INSERT -- 시점(추가 전 시점)
ON TONIC_MEMBER --트리거를 부착할 테이블 이름
FOR EACH ROW --각 행마다 적용
BEGIN --실행부 : 자바의 중괄호 (for(){})
    :NEW.ID := SEQ_TONIC_MEMBER.NEXTVAL;
END;

--[라이브 기능]
--라이브 목록
CREATE TABLE TONIC_LIVE
ID NUMBER CONSTRAINT LIVE_ID_PK PRIMARY KEY,
DESCRIPTION VARCHAR2(500),
TECHNIQUE VARCHAR2(300),
NAME
TITLE
WRITER
INSTRUMENT
;




