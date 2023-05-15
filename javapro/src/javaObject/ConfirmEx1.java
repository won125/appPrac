package javaObject;

public class ConfirmEx1 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,5,3,8,2};
		for(int i:array) {
			if(i>max) {
				max = i;
			}
		}
		System.out.println("ÃÖ´ñ°ªÀº = "+max);
		
		
		int[][] arr = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum=0;
		double avg=0.0;
		for(int[] i:arr) {
			for(int j:i) {
				sum+=j;
			}
		}
		avg=(double)sum/(arr[0].length+arr[1].length+arr[2].length);
		System.out.println("ÃÑ ÇÕ = "+sum);
		System.out.println("Æò ±Õ = "+avg);
	}
}