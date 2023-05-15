package javaThread;

public class ThreadA extends Thread{
	//생성자
	public ThreadA() {
		setName("쓰레드A");
	}
	@Override
	public void run() {
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println(getName()+"가 한 작업 1부터100까지의 합 = "+sum);
	}

}
