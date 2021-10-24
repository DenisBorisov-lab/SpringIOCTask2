package com.spring.dao;


import com.spring.domain.Person;

public interface PersonDao {

    Person findByName(String name);
}
