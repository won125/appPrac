package javaClass;
//은행 계좌 클래스
public class Account{
	static String bankName = "신한은행";
	String account_No; //계좌번호
	String  name; //예금주 이름
	int money; //잔액
	
	// 생성자
	Account(String account_No, String  name,int money){
		this.account_No = account_No;
		this.money = money;
		this.name = name;
	}
	
	//디폴트 생성자
	Account(){
		
	}
	
	//매서드
	//예금
	void deposit(int amount) {
		money+=amount;
	}
	//인출
	int withdraw(int amount) throws Exception{
		if(money<amount) {
			throw new Exception("잔액이 부족합니다.");
		}
		money-=amount;
		return amount;
	}
	
	//객체 출력 매서드
	void printAccount(Account obj) {
		System.out.println("계좌번호 : " + obj.account_No);
		System.out.println("예금주 이름 : " + obj.name);
		System.out.println("잔 액 : " + obj.money);
		System.out.println("===============================");
	}
}