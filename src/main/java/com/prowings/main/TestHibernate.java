package com.prowings.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prowings.entities.Car;

public class TestHibernate {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Car car = new Car();
        car.setId(1);
        car.setName("Toyota");

        car.setId(2);
        car.setName("BMW");
        
        car.setId(3);
        car.setName("Audi");
        
        session.save(car);
        tx.commit();
        session.close();
        factory.close();
    }
}
