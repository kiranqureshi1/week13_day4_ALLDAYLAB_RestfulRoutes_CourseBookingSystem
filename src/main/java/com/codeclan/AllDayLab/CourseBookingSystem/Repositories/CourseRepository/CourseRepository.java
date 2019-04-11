package com.codeclan.AllDayLab.CourseBookingSystem.Repositories.CourseRepository;

import com.codeclan.AllDayLab.CourseBookingSystem.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
}
