package javabase;

import java.util.Scanner;

public class IFStatementEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.print("점수입력>>");
		score=sc.nextInt();
		
		if(score>=90) {
			System.out.println("A긍급입니다.");
		}else if(score<90 && score>=80) {
			System.out.println("B긍급입니다.");
		}else if(score<80 && score>=70) {
			System.out.println("C긍급입니다.");
		}else if(score<70 && score>=60) {
			System.out.println("D긍급입니다.");
		}else {
			System.out.println(" F긍급입니다.");
		}
		

	}

}
