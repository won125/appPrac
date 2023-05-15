package javaThread;

public class StartThread extends Thread{
	//객체 필드
	private Thread targetThread;
	//생성자
	public StartThread(Thread target) {
		targetThread = target;
	}
	//메서드
	@Override
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("현재 스레드 상태 : "+state);
			if(state == Thread.State.NEW) { // 생성상태라면 => 실행대기상태로 만듬 
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) { // 
				break;
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}
	}

}
