package javaThread;

public class ThreadWorkB extends Thread{
	//객체 필드
		private WorkObject object;
		//생산자
		public ThreadWorkB(WorkObject object) {
			this.object = object;
		}
		//매서드 오버라이드
		@Override
		public void run() {
			for(int i = 1; i<=10; i++) {
				object.methodB();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			}
		}
		

}
