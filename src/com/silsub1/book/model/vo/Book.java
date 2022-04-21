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
		// 객체의 주소가 같으면 같은객체
		if (this == obj) {
			return true;
		}
		// 전달받은 객체가 null
		if (obj == null) {
			return false;
		}
		////////////////
		// 필드값 비교
		Book other = (Book) obj;
		////title 비교
		if (title == null) {
			if (other.title != null) {
				return false;
			}
			// 두 객체의 title값이 서로 다르면 false 리턴
		} else if (!title.equals(other.title)) {
			return false;
		}
		////writer 비교
		if (author == null) {
			if (other.author != null) {
				return false;
			}
			// 두 객체의 title값이 서로 다르면 false 리턴
		} else if (!author.equals(other.author)) {
			return false;
		}
		////price 비교
		if (price != other.price) {
			return false;
		}
		//모든 조건 통과하면 두 객체는 같은 객체
		return true;
	}
	@Override
	public int hashCode() {
		return (title+author+price).hashCode(); 
	}
	
}
