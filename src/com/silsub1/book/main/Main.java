package com.silsub1.book.main;

import com.inherit.chap02.override.Book;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("수학의 정석", "나수학", 100);
		Book b2 = new Book("자바의 정석", "다자바", 200);

		System.out.println("b1 = " + b1.toString());
		System.out.println("b2 = " + b2.toString());

		// 비교
		System.out.println("b1과 b2는 같은 객체 : " + b1.equals(b2));

		Book b3 = b1;
		System.out.println("b1과 b3는 같은 객체 : " + b1.equals(b3));
		// System.out.println(b1.hashCode());
		// System.out.println(b3.hashCode());

		// b1과 없이 동일한 객체 생성
		Book b4 = new Book("수학의 정석", "나수학", 100);
		System.out.println("b1과 b4는 같은 객체 : " + b1.equals(b4));
		System.out.println(b1.hashCode());
		System.out.println(b4.hashCode());

	}

}
