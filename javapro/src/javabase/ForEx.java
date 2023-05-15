package javabase;

public class ForEx {

	public static void main(String[] args) {
		for(int i=1;i<=11;i++) {
			for(int j=0;j<11-i;j++) {
				System.out.print(" ");
			}
			for(int s=0;s<2*i-1;s++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
