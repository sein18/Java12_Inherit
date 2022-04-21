package com.inherit.chap01.after.model.dto;

import java.util.Date;

public class Product {
	private String brand;
	private String productNumber;
	private String productCode;
	private String productName;
	private int price;
	private Date data;

	// »ý¼ºÀÚ
	public Product() {
	}

	public Product(String brand, String productNumber, String productCode, String productName, int price, Date data) {

		this.brand = brand;
		this.productNumber = productNumber;
		this.productCode = productCode;
		this.productName = productName;
		this.price = price;
		this.data = data;
	}

	// getter&setter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	// information
	public String information() {
		return brand + ", " + productNumber + ", " + productCode + ", " + productName + ", " + price + ", " + data;
	}
}