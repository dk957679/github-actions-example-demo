package com.docker.exmaple.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDemoApplication {
	
	@GetMapping("/message")
	public String getMessage()
	{
		return "Welcome to java mave project deploy using Github-Actions !!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
	}

}
