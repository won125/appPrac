package javabase;

public class WhileEx {

	public static void main(String[] args) {
		/*
		 int i=1;
		 
		int sum=0;
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println("1부터 100까지의 합은 "+sum+" 입니다.");
		*/
		int num = 1;
		int sum = 0;
		System.out.println("1부터 100까지 합을 구하는 중 3500이 넘으려면 숫자 몇까지 더하면 될까요?");
		while(sum<3500) {
			sum+=num;
			num++;
		}
		System.out.println("정답은 "+(num-1)+" 입니다.");
		sum=0;
		int i;
		for(i=1;i<=100;i++) {
			if(sum<3500) {
				sum+=i;
				System.out.println(i+" "+sum);
			}else {
				i-=i;
				break;
			}
		}
		System.out.println("정답은 "+i+" 입니다.");

	}

}
