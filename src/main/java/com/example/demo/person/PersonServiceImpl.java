package com.example.demo.person;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
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
        log.info("get all persons");


        return personRepository.findAll();
    }

    public Optional<Person> findPersonById(Long id) {

        return personRepository.findById(id);
    }

    public Person createPerson(Person p) {
        try {
            personRepository.save(p);
        } catch (HttpMessageNotReadableException e) {
            log.info("Error");
        } finally {
            return p;
        }

//        return personRepository.save(p);
    }
}
