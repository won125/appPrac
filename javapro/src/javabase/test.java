package javabase;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money=sc.nextInt();
		int manwon=0;
		int ocheonwon=0;
		int cheonwon=0;
		int obackwon=0;
		int backwon=0;
		int sipwon=0;
		
		manwon = money/10000;
		money = money%10000;
		
		ocheonwon = money/5000;
		money = money%5000;
		
		cheonwon = money/1000;
		money = money%1000;
		
		obackwon = money/500;
		money = money%500;
		
		backwon = money/100;
		money = money%100;
		
		sipwon = money/10;
		money = money%10;
		
		System.out.println("만원권>>"+manwon+"장");
		System.out.println("오천원권>>"+ocheonwon+"장");
		System.out.println("천원권>>"+cheonwon+"장");
		System.out.println("오백원>>"+obackwon+"개");
		System.out.println("백원>>"+backwon+"개");
		System.out.println("십원>>"+sipwon+"개");

	}

}
