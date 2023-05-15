package javaClass;

public class iTiger extends Animal implements iAnimal{
	
	@Override
	public void eat() {
		System.out.println("멧돼지를 잡아먹습니다.");
		
	}
	
	@Override
	void move() {
		System.out.println("네 발로 이동합니다.");
		
	}

}
