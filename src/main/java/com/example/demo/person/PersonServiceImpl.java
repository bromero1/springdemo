package com.example.demo.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    PersonRepository personRepository;

    public PersonServiceImpl() {
    }

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    //    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Optional<Person> findPersonById(Long id) {
        return personRepository.findById(id);
    }

    public Person createPerson(Person p){
        return personRepository.save(p);
    }
}
