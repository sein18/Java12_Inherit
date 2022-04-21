package com.silsub2.point.model.vo;

public class Circle extends Point{
	private int radius;

	public Circle() { }
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.printf("������ = %.2f\n���ѷ� = %.2f",Math.PI*radius+radius,2*Math.PI*radius);
	}
	
}