package com.springrest.com.springrest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.com.springrest.entities.Courses;
import com.springrest.com.springrest.service.CourseService;

@RestController
public class MyController {
  
	@Autowired
	private CourseService courseService;
	
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to courses application, hi";
	}
	
	
	//Get the Courses
	@GetMapping("/courses")
	public List<Courses> getCourses()
	{
	return this.courseService.getCourses();	
	}
	
	//single courses get
	@GetMapping("/courses/{courseId}")
	
	public Courses getCourse(@PathVariable String CourseId) {
		return this.courseService.getCourse(Long.parseLong(CourseId));
	}
	
	//add course
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses course) {
		return this.courseService.addCourse(course);
	}
	
	
	
	
}
