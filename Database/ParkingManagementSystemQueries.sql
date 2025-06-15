create table entrance(
	entrance_no int primary key,
	start_time varchar,
	closing_time varchar
)


















create table users(
 user_id int primary key,
 user_name varchar(20),
 user_role varchar(10)
);


insert into users values(3, 'user1','manager');
insert into users values(4, 'user1','car_owner');

select * from users;

select u1_0.user_id,u1_0.user_name,u1_0.user_role from users.users u1_0 where u1_0.user_id=1;