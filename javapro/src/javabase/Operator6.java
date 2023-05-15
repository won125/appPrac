package javabase;

import java.util.Scanner;

public class Operator6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("나이를 입력하시오 >> ");
		age=sc.nextInt();
		if(age>=20 && age<=29) {
			System.out.println("가입이 가능합니다.");
		}
		else {
			System.out.println("가입 연령에 해당되지 않습니다.");
		}

	}

}
