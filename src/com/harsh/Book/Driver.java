package com.harsh.Book;

public class Driver {
public static void main(String[] args) {
	Book book = new Book("Java Basics ",1200);
	Book book1 = new Book("OP Master",1200.56);
	Book book2 = new Book("Spring Boot  ",1200.67);
	Book[] bookArr = {book,book1,book2};
	for (int index = 0; index < bookArr.length; index++) {
		bookArr[index].displayBook();
		System.out.println();
	}
//	book.displayBook();
//	System.out.println();
//	book1.displayBook();
//	System.out.println();
//	book2.displayBook();
}
}
