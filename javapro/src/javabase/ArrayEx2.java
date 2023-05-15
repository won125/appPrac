package javabase;

public class ArrayEx2 {

	public static void main(String[] args) {
		int[] scores= {87,69,54,95,35,64,-1,78,95};
		int sum=0;
		for(int i=0;i<scores.length;i++) {
			if(scores[i]==-1) {
				break;
			}else {
				sum+=scores[i];
			}
		}
		System.out.println("-1이 나오기 전까지의 점수의 합 = "+sum);
		sum=0;
		for(int i : scores) {
				if(i==-1) {
					break;
				}else {
					sum+=i;
				}
		}
		System.out.println("-1이 나오기 전까지의 점수의 합 = "+sum);

	}

}
