package javaSpecial;

public class PersonEx1 {

	public static void main(String[] args) {
		//일반적인 익명 객체 구현
		/*Person gildong = new Person() {
			
			@Override
			public void info() {
				System.out.println("나는 종로에 사는 길동입니다.");
				
			}
		};
		gildong.info();*/
		
		//람다식 익명 객체 구현
		/*Person gildong;		//객체 필드 선언
		gildong = () -> {
			System.out.println("나는 종로에 사는 길동입니다.");
			System.out.println("자바 웹 개발을 배우고 있습니다.");
		};
		gildong.info();*/
		
		Person gildong;
		gildong = () -> System.out.println("나는 종로에 사는 길동입니다.");
		gildong.info();

	}

}
