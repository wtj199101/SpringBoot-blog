--create database testdb;
use testdb;
drop table  IF exists MY_USER;

CREATE TABLE IF NOT EXISTS MY_USER (
id varchar(19) Primary key ,
userName varchar(50) NOT NULL ,
password varchar(50) NOT NULL ,
phone varchar(20) NOT NULL
);
--commit