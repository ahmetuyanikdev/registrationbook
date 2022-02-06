package com.source.service;

import com.source.model.Person;

import java.util.List;

public interface PersonService {

     void save(Person person);

     List<Person> getAllPeople();
}
