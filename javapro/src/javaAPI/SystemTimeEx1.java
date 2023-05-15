package javaAPI;

public class SystemTimeEx1 {

	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		//long time1 = System.nanoTime();
		System.out.println(time1);
		int sum = 0;
		for(int i=1;i<=1000000;i++) {
			sum+=i;
		}
		long time2 = System.currentTimeMillis();
		//long time2 = System.nanoTime();
		System.out.println("1부터 100까지의 합 = " + sum);
		System.out.println("계산작업에 " + (time2-time1) + "초가 소요됨");

	}

}
