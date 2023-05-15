package javaSpecial;

public class CalcEx1 {

	public static void main(String[] args) {
		Calc cal;
		
		cal = (a,b) -> {
			int result = a+b;
			return result;
		};
		System.out.println(cal.hap(10, 20));
		//실행할 명령문이 한 줄일때
		cal = (a,b) -> {return a+b;};
		System.out.println(cal.hap(20, 30));
		//실행할 명령문이 한 줄일때 리턴문과 중괄호를 생략
		
		cal = (a,b) -> a+b;;
		System.out.println(cal.hap(30, 40));
		//내부 메서드를 호출해서 처리
		cal = (a,b) -> sum(a,b);
		System.out.println(cal.hap(40, 50));
		//합을 구하는 메서드
		

	}
	public static int sum(int a, int b) {
		return a+b;
	}

}
