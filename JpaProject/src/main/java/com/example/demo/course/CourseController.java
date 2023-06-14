package com.example.demo.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.topic.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService service;
	
	@RequestMapping("/topic/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String id) {
		return service.getCourse(id);
	}
	
	@RequestMapping("/topics/{id}/courses" )
	public List<Course> getAllCourse(@PathVariable String id) {
		return service.getAllCourses(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/topic/{topicId}/courses")
	public void addCourse(@RequestBody Course course,  @PathVariable String topicId) {
		course.setTopic(new Topic(topicId, "", ""));
		service.addCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/topic/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Course course,@PathVariable String topicId, @PathVariable String id) {
		course.setTopic(new Topic(topicId, "", ""));
		service.updateCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/topic/{topicId}/courses/{id}}")
	public void deleteCourse(@PathVariable String id) {
		service.deleteCourse(id);
	}
	  
}
