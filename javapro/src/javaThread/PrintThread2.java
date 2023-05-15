package javaThread;

public class PrintThread2 extends Thread{

	@Override
	public void run() {
		try {
		while(true) {
			System.out.println("나는 실행중...");
				Thread.sleep(1);
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("자원정리");
		System.out.println("실행종료");
	}

}
