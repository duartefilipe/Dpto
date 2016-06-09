create table professor (id serial, nome varchar(50),siape int,ramal int,celular int,sala varchar(20),cpf int,identidade int, email varchar(50),primary key(id));
create table funcionario (id serial,nome varchar(50),siape int,ramal int,celular int,sala varchar(20),cpf int,identidade int, email varchar(50),primary key(id));
select*from professor;
select*from funcionario;
drop table professor;
drop table funcionario;

insert into professor values(default, 'filipe', 123, 1234, 33333333, '1111h', 12221212, 1212121, 'filipe@gmail.com')
insert into funcionario values(default, 'filipe', 123, 1234, 33333333, '1111h', 12221212, 1212121, 'filipe@gmail.com')