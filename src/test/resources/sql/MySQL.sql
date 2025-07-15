create database demo;

use demo;

-- 表
drop table if exists sys_user;
create table sys_user(
    id int not null auto_increment,
    name varchar(10),
    sex varchar(1),
    regtime datetime,
    primary key (id)
);

-- truncate table sys_user;
insert into SYS_USER(id, name, sex, regtime) values(1, '张三', '1', '2020-01-01 01:01:01'), (2, '李四', '2', '2022-02-02 02:02:02');
/*
select * from sys_user;
*/

drop table if exists sys_address;
create table sys_address(
    id int not null auto_increment,
    address varchar(30),
    zipcode varchar(6),
    userid int,
    primary key (id)
);

-- truncate table sys_address;
insert into sys_address(address, zipcode, userid) values('杭州', '310002', 1), ('上海', '200002', 1);
/*
select * from sys_address;
*/
 */

-- 存储过程
drop procedure if exists proc_user;
create procedure proc_user(in p_name varchar(10))
begin
    select * from sys_user where name = p_name;
end;

/*
call pro_user('张三');
*/

-- 函数
drop function if exists func_plus;
create function func_plus(p_a int, p_b int)
    returns int
    no sql
begin
    return (p_a + p_b);
end;

/*
select func_plus(4, 6);
*/
