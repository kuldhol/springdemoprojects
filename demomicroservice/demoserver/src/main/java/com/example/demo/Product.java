package com.example.demo;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

//@JsonInclude(content = Include.NON_NULL, value = Include.NON_NULL)
@Document
public class Product {
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(BigDecimal originalPrice) {
		this.originalPrice = originalPrice;
	}
	public BigDecimal getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(BigDecimal finalPrice) {
		this.finalPrice = finalPrice;
	}
	public Discount getDiscountinformation() {
		return discountinformation;
	}
	public void setDiscountinformation(Discount discountinformation) {
		this.discountinformation = discountinformation;
	}
	private String productId;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	private String description;
	private BigDecimal originalPrice;
	private BigDecimal finalPrice;
	private Discount discountinformation;
}
