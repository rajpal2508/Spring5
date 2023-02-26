package com.SpringBoot.P01.Springproject01;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	// Course: id, name, author
	private record Course1(long id, String name,String author) {};
	
	// /courses (to hit the url /courses use @requestmapping)
	@RequestMapping("/courses")
	public List<Course1> retriveAllcourses(){
		return Arrays.asList(
				new Course1(1, "JaVa", "Rajpal"),
				new Course1(2, "Spring", "Harsih"));
	}
}
