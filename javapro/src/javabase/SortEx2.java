package javabase;

public class SortEx2 {

	public static void main(String[] args) {
		int[] lotto_num = new int[6];
		boolean game = true;
		
		while(game) {
			for(int i=0; i<6;i++) {
				lotto_num[i]=(int)(Math.random()*45)+1;
			}
			for(int i=0; i<6;i++) {
				for(int j=0; j<6;j++) {
					if(lotto_num[i]==lotto_num[j]){
					lotto_num[j]=(int)(Math.random()*45)+1;
					}
				}
			}
			for(int i=0; i<6;i++) {
				for(int j=0; j<6;j++) {
					if(lotto_num[i]!=lotto_num[j]){
					game=false;
					}
				}
			}
		}
		
		System.out.println("이번 회차 로또 번호");
		for(int i:lotto_num) {
			System.out.print(i+" ");
		}
		System.out.println();

	}

}
