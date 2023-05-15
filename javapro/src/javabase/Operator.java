package javabase;

public class Operator {

	public static void main(String[] args) {
		int kor=61;
		int eng=76;
		int mat=74;
		
		int sum=0;
		double avg;
		sum=kor+eng+mat;
		avg=(int)(sum/3.0*100)/100.0;
		System.out.println("점수의 촐 합은 = "+sum);
		System.out.println("점수의 평균은 = "+avg);

	}

}
