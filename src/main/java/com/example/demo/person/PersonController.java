package com.example.demo.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/person")
public class PersonController {
     PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping
    public List<Person> getPersons() {

       return personService.getAllPersons();
    }

    @GetMapping(params = "id")
    @ResponseBody
    public Optional<Person> getPerson(@RequestParam Long id){
        return personService.findPersonById(id);
    }


    /**
     *
     * @param p a Person object that we want to persist in db.
     * @return true if posted. 
     * @// TODO: 11/17/23 On failure, we are hit with 400 - Bad Request from api call. What happens to the
     * false value.. ?
     */
    @PostMapping
    public boolean postPerson(@RequestBody Person p){
        Person res =  personService.createPerson(p);
        if(res.equals(p)) return true;
        return false;

    }



}
