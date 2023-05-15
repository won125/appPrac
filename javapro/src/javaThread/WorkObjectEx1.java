package javaThread;

public class WorkObjectEx1 {

	public static void main(String[] args) {
		WorkObject object = new WorkObject();
		ThreadWorkA threadWorkA = new ThreadWorkA(object);
		ThreadWorkB threadWorkB = new ThreadWorkB(object);
		threadWorkA.start();
		threadWorkB.start();

	}

}
