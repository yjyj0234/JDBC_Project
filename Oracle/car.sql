--------------------------------------------------------
--  파일이 생성됨 - 수요일-3월-26-2025   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table CAR
--------------------------------------------------------

  CREATE TABLE "ASDF52899"."CAR" 
   (	"CAR_NO" NUMBER(10,0), 
	"CAR_MODEL" VARCHAR2(30 BYTE), 
	"CAR_COLOR" VARCHAR2(20 BYTE), 
	"CAR_OPTION" VARCHAR2(20 BYTE), 
	"CAR_PRICE" NUMBER(10,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
REM INSERTING into ASDF52899.CAR
SET DEFINE OFF;
--------------------------------------------------------
--  DDL for Index SYS_C008436
--------------------------------------------------------

  CREATE UNIQUE INDEX "ASDF52899"."SYS_C008436" ON "ASDF52899"."CAR" ("CAR_NO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table CAR
--------------------------------------------------------

  ALTER TABLE "ASDF52899"."CAR" ADD PRIMARY KEY ("CAR_NO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE;
