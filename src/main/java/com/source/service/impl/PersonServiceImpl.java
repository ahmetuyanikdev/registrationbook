package com.source.service.impl;

import com.source.model.Person;
import com.source.service.PersonService;
import com.source.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;


public class PersonServiceImpl implements PersonService {

    @Override
    public void save(Person person) {
        Session  session = HibernateUtil.getSessionFactory().openSession();
        Transaction  transaction = session.beginTransaction();
        session.save(person);
        transaction.commit();
    }

    @Override
    public List<Person> getAllPeople() {
        Session  session = HibernateUtil.getSessionFactory().openSession();
        List<Person> personList = session.createQuery("from Person",Person.class).list();
        return personList;
    }
}
