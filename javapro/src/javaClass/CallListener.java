package javaClass;
//구현 클래스

import javax.swing.ButtonModel;

public class CallListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
		
	}
	

}
