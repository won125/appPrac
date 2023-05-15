package javaAPI;

public class StringEx5 {

	public static void main(String[] args) {
		String ssn = "950410-1025114";
		String ssn2 = ssn.replace(ssn.substring(7), "*******");
		System.out.println(ssn2);
		String original = "Java programing";
		String lower = original.toLowerCase();
		String upper = original.toUpperCase();
		System.out.println(lower);
		System.out.println(upper);

	}

}
