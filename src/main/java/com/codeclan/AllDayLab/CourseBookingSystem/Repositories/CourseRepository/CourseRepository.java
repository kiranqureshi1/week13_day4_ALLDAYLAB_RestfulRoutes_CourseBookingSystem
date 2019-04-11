package com.codeclan.AllDayLab.CourseBookingSystem.Repositories.CourseRepository;

import com.codeclan.AllDayLab.CourseBookingSystem.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
    List<Course> findCoursesByRating(int rating);
    public List<Course> findCourseByCustomer(Long id);
}
