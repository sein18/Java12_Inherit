package com.inherit.chap01.before.model.dto;

import java.util.Date;

public class SmartPhone {
	private String brand;
	private String productNumber;
	private String productCode;
	private String productName;
	private String cpu;
	private int hdd;
	private int ram;
	private String os;
	private int price;
	private Date date;
	private String mobileAgency;
	
	// ������(�⺻, �Ű�����)
	public SmartPhone() { }

	public SmartPhone(String brand, String productNumber, String productCode, String productName, String cpu, int hdd,
			int ram, String os, int price, Date date, String mobileAgency) {
		this.brand = brand;
		this.productNumber = productNumber;
		this.productCode = productCode;
		this.productName = productName;
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.os = os;
		this.price = price;
		this.date = date;
		this.mobileAgency = mobileAgency;
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

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
 
	// information() : void
	public void information() {
		System.out.println(brand + ", " + productNumber + ", " + productCode + ", " + productName + ", " + cpu + ", "
				+ hdd + ", " + ram + ", " + os + ", " + price + ", " + date + ", " + mobileAgency);
	}

}
