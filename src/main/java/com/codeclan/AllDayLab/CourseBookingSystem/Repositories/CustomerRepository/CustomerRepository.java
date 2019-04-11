package com.codeclan.AllDayLab.CourseBookingSystem.Repositories.CustomerRepository;

import com.codeclan.AllDayLab.CourseBookingSystem.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
}
