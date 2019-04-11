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
@RequestMapping(value =  "/courses")
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/{id}/customers")
    public List<Customer> findCustomersForAGivenCourse(@PathVariable Long id){
        return customerRepository.findCustomersByCourse(id);
    }

    @GetMapping(value = "/{id}/town/customers")
    public List<Customer> findCustomerForAGivenTownAndCourse(@PathVariable Long id){
        return customerRepository.findCustomersByCourseAndTown(id);
    }

    @GetMapping(value = "/{id}/town/age/{age}/customers")
    public List<Customer> findCustomerByAgeAndTownAndCourses(@PathVariable int age, @PathVariable Long id){
        return customerRepository.findCustomersOverCertainAgeByTownbyCourseId(age, id);
    }


    @GetMapping(value = "/{rating}")
    public List<Course> findCoursesForAGivenRating(@PathVariable int rating){
        return courseRepository.findCoursesByRating(rating);
    }


}
