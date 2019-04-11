package com.codeclan.AllDayLab.CourseBookingSystem.Components;

import com.codeclan.AllDayLab.CourseBookingSystem.Models.Booking;
import com.codeclan.AllDayLab.CourseBookingSystem.Models.Course;
import com.codeclan.AllDayLab.CourseBookingSystem.Models.Customer;
import com.codeclan.AllDayLab.CourseBookingSystem.Repositories.BookingRepository.BookingRepository;
import com.codeclan.AllDayLab.CourseBookingSystem.Repositories.CourseRepository.CourseRepository;
import com.codeclan.AllDayLab.CourseBookingSystem.Repositories.CustomerRepository.CustomerRepository;
import org.hibernate.validator.constraints.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        Course course1 = new Course("Java", "Edinburgh", 4);
        courseRepository.save(course1);

        Course course2 = new Course("Python", "Edinburgh", 3);
        courseRepository.save(course2);

        Customer customer1 = new Customer("Chika", "Edinburgh", 40);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Kira", "Edinburgh", 24);
        customerRepository.save(customer2);

        Booking booking1 = new Booking("20-5-19", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("20-5-19", course2, customer2);
        bookingRepository.save(booking2);



    }

}
