package javaAPI;

public class StringEx2 {

	public static void main(String[] args) {
		String str = "우리나라만세";
		byte[] blen = str.getBytes();
		System.out.println(blen.length);
		String str2 = "korea";
		byte[] blen2 = str2.getBytes();
		System.out.println(blen2.length);

	}

}
