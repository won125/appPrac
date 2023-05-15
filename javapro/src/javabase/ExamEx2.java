package javabase;

import java.util.Scanner;

public class ExamEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("숫자 입력>>");
		num=sc.nextInt();
		for(int i = 0; i<num;i++) {
				for(int j=0;j<i;j++) {
					if(i==num) {
						
					}
					System.out.print(" ");
				}
				for(int j=0;j<i;j++) {
					System.out.print("*");
				}
			System.out.println();
		}
	}

}
