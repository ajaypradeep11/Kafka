package com.example.demo.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics = "Random_Topic" , groupId = "Random_Group")
	public void listenToTopic(String msg) { 
		System.out.println("The msg is " + msg);
	}
}
