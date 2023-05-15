package javabase;

import java.util.Scanner;

public class ForEx5 {

	public static void main(String[] args) {
		int n=0,m=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("크기(n)>>");
		n=sc.nextInt();
		if(n%2==0 || n>100) {
			System.out.println("Input Error!!");
		}
		else {
			int max = n/2+1;
			System.out.print("종류(m)>>");
			m=sc.nextInt();
			switch(m) {
			case 1:
				for(int i=1;i<=max;i++) {
					for(int j=0;j<i;j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				for(int i=1;i<=max;i++) {
					for(int j=0;j<max-i;j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;
				
			case 2:
				for(int i=max;i>0;i--) {
					for(int j=0;j<i-1;j++) {
						System.out.print(" ");
					}
					for(int j=i;j<=max;j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				for(int i=1;i<=max;i++) {
					for(int j=0;j<i;j++) {
						System.out.print(" ");
					}
					for(int j=0;j<max-i;j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			case 3:
				for(int i=0;i<max;i++) {
					for(int j=0;j<i;j++) {
						System.out.print(" ");
					}
					for(int j=0;j<n-(2*i);j++) {
						System.out.print("*");
					}
					
					System.out.println();
				}
				for(int i=1;i<max;i++) {
					for(int j=max-i-1;j>0;j--) {
						System.out.print(" ");
					}
					for(int j=0;j<(2*i)+1;j++) {
						System.out.print("*");
					}
					
					System.out.println();
				}
				break;
			case 4:
				for(int i=0;i<max;i++) {
					for(int j=0;j<i;j++) {
						System.out.print(" ");
					}
					for(int j=0;j<max-i;j++) {
						System.out.print("*");
					}					
					System.out.println();
				}
				for(int i=1;i<=max-1;i++) {
					for(int j=0;j<max-1;j++) {
						System.out.print(" ");
					}
					for(int j=0;j<i+1;j++) {
						System.out.print("*");
					}
					
					System.out.println();
				}
				break;
			default:
				System.out.println("Input Error!!");
			}
			
		}
	}

}
