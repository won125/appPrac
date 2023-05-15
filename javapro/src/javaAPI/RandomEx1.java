package javaAPI;

import java.util.Arrays;
import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		//Random 클래스
		int mynum[] = new int[6];
		Random rand1 = new Random(5);
		System.out.print("내가 선택한 번호 : ");
		for(int i=0;i<6;i++) {
			mynum[i] = rand1.nextInt(45)+1;
			System.out.print(mynum[i]+" ");
		}
		System.out.println();
		int lottoNum[] = new int[6];
		Random rand2 = new Random(3);
		System.out.print("이번주 당첨 번호 : ");
		for(int i=0;i<6;i++) {
			lottoNum[i] = rand2.nextInt(45)+1;
			System.out.print(lottoNum[i]+" ");
		}
		System.out.println();
		Arrays.sort(lottoNum);
		Arrays.sort(mynum);
		boolean result = Arrays.equals(mynum, lottoNum);
		if(result) {
			System.out.println("1등에 당첨되셨습니다!!!!");
		}else {
			System.out.println("다음 기회에....");
		}

	}

}
