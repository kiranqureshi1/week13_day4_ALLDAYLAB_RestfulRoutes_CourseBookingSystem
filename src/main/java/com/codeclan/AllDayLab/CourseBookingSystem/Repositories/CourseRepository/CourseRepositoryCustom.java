package com.codeclan.AllDayLab.CourseBookingSystem.Repositories.CourseRepository;

import com.codeclan.AllDayLab.CourseBookingSystem.Models.Course;

import java.util.List;

public interface CourseRepositoryCustom {
    public List<Course> findCourseByCustomer(Long id);
}
