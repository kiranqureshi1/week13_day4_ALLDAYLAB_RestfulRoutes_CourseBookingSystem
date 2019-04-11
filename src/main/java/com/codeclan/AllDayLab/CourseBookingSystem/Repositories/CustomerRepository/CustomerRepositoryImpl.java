package com.codeclan.AllDayLab.CourseBookingSystem.Repositories.CustomerRepository;

import com.codeclan.AllDayLab.CourseBookingSystem.Models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> findCustomersByCourse(Long id) {
        List<Customer> result = null;
        org.hibernate.Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.add(Restrictions.eq("bookingAlias.course.id", id));
            result = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return result;
    }

}
