package javabase;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		char frult='a';
		score=sc.nextInt();
		switch(frult) {
		case 'a':
			System.out.println("apple는 개당 1200원입니다.");
			break;
		case 'b':
			System.out.println("banana는 송이당 1200원입니다.");
			break;
		case 'g':
			System.out.println("grape는 송이당 1200원입니다.");
			break;
			
			
		}
			

	}

}
