package javaSpecial;

import java.awt.Toolkit;

public class ThreadEx1 {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit(),;
			for(int i=1;i<=5;i++) {
				toolkit.beep();
				Thread.sleep(500);
			}
		});
		

	}

}
