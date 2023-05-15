package javaAPI;

public class MemberEx1 {

	public static void main(String[] args) {
		Member original = new Member("hong", "Honggildong", "12345", 28, true);
		Member cloned = original.getMember();
		cloned.password = "77777";
		System.out.println("¿øº» °´Ã¼ : "+original.id);
		System.out.println(original.name);
		System.out.println(original.password);
		System.out.println(original.age);
		System.out.println(original.adult);
		System.out.println("------------------");
		System.out.println("º¹Á¦ °´Ã¼ : "+cloned.id);
		System.out.println(cloned.name);
		System.out.println(cloned.password);
		System.out.println(cloned.age);
		System.out.println(cloned.adult);

	}

}
