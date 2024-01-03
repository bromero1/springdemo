use demo;
drop table if exists person; 

create table person (
		person_id bigint not null AUTO_INCREMENT,
        age integer,
        dob date,
        email varchar(255),
        name varchar(255),
        primary key (person_id),
        unique(email)
    );
    
    
insert into person(age, dob, email, first_name, last_name) values (29, '1990-01-17', 'roero5@gmail.com', 'Jeff', 'Romero');
insert into person(age, dob, email, first_name, last_name) values (25, '1999-02-08', 'test@gmail.com', 'John', 'Wick');
insert into person(age, dob, email, first_name, last_name) values (24, '1984-03-29', 'tewst@gmail.com', 'Aretha', 'Franklin');
insert into person(age, dob, email, first_name, last_name) values (88, '1940-03-21', 'oldie@gmail.com', 'Frank', 'Tank');

select * from person;
-- delete from person where person_id = 9;