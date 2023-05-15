package javaSpecial;

public class Person3Ex1 {

	public static void main(String[] args) {
		Person3 younghee;
		
		younghee = (h,w) -> {
			String result = "내 신장은 " + h + " cm이고, 몸무게는 " + w + " kg 이다.";
			return result;
		};
		System.out.println(younghee.info(156, 45));

	}

}
