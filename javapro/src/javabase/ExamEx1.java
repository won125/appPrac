package javabase;

import java.util.Scanner;

public class ExamEx1 {

	public static void main(String[] args) {
		int num;
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오>>");
		size=sc.nextInt();
		while(size%2==0||size<2||size>=100) {
			System.out.println("입력한 값이 2와 100사이의 홀수가 아닙니다. 다시입력해주십시오.");
			System.out.print("숫자를 입력하시오>>");
			size=sc.nextInt();
		}

		int col=(size/2);
		int row=0;
		int[][] magic_square = new int[size][size];
		for(num=1;num<=size*size;num++) {
			magic_square[row][col]=num;
			if(num%size==0) {
				row++;
			}else {
				row--;
				col--;
				if(row<0) {
					row=size-1;
				}
				if(col<0) {
					col=size-1;
				}
			}
		}
		for(int[] i:magic_square) {
			for(int j:i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}

	}

}
