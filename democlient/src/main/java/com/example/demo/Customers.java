package com.example.demo;

import java.util.ArrayList;
import java.util.List;



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

//@JsonInclude(content = Include.NON_NULL, value = Include.NON_NULL)

public class Customers {
	
	private String uuid;
	
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Discount> getEligibleDiscounts() {
		return eligibleDiscounts;
	}
	public void setEligibleDiscounts(List<Discount> eligibleDiscounts) {
		this.eligibleDiscounts = eligibleDiscounts;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	private String name;
	private String address;
	private List<Discount> eligibleDiscounts = new ArrayList();
	private List<Product> products = new ArrayList();

}
