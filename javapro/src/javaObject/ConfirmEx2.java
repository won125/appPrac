package javaObject;

import java.util.Scanner;

public class ConfirmEx2 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		while(run) {
			int select_num=0;
			int max=0;
			double avg=0.0;
			int sum=0;
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택>>");
			select_num = sc.nextInt();
			
			switch(select_num) {
			case 1:
				System.out.println("----학생 수 입력----");
				System.out.print("학생 수>>");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				if(studentNum!=0) {
					System.out.println("----점수 입력----");
					for(int i=0;i<studentNum;i++) {
						System.out.print("scores["+i+"]: ");
						scores[i]=sc.nextInt();
					}
					break;
				}else {
					System.out.println("학생 수를 설정해 주십시오.");
					break;
				}
				
			case 3:
				System.out.println("----점수 리스트----");
				for(int i=0;i<studentNum;i++) {
					System.out.println("scores["+i+"]: "+ scores[i]);
				}
				break;
			case 4:
				System.out.println("----점수 분석----");
				for(int i:scores) {
					if(i>max) {
						max=i;
					}
					sum+=i;
				}
				avg=(double)sum/scores.length;
				System.out.println("최고 점수 : "+max);
				System.out.println("평균 점수 : "+avg);
				break;
			case 5:
				run=false;
				break;
			default: 
				System.out.println("Input Error!!!!");
				break;
			}
		}
		System.out.println("프로그램 종료!!");

	}

}
