package javaClass;

import java.util.Scanner;

public class CalculatorEx1 {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int kor,eng,mat;
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력>>");
		kor = sc.nextInt();
		System.out.print("영어 점수 입력>>");
		eng = sc.nextInt();
		System.out.print("수학 점수 입력>>");
		mat = sc.nextInt();
		System.out.println("총 점 => "+ cal.total(kor,eng,mat));
		System.out.println("평 균 => "+ cal.average(kor,eng,mat));

	}

}
