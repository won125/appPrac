package javabase;

public class SortEx1 {

	public static void main(String[] args) {
		int[] nums= {53,78,7,23,62};
		int temp;
		//소트 전 자료 출력
		System.out.println("소트 전 자료 ");
		for(int i:nums) {
			System.out.print(i+" ");
		}
		System.out.println();
		//소트 알고리즘 구현
		for(int i=0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]<nums[j]) {
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		//소트 후 자료 출력
		System.out.println("소트 후 자료(내림 차순)");
		for(int i:nums) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		//소트 전 자료 출력
		System.out.println("소트 전 자료 ");
		for(int i:nums) {
			System.out.print(i+" ");
		}
		System.out.println();
				//소트 알고리즘 구현
		for(int i=0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]>nums[j]) {
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		//소트 후 자료 출력
		System.out.println("소트 후 자료(오름 차순) ");
		for(int i:nums) {
			System.out.print(i+" ");
		}
		System.out.println();

	}

}
