package javaSpecial;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class StudentEx1 {

	public static void main(String[] args) {
		System.out.println("     [학생 이름]");
		printName(t -> t.getName());
		System.out.println("     [국어 점수]");
		printScore(t -> t.getKorScore());
		System.out.println("     [영어 점수]");
		printScore(t -> t.getEngScore());
		System.out.println("     [수학 점수]");
		printScore(t -> t.getMatScore());

	}//main
	
	//성적 자료 생성 메서드
	private static List<Student> list = Arrays.asList(
			new Student("김철수", 80, 90, 69),
			new Student("홍길동", 80, 87, 74),
			new Student("짱구", 80, 67, 87)
			);
	
	//성적 자료 출력 메서드(이름)
	public static void printName(Function<Student, String> function) {
		for(Student stu:list) {
			System.out.print(function.apply(stu) + "	");
		}
		System.out.println();
	}
	//성적 자료 출력 메서드(점수)
	public static void printScore(ToIntFunction<Student> function) {
		for(Student stu:list) {
			System.out.print(function.applyAsInt(stu) + "	");
		}
		System.out.println();
	}

}
