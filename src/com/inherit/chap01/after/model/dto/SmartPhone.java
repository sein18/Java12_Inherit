package com.inherit.chap01.after.model.dto;

import java.util.Date;

public class SmartPhone extends Computer{
	private String mobileAgency;
	
	
	public SmartPhone() {	}


	public SmartPhone(String brand, String productNumber, String productCode, String productName, int price, Date data,
			String cpu, int hdd, int ram, String os, String mobileAgency) {
		super(brand, productNumber, productCode, productName, price, data, cpu, hdd, ram, os);
		this.mobileAgency = mobileAgency;
	}


	public String getMobileAgency() {
		return mobileAgency;
	}


	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	@Override
	public String information() {
		return super.information() + ", " + this.mobileAgency;
	}
}
