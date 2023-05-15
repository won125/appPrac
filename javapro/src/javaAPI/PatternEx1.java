package javaAPI;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternEx1 {

	public static void main(String[] args) {
		// 정규 표현식
		Scanner sc = new Scanner(System.in);
		String regExp="(02|010)-\\d{3,4}-\\d{4}";
		System.out.print("전화번호를 입력하시오>>");
		String data = sc.next();
		System.out.println();
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("전화번호 형식이 일치합니다.");
		}else {
			System.out.println("전화번호 형식과 틀립니다.");
		}
		System.out.print("이메일 입력>>");
		String email = sc.next();
		String regExpEmail = "\\w+@\\w+(\\.+\\w+)?";
		result = Pattern.matches(regExpEmail, email);
		if(result) {
			System.out.println("이메일 주소 형식이 일치합니다.");
		}else {
			System.out.println("이메일 주소 형식과 틀립니다.");
		}
		
		

	}

}
