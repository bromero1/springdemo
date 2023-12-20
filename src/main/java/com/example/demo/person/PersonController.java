package com.example.demo.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
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
    public Optional<Person> getPerson(@RequestParam Long id) {
        return personService.findPersonById(id);
    }


    /**
     * @param p a Person object that we want to persist in db.
     * @return true if posted.
     * @// TODO: 11/17/23 On failure, we are hit with 400 - Bad Request from api call. What happens to the
     * false value.. ?
     */
//    @PostMapping
//    public Optional<Person> postPerson(@RequestBody Person p){
//        Optional<Person> res =  personService.createPerson(p);
////        if(res.equals(p)) return res;
//        return res;
//    }
    @PostMapping
    public ResponseEntity<String> postPerson(@RequestBody Person p) {
        Optional<Person> newPerson = personService.createPerson(p);
        return new ResponseEntity<>(newPerson.get().toString(), HttpStatus.ACCEPTED);
    }

    @GetMapping(params = "email")
    public ResponseEntity<String> searchPersonByEmail(@RequestParam String email) {
        boolean exists = personService.findPersonByEmail(email);
        if (exists)
            return new ResponseEntity<>("Email exists -" + email, HttpStatus.OK);
        else
            return new ResponseEntity<>("User not found with the given email.", HttpStatus.NOT_FOUND);
    }
}
