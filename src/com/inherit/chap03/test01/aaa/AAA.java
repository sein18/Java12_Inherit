package com.inherit.chap03.test01.aaa;

public class AAA {
	
	private int abc;

	//扁夯积己磊
	public AAA() {	
		//super();
		System.out.println("AAA 积己");
	}
	public AAA(int abc) {
		//super();
		System.out.println("AAA 积己(abc 罐酒辑 积己)");
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
		System.out.println("AAA狼 prn 皋家靛");
	}
	
	
}
