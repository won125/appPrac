package javaThread;

public class CalcThread extends Thread{
	//생성자
	public CalcThread(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		int sum=0;
		for(long i=1;i<=2000000000L;i++) {
			sum+=i;
		}
		System.out.println(getName()+"가 한 작업(1~2000000까지의 합) = "+sum);
	}

}
