package javabase;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("숫자를 입력해주십시오>>");
		num = sc.nextInt();
		int [][] arr = new int[num][num];
		int max=num;
		int n=1;
		int row = 0;
		int column = -1;
		int delta = 1;
		
		// 배열에 입력받기
		while (max >= 0) {
			
			// 행입력
			for (int i = 0; i < max; i++) {
				column += delta;
				arr[row][column] = n++;
			}
			
			// 반복횟수 감소
			max--;
			
			// 열입력
			for (int i = 0; i < max; i++) {
				row += delta;
				arr[row][column] = n++;
			}
			
			// 방향전환
			delta *= -1;
			
		}
		
		// 배열 출력
		for (int i = 0; i < num; i++) {
			
			for (int j = 0; j < num; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		sc.close();

	}

}
