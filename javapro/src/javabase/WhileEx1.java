package javabase;

import java.util.Scanner;

public class WhileEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random_num = (int)(Math.random()*100)+1;
		int select_num=0;
		int chance=1;
		boolean play=true;
		
		while(play) {
			System.out.print("숫자 입력>>");
			select_num=sc.nextInt();
			if(select_num==random_num) {
				System.out.println(chance+"번 만에 정답을 맞히셨습니다.");
				play=false;
			}
			else {
				if(select_num>random_num) {
					System.out.println("입력한 수가 너무 급니다. 다시 입력해주십시오.");
					chance++;
				}
				else {
					System.out.println("입력한 수가 너무 작습니다. 다시 입력해주십시오.");
					chance++;
				}
			}
			
		}
		System.out.println("게임이 종료되었습니다.");

	}

}
