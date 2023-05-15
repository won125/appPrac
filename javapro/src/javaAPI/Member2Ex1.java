package javaAPI;

public class Member2Ex1 {

	public static void main(String[] args) {
		Member2 original = new Member2("홍길동", 30, new int[] {80,90,75}, new Car("소나타"));
		Member2 cloned = original.getMember();
		cloned.scores[1] = 95;
		cloned.car.name = "그랜저";
		System.out.println("원본 객체");
		System.out.println(original.name);
		System.out.println(original.age);
		for(int i : original.scores) {
			int count=1;
			System.out.println(count+"번째 점수 : "+i);
			count++;
		}
		System.out.println(original.car.name);
		System.out.println("------------------");
		System.out.println("복제 객체");
		System.out.println(cloned.name);
		System.out.println(cloned.age);
		for(int i : cloned.scores) {
			int count=1;
			System.out.println(count+"번째 점수 : "+i);
			count++;
		}
		System.out.println(cloned.car.name);

	}

}
