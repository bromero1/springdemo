use demo;
drop table if exists person; 

create table person (
		person_id bigint not null AUTO_INCREMENT,
        age integer,
        dob date,
        email varchar(255),
        name varchar(255),
        primary key (person_id)
    );
    
    
select * from person;
insert into person(age, dob, email, name) values (29, '1994-03-27', 'bromero52@gmail.com', 'brdyan');
insert into person(age, dob, email, name) values (25, '1994-03-27', 'bromerdfso52@gmail.com', 'brydan');
insert into person(age, dob, email, name) values (24, '1994-03-27', 'bromero52@gmail.com', 'bryadan');
insert into person(age, dob, email, name) values (88, '1940-03-27', 'oldie@gmail.com', 'Frank');


-- delete from person where person_id = 9;