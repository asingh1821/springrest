package com.springrest.com.springrest.service;

import java.util.List;
import java.util.ArrayList;
import com.springrest.com.springrest.entities.Courses;
import org.springframework.stereotype.Service;


@Service
public class CourseServiceImpl implements CourseService {
  
	
	List<Courses>list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Courses(145,"Java core course","this course contains basics of Java"));
		list.add(new Courses(150,"Spring boot course", "Creating RestApi using Spring boot"));
	}
	
	@Override
	public List<Courses> getCourses() {
		
		return list;
	}
    
	@Override
	public Courses getCourse(long courseId) {
		Courses c = null;
		for(Courses course : list) {
			if(course.getId() == courseId) {
				c = course;
				break;
			}
		}
	return c;
	}
@Override
      public Courses addCourse(Courses course) {
	  list.add(course);
	   return course;
}

}




