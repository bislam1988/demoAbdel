-- You can use this file to load seed data into the database using SQL statements
create table Member (id number(4) primary key, name varchar2(255), email varchar2(255), phone_number varchar2(255));
insert into Member (id, name, email, phone_number) values (0, 'John Smith', 'john.smith@mailinator.com', '2125551212');
insert into Member (id, name, email, phone_number) values (1, 'Abdeslem BELMOKADDEM', 'a.belmokaddem@gmail.com', '3365254847');