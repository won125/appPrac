package javaAPI;

import java.util.Arrays;

public class ArraysEx2 {

	public static void main(String[] args) {
		int[] scores = {75,69,80,90,95};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 90);
		System.out.println("찾은 위치 = " + index);
		
		String[] names = {"홍길동", "박철순", "이영희"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "홍길동");
		System.out.println("찾은 위치 = " + index);

	}

}
