package javaThread;

public class ThreadEx3 {

	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println("¶ò!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}

	}

}
