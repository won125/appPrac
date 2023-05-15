package javaSpecial;

public class Student {
	//ÇÊµå
	private String name;
	private int korScore;
	private int engScore;
	private int matScore;
	
	public Student(String name, int korScore, int engScore, int matScore) {
		this.engScore = engScore;
		this.korScore = korScore;
		this.matScore = matScore;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getKorScore() {
		return korScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public int getMatScore() {
		return matScore;
	}

}
