package javaClass;

public class Cheomseongdae {
	private static Cheomseongdae cheomseongdae = new Cheomseongdae();
	
	//생성자
	private Cheomseongdae() {
		
	}
	
	//정적 매서드
	static Cheomseongdae getIntance() {
		return cheomseongdae;
	}
	
	void history() {
		System.out.println("동양에서 가장 오래된 관측대");
	}

}
