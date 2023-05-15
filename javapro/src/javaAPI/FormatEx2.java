package javaAPI;

import java.text.MessageFormat;

public class FormatEx2 {

	public static void main(String[] args) {
		// 문자열 형식 클래스
		String[] member = {"hong","홍길동","010-7777-7777","hong@naver.com"};
		System.out.println("회원 ID : "+member[0]);
		System.out.println("회원 이름 : "+member[1]);
		System.out.println("회원 전화번호 : "+member[2]);
		System.out.println("회원 이메일 : "+member[3]);
		String text="회원 ID : {0}\n회원이름 : {1}\n전화번호 : {2}\n이메일 : {3}";
		String result = MessageFormat.format(text, member);
		System.out.println(result);

	}

}
