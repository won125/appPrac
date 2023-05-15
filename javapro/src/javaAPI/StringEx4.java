package javaAPI;

public class StringEx4 {

	public static void main(String[] args) {
		//문자열 대치(replace)
		String str = "자바는 객체지향언어이며 자바는 풍부한 API를 제동합니다.";
		String newStr = str.replace("자바", "JAVA");
		System.out.println(str);
		System.out.println(newStr);
		//문자열 잘라내기(substring)
		String memo = "computer";
		System.out.println(memo.substring(3));
		System.out.println(memo.substring(3,6));

	}

}
