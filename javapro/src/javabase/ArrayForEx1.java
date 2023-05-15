package javabase;

import java.util.Scanner;

public class ArrayForEx1 {

	public static void main(String[] args) {
		
		
		int[] scores= {95,80,76,88};
		int sum=0;
		double avg;
		for(int i:scores) {
			sum+=i;
		}
		avg=(double)sum/scores.length;
		System.out.println("ÃÑ Á¡ = "+sum);
		System.out.println("Æò ±Õ = "+avg);
	}

}
