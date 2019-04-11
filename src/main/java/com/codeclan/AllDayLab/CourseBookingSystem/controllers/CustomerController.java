package com.codeclan.AllDayLab.CourseBookingSystem.controllers;


import com.codeclan.AllDayLab.CourseBookingSystem.Models.Course;
import com.codeclan.AllDayLab.CourseBookingSystem.Models.Customer;
import com.codeclan.AllDayLab.CourseBookingSystem.Repositories.CourseRepository.CourseRepository;
import com.codeclan.AllDayLab.CourseBookingSystem.Repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/{id}/courses")
    public List<Course> findCoursesForAGivenCustomer(@PathVariable Long id){
        return courseRepository.findCourseByCustomer(id);
    }
}
