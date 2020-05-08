package com.zensar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product 
{
	@Id
	@GeneratedValue
	private Integer ProductId;
	private String ProductName;
	private double ProductCost;
	
	public Product()
	{
		super();
	}

	public Product(String productName)
	{
		super();
		ProductName=productName;
	}
	public Product(Integer productId, String productName, double productCost) {
		super();
		ProductId = productId;
		ProductName = productName;
		ProductCost = productCost;
	}
	public Integer getProductId() {
		return ProductId;
	}
	public void setProductId(Integer productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public double getProductCost() {
		return ProductCost;
	}
	public void setProductCost(double productCost) {
		ProductCost = productCost;
	}
	
	
}
