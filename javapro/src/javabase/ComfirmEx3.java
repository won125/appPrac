package javabase;

import java.util.Scanner;

public class ComfirmEx3 {

	public static void main(String[] args) {
		boolean run=true;
		
		int balance=0;
		int choice=0;
		int money=0;
		
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택>>");
			
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("예금액>>");
				balance=sc.nextInt();
				money+=balance;
				break;
			case 2:
				System.out.print("출금액>>");
				balance=sc.nextInt();
				money-=balance;
				break;
			case 3:
				System.out.println("잔고>"+money);
				break;
			case 4:
				System.out.println("프로그램 종료");
				run=false;
				break;
			}
		}

	}

}
