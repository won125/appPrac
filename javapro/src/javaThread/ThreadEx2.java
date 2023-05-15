package javaThread;

public class ThreadEx2 {

	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
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
