package javaThread;

public class WorkObject {
	
	public synchronized void methodA() {
		System.out.println("ThreadWork의 methodA 작업 실행");
		notify(); // 일시정지 => 실행대기상태
		try {
			wait(); // 일시정지
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadWork의 methodB 작업 실행");
		notify(); // 일시정지 => 실행대기상태
		try {
			wait(); // 일시정지
		} catch (InterruptedException e) {
		}
	}

}
