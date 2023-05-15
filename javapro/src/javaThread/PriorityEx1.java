package javaThread;

public class PriorityEx1 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			Thread thread = new CalcThread("Thread" + i);
			if(i==7) {
				thread.setPriority(Thread.MAX_PRIORITY);
			}else {
				thread.setPriority(Thread.MIN_PRIORITY);
			}
			thread.start();
		}

	}

}
