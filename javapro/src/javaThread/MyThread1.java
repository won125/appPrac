package javaThread;

public class MyThread1 extends Thread{
	//필드
	private Calc calc;
	//메서드
	public void setCalc(Calc calc) {
		this.setName("MyThread1");
		this.calc=calc;
	}
	
	@Override
	public void run() {
		calc.setMemory(100);
		
	}

}
