package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Producer;

@RestController
@RequestMapping("/rest/checkAPI")
public class RestControllerForKafkaMsg {

	//Weather Toronto
	@Autowired
	Producer producer;
	
	@GetMapping("/messageForProducertoTopic")
	public void getMessageFromClient(@RequestParam("message") String message) {
		producer.sendMessagetoTopic(message);
		
	}
}
