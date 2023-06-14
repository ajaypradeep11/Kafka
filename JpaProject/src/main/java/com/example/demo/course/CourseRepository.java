package com.example.demo.course;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.topic.Topic;

public interface CourseRepository extends CrudRepository<Course, String>{

	
}
