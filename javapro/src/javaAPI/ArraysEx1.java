package javaAPI;

import java.util.Arrays;

public class ArraysEx1 {

	public static void main(String[] args) {
		int[] scores = {75,69,80,90,95};
		Arrays.sort(scores);
		for(int i=scores.length-1; i>=0;i--) {
			System.out.println(scores[i]);
		}
		
		String[] names = {"È«±æµ¿", "¹ÚÃ¶¼ø", "ÀÌ¿µÈñ"};
		Arrays.sort(names);
		for(int i=names.length-1; i>=0;i--) {
			System.out.println(names[i]);
		}

	}

}
