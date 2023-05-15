package javaSpecial;

public class Person2Ex1 {

	public static void main(String[] args) {
		Person2 chanho;
		/*chanho=(age) -> {
			int myage = age+1;
			System.out.println("내 나이는" + myage + "입니다.");
		};
		chanho.info(27);*/
		chanho = age -> System.out.println("내 나이는" + age + "입니다.");
		chanho.info(30);

	}

}
