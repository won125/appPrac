package javaClass;

public class AccountEx2 {

	public static void main(String[] args) {
		Account gildong = new Account("111-222-66666", "홍길동", 10);
		Account chanho = new Account("333-888-77777", "박찬호", 10000);
		gildong.deposit(2000);
		chanho.deposit(600);
		try {
			gildong.withdraw(750);	
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		/*
		System.out.println("계좌번호 : " + gildong.account_No);
		System.out.println("예금주 이름 : " + gildong.name);
		System.out.println("잔 액 : " + gildong.money);
		System.out.println("계좌번호 : " + chanho.account_No);
		System.out.println("예금주 이름 : " + chanho.name);
		System.out.println("잔 액 : " + chanho.money);
		*/
		printAccount(gildong);
		printAccount(chanho);

	}
	
	//통장 내역 출력 매서드
	static void printAccount(Account obj) {
		System.out.println("계좌번호 : " + obj.account_No);
		System.out.println("예금주 이름 : " + obj.name);
		System.out.println("잔 액 : " + obj.money);
		System.out.println("===============================");
	}

}
