package com.example.demoSpringBooTProfond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demoSpringBooTProfond.entity.Message;

@SpringBootApplication
public class DemoSpringBooTProfondApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBooTProfondApplication.class, args);
		Message m = new Message();
	
	}

}
