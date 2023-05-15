package javabase;

import java.util.Scanner;

public class OperatorEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구입 수량 >> ");
		int amount=sc.nextInt();
		System.out.print("구입 단가 >> ");
		int price=sc.nextInt();
		int total_price=amount*price;
		if(amount>=10 && price>1000) {
			total_price=total_price-(int)(total_price*0.2);
			System.out.println("구입 금액 >> "+total_price);
		}
		else {
			System.out.println("구입 금액 >> "+total_price);
		}
		
		
		
	}

}
