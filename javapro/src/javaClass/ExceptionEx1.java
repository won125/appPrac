package javaClass;

public class ExceptionEx1 {

	public static void main(String[] args) {
		int num1=10;
		int num2=0;
		try {
			int resualt=num1/num2;
			System.out.println(resualt);	
		}catch (ArithmeticException e) {
			System.out.println("0으로 나누지 마세요!");
		}
		
		
		
		
	}

}
