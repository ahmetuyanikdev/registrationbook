package com.source.service.impl;

import com.source.model.Person;
import com.source.service.PersonService;
import com.source.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Objects;

public class PersonServiceImpl implements PersonService {

    Transaction transaction;
    Session session;

    @Override
    public void save(Person person) {
        if(Objects.equals(transaction,null)){
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
        }
        session.save(person);
        transaction.commit();
    }

    @Override
    public List<Person> getAllPeople() {
        if(Objects.equals(session,null)){
            session = HibernateUtil.getSessionFactory().openSession();
        }
        List<Person> personList = session.createQuery("from Person",Person.class).list();
        return personList;
    }
}
