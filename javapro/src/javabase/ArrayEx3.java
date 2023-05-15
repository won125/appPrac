package javabase;

public class ArrayEx3 {

	public static void main(String[] args) {
		int[] scores= {86,70,96,60,78,85,88,92,72,83,56};
		int count=0;
		for(int i:scores) {
			if(i>=80) {
				count++;
			}
		}
		System.out.println("합격자 수 = "+count);

	}

}
