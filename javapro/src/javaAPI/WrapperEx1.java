package javaAPI;

public class WrapperEx1 {

	public static void main(String[] args) {
		//포장 클래스
		Integer obj1 = 100; //자동 박싱
		Integer obj2 = 100;
		if(obj1.equals(obj2)) {
			System.out.println("같은 값입니다.");
		}else {
			System.out.println("다른 값입니다.");
		}
		System.out.println(obj1);
		int value = obj1; //자동 언박싱
		String str1 = "10";
		String str2 = "20";
		System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));

	}

}
