package javaAPI;

public class StringBufferEx1 {

	public static void main(String[] args) {
		/*
		String str = "korea";
		str += "fighting";
		str += "corona";
		System.out.println(str);
		*/
		
		StringBuilder sb = new StringBuilder();
		sb.append("korea");
		sb.append("fighting");
		sb.append("corona");
		System.out.println(sb.toString());
		sb.insert(5, "-");
		System.out.println(sb.toString());
		sb.insert(14, "==>");
		System.out.println(sb.toString());
		sb.setCharAt(5, ':');
		System.out.println(sb.toString());
		sb.replace(6, 14, "remember");
		System.out.println(sb.toString());

	}

}
