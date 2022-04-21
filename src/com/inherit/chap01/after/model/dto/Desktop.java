package com.inherit.chap01.after.model.dto;

import java.util.Date;

public class Desktop extends Computer{
	private boolean allInOne;
	 
	//������
	public Desktop() { }//super() �ڵ� ����

	public Desktop(String brand, String productNumber, String productCode, String productName, int price, Date data,
			String cpu, int hdd, int ram, String os, boolean allInOne) {
		super(brand, productNumber, productCode, productName, price, data, cpu, hdd, ram, os);
		this.allInOne = allInOne;
	}
	
	//getter&setter
	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	} 
	
	//information
	@Override
	public String information() {
		return super.information() + ", " +this.allInOne;
	}
	
	
	
}
