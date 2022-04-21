package com.inherit.chap01.before.model.dto;

import java.util.Date;

public class Desktop {
	private String brand;    		//������
	private String productNumber;   //��ǰ��ȣ
	private String productCode;   	//��ǰ�ڵ�
	private String productName;   	//��ǰ��
	private String cpu;   			//cpu
	private int hdd;   				//�ϵ��ũ
	private int ram;				//�޸�
	private String os;				//�ü��
	private int price;				//����
	private Date date;				//��������
	private boolean allInOne;		//��ü�� ����

	
	//������(�⺻, �Ű�����)
	public Desktop() {}

	public Desktop(String brand, String productNumber, String productCode, String productName, String cpu, int hdd, int ram, String os,int price, Date date, boolean allInOne) {
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
		this.allInOne = allInOne;
	}
	
	//getter&setter
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
	public void setProductCode1(String productCode) {
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
	public boolean getAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	
	
	//information
	public void information() {
		System.out.println(brand + ", " + productNumber + ", " + productCode + ", " + productName + ", " + cpu + ", "
				+ hdd + ", " + ram + ", " + os + ", " + price + ", " + date + ", " + allInOne);
	}
	
}
