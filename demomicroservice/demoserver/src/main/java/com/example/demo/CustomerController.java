/**
 * 
 */
package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author Dinesh.Rajput
 *
 */
@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	MongoOperations mongoOperations;
	/**
	 * GET /create  --> Create a new booking and save it in the database.
	 */
	@RequestMapping("/create")
	public Map<String, Object> create(Customers customers) {
		//customers.setTravelDate(new Date());
		customers.setName("test");
		customers.setAddress("abc");
		customers.setUuid("qa-test-user1");
		Discount discounts = new Discount();
		discounts.setDescription("test");
		List<Discount> lst = new ArrayList<>();
		lst.add(discounts);
		customers.setEligibleDiscounts(lst);
		customers = customerRepository.save(customers);
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("message", "Booking created successfully");
		dataMap.put("status", "1");
		dataMap.put("customers", customers);
	    return dataMap;
	}
	
	
	
	/**
	 * GET /read  --> Read a booking by booking id from the database.
	 */
	@RequestMapping("/read")
	public Map<String, Object> read() {
		System.out.println("mongoOperations " + mongoOperations);
		/*
		customerRepository.
		Discount discount = customerRepository.find(new Query(Criteria
				  .where("empId").lte(10001).and("empAge").is(21)), "dojCollection", Employee.class);
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("message", "Customers found successfully");
		dataMap.put("status", "1");
		dataMap.put("customers", customers);
	    return dataMap;
	*/
		return null;
	}
	
	
	@RequestMapping("/read-all")
	public List<Customers> readAll() {
		List<Customers> customers = customerRepository.findAll();
	    return customers;
	}
	
	
}
