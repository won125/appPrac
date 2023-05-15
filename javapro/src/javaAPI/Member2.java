package javaAPI;

import java.util.Arrays;

public class Member2 implements Cloneable{
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member2(String name, int age, int[] scores,Car car) {
		this.age = age;
		this.car = car;
		this.name = name;
		this.scores = scores;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException{
		Member2 cloned =(Member2)super.clone();
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.name);
		return cloned;
	}
	public Member2 getMember() {
		Member2 cloned = null;
		try {
			cloned = (Member2)clone();
		}catch(CloneNotSupportedException e) {
			
		}
		return cloned;
	}

}
