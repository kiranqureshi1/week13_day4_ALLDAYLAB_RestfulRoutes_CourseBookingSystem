package com.codeclan.AllDayLab.CourseBookingSystem.Repositories.CustomerRepository;

import com.codeclan.AllDayLab.CourseBookingSystem.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
    public List<Customer> findCustomersByCourse(Long id);
}
