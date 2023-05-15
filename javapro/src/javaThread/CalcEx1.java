package javaThread;

public class CalcEx1 {

	public static void main(String[] args) {
		Calc calc = new Calc();
		MyThread1 myThread1 = new MyThread1();
		myThread1.setCalc(calc);
		myThread1.start();
		MyThread2 myThread2 = new MyThread2();
		myThread2.setCalc(calc);
		myThread2.start();
		

	}

}
