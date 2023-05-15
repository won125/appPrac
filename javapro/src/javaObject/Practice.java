package javaObject;

import java.util.Calendar;

public class Practice {

	public static void main(String[] args) {
		Week today=Week.SUNDAY;
		String name = today.name(); // 열거 객체를 문자로 리턴
		Calendar cal = Calendar.getInstance();
		// int week = cal.get(Calendar.DAY_OF_WEEK);
		int ordinal = today.ordinal(); // 열거 객체의 위치를 숫자로 리턴
		//System.out.println("올해는 = "+week);
		System.out.println(ordinal);
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.THURSDAY;
		int resualt1 = day1.compareTo(day2);
		int resualt2 = day2.compareTo(day1);
		System.out.println(resualt1);
		System.out.println(resualt2);
		Week week = Week.valueOf("SUNDAY"); //문자열을 열거형 객체로 변환
		if(week == Week.SUNDAY || week == Week.SATURDAY) {
			System.out.println("즐거운 주말 보내세요.");
		}else {
			System.out.println("평일이니 열심히 공부하세요.");
		}
		
		Week[] days = Week.values(); // 모든 열거형 객체들을 배율로 변환하여 출력
		for(Week day : days) {
			System.out.println(day);
		}

	}

}
