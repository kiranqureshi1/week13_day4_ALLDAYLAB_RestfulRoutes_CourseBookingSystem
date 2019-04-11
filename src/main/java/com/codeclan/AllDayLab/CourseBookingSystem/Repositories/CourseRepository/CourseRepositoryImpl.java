package com.codeclan.AllDayLab.CourseBookingSystem.Repositories.CourseRepository;


import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;
import javax.transaction.Transactional;

public class CourseRepositoryImpl implements CourseRepositoryCustom {


    @Autowired
    EntityManager entityManager;

//    @Transactional

}
