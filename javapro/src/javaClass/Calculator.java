package javaClass;

public class Calculator {
	
	int total(int ... values) {
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
	double average(int ... values) {
		int sum=0;
		double avg=0.0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}
		avg = (double)sum/values.length;
		return avg;
	}
}
