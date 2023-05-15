package javaClass;
//바깥클래스
public class Button {
	
	OnClickListener listener; // 인터페이스 타입 필드
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}

	//인터페이스
	interface OnClickListener{
		//추상 메서드	
		void onClick();
	}

}
