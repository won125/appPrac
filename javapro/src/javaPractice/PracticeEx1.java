package javaPractice;

import java.util.ArrayList;
import java.util.List;

public class PracticeEx1 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		int sum=0;
		for(int i=0;i<1000;i++) {
			if(i%3==0 || i%5==0) {
				nums.add(i);
			}
		}
		for(int i=0;i<nums.size();i++) {
			System.out.print(nums.get(i)+"\t");
			sum+=nums.get(i);
		}
		System.out.println();
		System.out.println(sum);
		

	}

}
