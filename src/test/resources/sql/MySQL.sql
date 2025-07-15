create database TEST;

use TEST;

create table SYS_ADDRESS(
                            ID int not null auto_increment,
                            ADDRESS varchar(30),
                            ZIPCODE varchar(10),
                            USERID int,
                            primary key (ID)
);

create table SYS_USER(
                         ID int not null auto_increment,
                         NAME varchar(10),
                         SEX int,
                         primary key (ID)
);

create table SYS_INFO(
                         ID varchar(32),
                         NAME varchar(32),
                         RCREATETIME timestamp,
                         RUPDATETIME timestamp,
                         RSTATUS varchar(32),
                         primary key (ID)
);

create procedure PROC_GET_SYS_USER(in PS_NAME varchar(10))
begin
select ID, NAME, SEX from SYS_USER where NAME = PS_NAME;
end;

insert into SYS_USER values(100, '张三', 1);
insert into SYS_ADDRESS values(1, '杭州', '310002', 100);
insert into SYS_ADDRESS values(2, '北京', '100002', 100);

update SYS_USER set sex = 3 where id = 100;
update SYS_USER set sex = 3 where id = 102;

select * from SYS_USER;
select * from SYS_ADDRESS;
select * from SYS_INFO;

truncate table SYS_USER;
truncate table SYS_ADDRESS;create database TEST;

use TEST;

create table SYS_ADDRESS(
                            ID int not null auto_increment,
                            ADDRESS varchar(30),
                            ZIPCODE varchar(10),
                            USERID int,
                            primary key (ID)
);

create table SYS_USER(
                         ID int not null auto_increment,
                         NAME varchar(10),
                         SEX int,
                         primary key (ID)
);

create table SYS_INFO(
                         ID varchar(32),
                         NAME varchar(32),
                         RCREATETIME timestamp,
                         RUPDATETIME timestamp,
                         RSTATUS varchar(32),
                         primary key (ID)
);

create procedure PROC_GET_SYS_USER(in PS_NAME varchar(10))
begin
select ID, NAME, SEX from SYS_USER where NAME = PS_NAME;
end;

insert into SYS_USER values(100, '张三', 1);
insert into SYS_ADDRESS values(1, '杭州', '310002', 100);
insert into SYS_ADDRESS values(2, '北京', '100002', 100);

update SYS_USER set sex = 3 where id = 100;
update SYS_USER set sex = 3 where id = 102;

select * from SYS_USER;
select * from SYS_ADDRESS;
select * from SYS_INFO;

truncate table SYS_USER;
truncate table SYS_ADDRESS;