create database demo;

use demo;

create table sys_user(
    id int not null auto_increment,
    name varchar(10),
    sex int,
    regtime datetime,
    primary key (ID)
);

create table sys_address(
    id int not null auto_increment,
    address varchar(30),
    zipcode varchar(6),
    userid int,
    primary key (ID)
);

create procedure proc_get_sys_user(in p_name varchar(10))
begin
    select * from sys_user where name = p_name;
end;

create function func_plus(p_a int, p_b int)
    returns int(11)
    no sql
begin
    return (p_a + p_b);
end;

-- truncate table sys_user;
insert into SYS_USER(name, sex, regtime) values('张三', 1, '2020-01-01 01:01:01'), ('李四', 2, '2022-02-02 02:02:02');

select * from sys_user;

-- truncate table sys_address;
insert into sys_address(address, zipcode, userid) values('杭州', '310002', 1), ('上海', '200002', 1);

select * from sys_address;
