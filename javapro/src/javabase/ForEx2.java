package javabase;

public class ForEx2 {

	public static void main(String[] args) {
		
		boolean dice = true;
		while(dice) {
			int num=(int)(Math.random()*6+1);
			System.out.println(num);
			if(num==4) {
				
				dice=false;
			}
		}

	}

}
