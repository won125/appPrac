package javabase;

public class SortEx3 {

	public static void main(String[] args) {
		int[] scores= {100,85,97,78,83};
		String[] names= {"홍길동","박찬호","안정환","이영희","박지성"};
		int temp1;
		String temp2;
		
		//기본 데이터 출력
		System.out.println("*****기본 데이터 출력*****");
		for(int i=0;i<scores.length;i++) {
			System.out.println(names[i]+" - "+scores[i]);
		}
		
		//성적순 데이터 출력
		System.out.println("*****성적순 데이터 출력*****");
		for(int i=0;i<scores.length;i++) {
			for(int j=0;j<scores.length;j++) {
				if(scores[i]>scores[j]) {
					temp1=scores[i];
					scores[i]=scores[j];
					scores[j]=temp1;
					
					temp2=names[i];
					names[i]=names[j];
					names[j]=temp2;
				}
			}
		}
		for(int i=0;i<scores.length;i++) {
			System.out.println((i+1)+"등 : "+names[i]+" - "+scores[i]);
		}

	}

}
