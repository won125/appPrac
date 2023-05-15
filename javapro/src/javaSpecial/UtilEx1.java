package javaSpecial;

public class UtilEx1 {

	public static void main(String[] args) {
		Box<Integer> box1 = Util.boxing(50);
		int value = box1.getT();
		
		Box<String> box2 = Util.boxing("±èÃ¶¼ö");
		String name = box2.getT();
		
		

	}

}
