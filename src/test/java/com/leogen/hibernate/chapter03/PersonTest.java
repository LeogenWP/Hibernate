package com.leogen.hibernate.chapter03;

import com.leogen.hibernate.chapter03.pojo.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PersonTest {
    SessionFactory factory;

    private Person findPerson(Session session, String name) {
        Query<Person> query = session.createQuery(
                "from Person p where p.name=:name",
                Person.class
        );
        query.setParameter("name",name);
        Person person = query.uniqueResult();
        return person;
    }

    private Person savePerson(Session session, String name) {
        Person person= findPerson(session,name);
        if(person == null) {
            person = new Person();
            person.setName(name);
            session.save(person);
        }
        return person;  
    }

    @BeforeClass
    public void setup() {
        StandardServiceRegistry registry =
                new StandardServiceRegistryBuilder()
                .configure()
                .build();
        factory = new MetadataSources(registry)
                .buildMetadata()
                .buildSessionFactory();
    }

    @Test
    public void testSavePerson() {
        try(Session session = factory.openSession()) {
            Transaction tx = session.beginTransaction();
            Person person = new Person();
            person.setName("Boris");
            session.save(person);
            tx.commit();
        }
    }
}
