package com.example.demo.person;

import com.example.demo.exceptions.EmailExistsException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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


    public Optional<Person> createPerson(Person p) {
        boolean emailExists = findPersonByEmail(p.getEmail());

        if (emailExists) throw new EmailExistsException(p.getEmail());
        try {
            p = personRepository.saveAndFlush(p);

        } catch (Exception e) {
            log.info("Error saving: " + e.getClass());
        }
        return Optional.ofNullable(p);
    }

    /**
     * @param email
     * @return True if email is in a record.
     */
    @Override
    public boolean findPersonByEmail(String email) {
        Optional<Person> search = Optional.ofNullable(personRepository.findAll().stream().filter(p -> email.equals(p.getEmail())).findFirst().orElse(null));
        return search.isPresent();
    }
}
