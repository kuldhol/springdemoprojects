package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@RequestMapping("/read-all")
	public Customers getCustomers(){
		RestTemplate restTemplate = new RestTemplate();
		Customers customers = restTemplate.getForObject("http://demomicroservice_demoserver_1:8080/customers/read-all", Customers.class);
				return customers;
	}
	
	@RequestMapping("/demo")
	public String hello(){
				return "hi";
	}
}
