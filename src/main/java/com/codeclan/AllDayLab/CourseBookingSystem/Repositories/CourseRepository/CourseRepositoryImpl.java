package com.codeclan.AllDayLab.CourseBookingSystem.Repositories.CourseRepository;


import com.codeclan.AllDayLab.CourseBookingSystem.Models.Course;
import com.codeclan.AllDayLab.CourseBookingSystem.Models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;
import javax.transaction.Transactional;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Course> findCourseByCustomer(Long id) {
        List<Course> result = null;
        org.hibernate.Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Course.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.add(Restrictions.eq("bookingAlias.customer.id", id));
            result = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return result;
    }


}
