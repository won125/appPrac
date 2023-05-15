package anotation;

public class Service {
	//매서드
	@PrintAnnotation
	public void method1(){
		System.out.println("매서드1 실행");
		
	}
	@PrintAnnotation("*")
	public void method2(){
		System.out.println("매서드2 실행");
	}
	@PrintAnnotation(value="#",number=20)
	public void method3(){
		System.out.println("매서드3 실행");
	}

}
