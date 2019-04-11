package com.codeclan.AllDayLab.CourseBookingSystem.controllers;

import com.codeclan.AllDayLab.CourseBookingSystem.Models.Booking;
import com.codeclan.AllDayLab.CourseBookingSystem.Repositories.BookingRepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/{date}")
    public List<Booking> findBookingsForGivenDate(String date){
        return bookingRepository.findBookingByDate(date);
    }


}
