package com.piotrstanny.springbootapi.service;

import com.piotrstanny.springbootapi.dao.PersonDao;
import com.piotrstanny.springbootapi.model.Person;

public class PersonService {

    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }

}
