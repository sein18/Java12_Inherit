package com.inherit.chap03.test01.aaa;

public class AAA {
	
	private int abc;

	//�⺻������
	public AAA() {	
		//super();
		System.out.println("AAA ����");
	}
	public AAA(int abc) {
		//super();
		System.out.println("AAA ����(abc �޾Ƽ� ����)");
		this.abc = abc;
	}
	
	//getter&setter
	public int getAbc() {
		return abc;
	}
	public void setAbc(int abc) {
		this.abc = abc;
	}
	public void prn() {
		System.out.println("AAA�� prn �޼ҵ�");
	}
	
	
}
