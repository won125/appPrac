package javaThread;

public class JobThread extends Thread{
	@Override
	public void run() {
		//for문을 반복 수행
		for(long i = 0; i < 2000000000; i++) {
			
		}
		//1초 일시정지
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
		//for문을 반복 수행
		for(long i = 0; i < 2000000000; i++) {
			
		}
	}

}
