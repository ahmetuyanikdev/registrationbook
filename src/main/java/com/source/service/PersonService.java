package com.source.service;

import com.source.model.Person;
import org.hibernate.HibernateException;

import java.util.List;

public interface PersonService {

     void save(Person person) throws HibernateException;

     List<Person> getAllPeople();
}
