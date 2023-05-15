package javaClass;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Account chulsu = new Account();
		chulsu.account_No = "111-222-33333";
		chulsu.name = "김철수";
		chulsu.money = 1500;
		Account younghee = new Account();
		younghee.account_No = "111-333-55555";
		younghee.name = "이영희";
		younghee.money = 0;
		Scanner sc = new Scanner(System.in);
		int money=0;
		int select_Num;
		boolean run=true;
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println("1.입 금 | 2.출 금 | 3.잔액 조회 | 4.종 료");
			System.out.println("----------------------------------------");
			System.out.print("선택>>");
			select_Num = sc.nextInt();
			switch(select_Num) {
			case 1:
				System.out.println("-----------------------------");
				System.out.println("         입      금");
				System.out.println("-----------------------------");
				System.out.print("입금액>>");
				money = sc.nextInt();
				chulsu.deposit(money);
				System.out.println("입금 후 잔액 >> "+chulsu.money);
				break;
			case 2:
				System.out.println("-----------------------------");
				System.out.println("         출      금");
				System.out.println("-----------------------------");
				System.out.print("출금액>>");
				money = sc.nextInt();
				try {
					chulsu.withdraw(money);
					System.out.println("출금 후 잔액 >> "+chulsu.money);
					break;
				}catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("찾는 급액 : "+ money);
				System.out.println("잔 액 : "+chulsu.money);
				break;
				}
			case 3:
				System.out.println("-----------------------------");
				System.out.println("        잔액     조회");
				System.out.println("-----------------------------");
				System.out.println(" 잔액 >> "+chulsu.money);
				break;
			case 4:
				System.out.println("프로그램 종료");
				run=false;
				break;
				default:
					System.out.println("Input Error!!!!!");
					break;
			}
		}

	}

}
