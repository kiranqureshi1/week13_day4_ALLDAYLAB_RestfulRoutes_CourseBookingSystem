package com.codeclan.AllDayLab.CourseBookingSystem.Repositories.CustomerRepository;

import com.codeclan.AllDayLab.CourseBookingSystem.Models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    public List<Customer> findCustomersByCourse(Long id);
}
