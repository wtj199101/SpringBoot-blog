--create database testdb;
use testdb;
drop table  IF exists MY_USER_T;

CREATE TABLE IF NOT EXISTS MY_USER_T (
id varchar(19) Primary key ,
userName varchar(60) NOT NULL ,
password varchar(60) NOT NULL ,
phone varchar(30) NOT NULL,
email varchar(100) NOT NULL,
version_num int default 0,
create_time bigint not null,
create_user_id varchar(20) not null,
update_time  bigint,
update_user_id varchar(20) 
)ENGINE=InnoDB DEFAULT CHARSET utf8 ;
--commit