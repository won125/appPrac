package javaThread;

public class ThreadStateEx1 {

	public static void main(String[] args) {
		StartThread startThread = new StartThread(new JobThread());
		startThread.start();

	}

}
