package javaAPI;

import java.util.Scanner;

public class StringEx1 {

	public static void main(String[] args) {
		String str = "내일부터 어린이날 휴무";
		System.out.println(str);
		char ch = str.charAt(7);
		System.out.println(ch);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호 입력 >> ");
		String jumin = sc.next();
		ch = jumin.charAt(7);
		if(jumin.length()==14) {
			if(ch=='1' || ch=='3') {
				System.out.println("남자입니다.");
			}else if(ch=='2' || ch=='4') {
				System.out.println("여자입니다.");
			}else {
				System.out.println("잘못된 주민등록번호입니다.");
			}
		}else {
			System.out.println("잘못된 주민등록번호입니다.");
		}
		

	}

}
