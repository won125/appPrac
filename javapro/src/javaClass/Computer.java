package javaClass;

public class Computer {
	//¸Å¼­µå
	int sum1(int[] values) {
		int value=0;
		for(int i=0;i<values.length;i++) {
			value+=values[i];
		}
		return value;
	}
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}

}
