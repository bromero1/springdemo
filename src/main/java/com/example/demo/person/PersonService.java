package com.example.demo.person;

import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

//@Service
public interface PersonService {
    List<Person> getAllPersons();
    Optional<Person> findPersonById(Long id);

    public Optional<Person> createPerson(Person p);

    public boolean findPersonByEmail(String email);
}
