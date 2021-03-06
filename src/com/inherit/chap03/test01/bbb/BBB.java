package com.inherit.chap03.test01.bbb;

import com.inherit.chap03.test01.aaa.AAA;

public class BBB extends AAA {
	private int b;

	// 积己磊
	public BBB() {
		// super(); //何葛努贰胶 积己磊 -> AAA();
		System.out.println("BBB 积己");
	}

	public BBB(int abc, int b) {
		super(abc); //何葛狼 积己磊 -> AAA(abc);
		this.b = b;
		System.out.println("BBB 积己(abc, b 罐酒辑 积己)");
	}
	public BBB(int b) {
		super(b);	//何葛狼 积己磊 -> AAA(abc);
		this.b = b;
	System.out.println("BBB 积己(b 罐酒辑 积己)");
	}

	//get&set 
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int getSum() {
		int sum = super.getAbc() + b;
		return sum;
	}
	
	@Override
	public void prn() {
		System.out.println("BB.prn()");
	}
	
}


