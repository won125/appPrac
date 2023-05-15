package javaClass;

public class PhysicalInfoEx1 {

	public static void main(String[] args) {
		PhysicalInfo younghee = new PhysicalInfo("이영희",10,132.5f,35.5f);
		printPhysicalInfo(younghee);
		younghee.update(11, 145.5f, 40.0f);
		printPhysicalInfo(younghee);
		younghee.update(12, 150.5f, 41.0f);
		printPhysicalInfo(younghee);

	}
	
	static void printPhysicalInfo(PhysicalInfo obj) {
		System.out.println("이 름 : " + obj.name);
		System.out.println("나 이 : " + obj.age);
		System.out.println(" 키  : " + obj.height);
		System.out.println("몸무게 : " + obj.weight);
		System.out.println("===============================");
	}

}
