package javaSpecial;

import java.util.Stack;

public class StackEx1 {

	public static void main(String[] args) {
		Stack<Book> str = new Stack<Book>();
		str.push(new Book("java"));
		str.push(new Book("html"));
		str.push(new Book("react"));
		str.push(new Book("nodejs"));
		while(!str.isEmpty()) {
			Book book = str.pop();
			System.out.println("²¨³½ Ã¥ : " + book.getName());
		}
		

	}

}
