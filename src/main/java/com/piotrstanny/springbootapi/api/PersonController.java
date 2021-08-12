package com.piotrstanny.springbootapi.api;

import com.piotrstanny.springbootapi.model.Person;
import com.piotrstanny.springbootapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void addPerson(Person person) {
        personService.addPerson(person);
    }
}
