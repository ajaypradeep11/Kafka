package com.example.demo.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;



@Service
public class CourseService {
	
	@Autowired
	private CourseRepository repo;
		
	public List<Course> getAllCourses(String id) {
		List<Course> Courses = new ArrayList<>();
		repo.findAll().forEach(Courses::add);
		return Courses;
	}
	
	public Course getCourse(String id) {
		return repo.findById(id).get();
	}

	public void addCourse(Course Course) {
		repo.save(Course);
	}

	public void updateCourse(Course Course) {
		repo.save(Course);
		
	}

	public void deleteCourse(String id) {
		repo.deleteById(id);
		
	}
	
}
