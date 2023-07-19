--[ȸ�����]
--ȸ�� ���̺�
create table tonic_member(
id number CONSTRAINT TONIC_ID_PK PRIMARY KEY,
instrument number(3) NOT NULL,
age number(3) NOT NULL,
name varchar2(50) NOT NULL,
email NOT NULL,
password NOT NULL
);

--ȸ�� ������
CREATE SEQUENCE SEQ_TONIC_MEMBER
INCREMENT BY 1;

--ȸ�� Ʈ����
CREATE OR REPLACE TRIGGER TRG_TONIC_MEMBER_PK
BEFORE INSERT -- ����(�߰� �� ����)
ON TONIC_MEMBER --Ʈ���Ÿ� ������ ���̺� �̸�
FOR EACH ROW --�� �ึ�� ����
BEGIN --����� : �ڹ��� �߰�ȣ (for(){})
    :NEW.ID := SEQ_TONIC_MEMBER.NEXTVAL;
END;

--[���̺� ���]
--���̺� ���
CREATE TABLE TONIC_LIVE
ID NUMBER CONSTRAINT LIVE_ID_PK PRIMARY KEY,
DESCRIPTION VARCHAR2(500),
TECHNIQUE VARCHAR2(300),
NAME
TITLE
WRITER
INSTRUMENT
;




