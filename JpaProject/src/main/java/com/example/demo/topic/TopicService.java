package com.example.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repo.TopicRepository;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository repo;
	
	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		repo.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		return repo.findById(id).get();
	}

	public void addTopic(Topic topic) {
		repo.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
		repo.save(topic);
		
	}

	public void deleteTopic(String id) {
		repo.deleteById(id);
		
	}
	
}
