package com.codeclan.AllDayLab.CourseBookingSystem;

import com.codeclan.AllDayLab.CourseBookingSystem.Models.Booking;
import com.codeclan.AllDayLab.CourseBookingSystem.Models.Course;
import com.codeclan.AllDayLab.CourseBookingSystem.Models.Customer;
import com.codeclan.AllDayLab.CourseBookingSystem.Repositories.BookingRepository.BookingRepository;
import com.codeclan.AllDayLab.CourseBookingSystem.Repositories.CourseRepository.CourseRepository;
import com.codeclan.AllDayLab.CourseBookingSystem.Repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookingSystemApplicationTests {

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canFindBookingByDate(){
		List<Booking> found = bookingRepository.findBookingByDate("20-5-19");
		assertEquals(1, found.get(0).getId(), 0);
	}

	@Test
	public void canFindCoursesByRating(){
		List<Course> found = courseRepository.findCoursesByRating(4);
		assertEquals("Java", found.get(0).getName());
	}

	@Test
	public void canFindCustomersByCourse(){
		List<Customer> found = customerRepository.findCustomersByCourse(2L);
		assertEquals(1, found.size());
		assertEquals("Kira", found.get(0).getName());
	}

	@Test
	public void canFindCourseByCustomer(){
		List<Course> found = courseRepository.findCourseByCustomer(2L);
		assertEquals(1, found.size());
		assertEquals("Python", found.get(0).getName());
	}

	@Test
	public void canFindCustomersByCourseAndTown(){
		List<Customer> found = customerRepository.findCustomersByCourseAndTown(2L);
		assertEquals(1, found.size());
		assertEquals("Kira", found.get(0).getName());
	}

	@Test
	public void canFindCustomersOverCertainAgeByTownbyCourseId(){
		List<Customer> found = customerRepository.findCustomersOverCertainAgeByTownbyCourseId(39,1L);
		assertEquals(1, found.size());
		assertEquals("Chika", found.get(0).getName());
	}




}
