package com.silsub2.point.main;

import com.silsub2.point.model.vo.Circle;
import com.silsub2.point.model.vo.Rectangle;

public class Main {

	public static void main(String[] args) {
		Circle c = new Circle(10,20,2);
		c.draw();
		Rectangle r =new Rectangle(10,20,20,20);
		r.draw();
	}

}
