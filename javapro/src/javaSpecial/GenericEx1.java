package javaSpecial;

import java.util.ArrayList;
import java.util.List;

public class GenericEx1 {

	public static void main(String[] args) {
		/*
		 int[] nums = new int[5];
		 for(int i=0;i<nums.length;i++) {
			nums[i]=(i+1)*10;
			System.out.println(nums[i]);
		 */
		List nums = new ArrayList();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(60);
		nums.remove(2);
		nums.add(90);
		for(int i=0;i<nums.size();i++) {
			System.out.println(nums.get(i));
		}
		

	}

}
