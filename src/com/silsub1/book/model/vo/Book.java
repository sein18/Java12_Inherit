	package com.silsub1.book.model.vo;


public class Book {
	private String title;
	private String author;
	private int price;
	
	public Book() {
		 
	}
	
	public Book(String title, String author, int price) {
		 this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return title + ", " + author + ", " + price;
	}
	@Override
	public boolean equals(Object obj) {
		// ��ü�� �ּҰ� ������ ������ü
		if (this == obj) {
			return true;
		}
		// ���޹��� ��ü�� null
		if (obj == null) {
			return false;
		}
		////////////////
		// �ʵ尪 ��
		Book other = (Book) obj;
		////title ��
		if (title == null) {
			if (other.title != null) {
				return false;
			}
			// �� ��ü�� title���� ���� �ٸ��� false ����
		} else if (!title.equals(other.title)) {
			return false;
		}
		////writer ��
		if (author == null) {
			if (other.author != null) {
				return false;
			}
			// �� ��ü�� title���� ���� �ٸ��� false ����
		} else if (!author.equals(other.author)) {
			return false;
		}
		////price ��
		if (price != other.price) {
			return false;
		}
		//��� ���� ����ϸ� �� ��ü�� ���� ��ü
		return true;
	}
	@Override
	public int hashCode() {
		return (title+author+price).hashCode(); 
	}
	
}
