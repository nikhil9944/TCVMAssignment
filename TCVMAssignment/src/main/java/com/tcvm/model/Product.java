package com.tcvm.model;

public class Product {
	private String productName;
	private int productQuantity;
	private int productCost;

	public String getProductName() {
		return productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public int getProductCost() {
		return productCost;
	}

	public Product(String productName, int productQuantity, int productCost) {
		super();
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productCost = productCost;
	}

}
