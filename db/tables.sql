use server;

drop table if exists item;

create table item(
	id int not null auto_increment primary key,
	name varchar(20)
)auto_increment=1 default charset=utf8;

insert into item(name) values("aaa");
insert into item(name) values("bbb");
insert into item(name) values("ccc");


use server;

drop table if exists user;

create table user(
	id int not null auto_increment primary key,
	name varchar(20) not null,
	password varchar(128) not null,
	enabled int not null,
	salt varchar(128)
)auto_increment=1 default charset=utf8;