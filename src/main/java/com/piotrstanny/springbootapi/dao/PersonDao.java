package com.piotrstanny.springbootapi.dao;

import com.piotrstanny.springbootapi.model.Person;

import java.util.List;
import java.util.UUID;

public interface PersonDao {

    int insertPerson(UUID id, Person person);

    List<Person> selectAllPeople();

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
