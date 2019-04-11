package com.codeclan.AllDayLab.CourseBookingSystem.Repositories.BookingRepository;

import com.codeclan.AllDayLab.CourseBookingSystem.Models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
    List<Booking> findBookingByDate(String date);

}
