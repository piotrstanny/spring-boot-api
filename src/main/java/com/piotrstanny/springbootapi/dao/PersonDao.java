package com.piotrstanny.springbootapi.dao;

import com.piotrstanny.springbootapi.model.Person;
import java.util.UUID;

public interface PersonDao {

    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
