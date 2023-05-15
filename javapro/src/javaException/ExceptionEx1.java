package javaException;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try{
			int num1=10;
			int num2=5;
			String str = "안녕하세요";
			int[] nums = {10,20,30};
			int resualt = num1/num2;
			String data1 = "200";
			String data2 = "a300";
			System.out.println("계산 결과 : "+resualt);
			System.out.println(str.toString());
			System.out.println(nums[2]);
			System.out.println(Integer.parseInt(data1)+Integer.parseInt(data2));
		}catch (NullPointerException e) {
			System.out.println("문자를 참조하고 있지 않습니다.");
		}catch (ArithmeticException e){
			System.out.println("0으로 나눌 수는 없습니다.");
		}catch(Exception e) {
			System.out.println("개발자에게 문의하세요(010-0000-0000"+e.getMessage());
		}
		finally {
			System.out.println("값을 다시 확인하고 실행하세요.");
		}
			

	}

}
