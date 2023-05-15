package javaClass;

public class AnimalEx {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		tiger.name = "호돌이";
		tiger.age = 2;
		eagle.name = "위니";
		eagle.home = "소나무둥지";
		System.out.println(tiger.name+"는 "+tiger.age+"살 입니다.");
		tiger.move();
		System.out.println(eagle.name+"의 집은 "+eagle.home+"입니다.");
		eagle.move();

	}

}
