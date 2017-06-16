--create database testdb;
use testdb;
drop table  IF exists MY_USER_T;

CREATE TABLE IF NOT EXISTS MY_USER_T (
id int Primary key NOT NULL AUTO_INCREMENT comment "自增主键",--占时先用自增
nick_name varchar(60) NOT NULL comment "昵称",
user_name varchar(60) NOT NULL comment "用户名",
password varchar(60) NOT NULL comment "密码",
phone varchar(30) NOT NULL comment "手机",
email varchar(100) NOT NULL comment "邮箱",
version_num int default 0 comment "版本号",
create_time bigint not null comment "创建时间",
create_user_id varchar(20) not null comment "创建人",
update_time  bigint comment "更新时间",
update_user_id varchar(20) comment "更新人"
)ENGINE=InnoDB DEFAULT CHARSET utf8 ;
