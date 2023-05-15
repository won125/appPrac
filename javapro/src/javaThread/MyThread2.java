package javaThread;

public class MyThread2 extends Thread{
	//필드
	private Calc calc;
	//메서드
	public void setCalc(Calc calc) {
		this.setName("MyThread2");
		this.calc=calc;
	}
	
	@Override
	public void run() {
		calc.setMemory(50);
		
	}

}
