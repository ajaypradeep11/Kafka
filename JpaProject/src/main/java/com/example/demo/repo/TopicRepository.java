package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.topic.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{

	
}
