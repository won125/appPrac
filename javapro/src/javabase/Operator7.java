package javabase;

import java.util.Scanner;

public class Operator7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.print("수를 입력해주시오 >> ");
		num1=sc.nextInt();
		int num2;
		System.out.print("수를 입력해주시오 >> ");
		num2=sc.nextInt();
		if(num1>num2) {
			System.out.println("두 수중 큰 값은 = "+num1);
		}else if(num1<num2) {
			System.out.println("두 수중 큰 값은 = "+num2);
		}else {
			System.out.println("두 수는 같습니다.");
		}
		sc.close();

	}

}
