package com.spring.dao;


import com.spring.domain.Person;
import org.springframework.stereotype.Repository;

@Repository("personDao")
public class PersonDaoSimple implements PersonDao {

    public Person findByName(String name) {
        return new Person(name, 18);
    }
}
