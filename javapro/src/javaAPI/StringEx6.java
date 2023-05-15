package javaAPI;

public class StringEx6 {

	public static void main(String[] args) {
		//앞뒤 공백 잘라내기(trim)
		String str = "  안녕하세요   ";
		System.out.println(str);
		System.out.println(str.trim());
		String str1 = str.valueOf(50);
		System.out.println(str1);

	}

}
