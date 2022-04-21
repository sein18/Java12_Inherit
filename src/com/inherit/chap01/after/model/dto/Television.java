package com.inherit.chap01.after.model.dto;

import java.util.Date;

public class Television extends Product{
	private int inchType;
	
	
	public Television() { }
	
	public Television(String brand, String productNumber, String productCode, String productName, int price, Date data,
			int inchType) {
		//�θ��� ������ ȣ��
		super(brand, productNumber, productCode, productName, price, data);

		this.inchType = inchType;
	}

	public int getInchType() {
		return inchType;
	}

	public void setInchType(int inchType) {
		this.inchType = inchType;
	}
	
	@Override
	public String information() {
		return super.information() + ", " + this.inchType;
	}
}
