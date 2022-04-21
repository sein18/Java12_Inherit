package com.silsub1.book.main;

import com.inherit.chap02.override.Book;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("������ ����", "������", 100);
		Book b2 = new Book("�ڹ��� ����", "���ڹ�", 200);

		System.out.println("b1 = " + b1.toString());
		System.out.println("b2 = " + b2.toString());

		// ��
		System.out.println("b1�� b2�� ���� ��ü : " + b1.equals(b2));

		Book b3 = b1;
		System.out.println("b1�� b3�� ���� ��ü : " + b1.equals(b3));
		// System.out.println(b1.hashCode());
		// System.out.println(b3.hashCode());

		// b1�� ���� ������ ��ü ����
		Book b4 = new Book("������ ����", "������", 100);
		System.out.println("b1�� b4�� ���� ��ü : " + b1.equals(b4));
		System.out.println(b1.hashCode());
		System.out.println(b4.hashCode());

	}

}
