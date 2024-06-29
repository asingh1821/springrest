package com.springrest.com.springrest.service;

import java.util.List;
import com.springrest.com.springrest.entities.Courses;

public interface CourseService {

	public List<Courses>getCourses();
	
	public Courses getCourse(long courseId);
	public Courses addCourse(Courses course);
}
