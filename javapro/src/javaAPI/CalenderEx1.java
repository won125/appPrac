package javaAPI;

import java.util.Calendar;
import java.util.TimeZone;

public class CalenderEx1 {

	public static void main(String[] args) {
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar date = Calendar.getInstance(tz);
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH)+1;
		int day = date.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"년 "+month+"월 "+day+"일");
		int week = date.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		String[] weeks = {"요일", "일", "월","화","수","목","금","토"};
		/*
		String strWeek = null;
		switch(week) {
			case Calendar.MONDAY:
				strWeek="월요일";
				break;
			case Calendar.TUESDAY:
				strWeek="화요일";
				break;
			case Calendar.WEDNESDAY:
				strWeek="수요일";
				break;
			case Calendar.THURSDAY:
				strWeek="목요일";
				break;
			case Calendar.FRIDAY:
				strWeek="금요일";
				break;
			case Calendar.SATURDAY:
				strWeek="토요일";
				break;
			case Calendar.SUNDAY:
				strWeek="일요일";
				break;
		}
		System.out.println("오늘은 "+strWeek+" 입니다.");
		*/
		System.out.println("오늘은 "+weeks[week]+weeks[0]+" 입니다.");
		int hour=date.get(Calendar.HOUR);
		int minute=date.get(Calendar.MINUTE);
		int second=date.get(Calendar.SECOND);
		int amPm=date.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm==Calendar.AM) {
			strAmPm="오전 ";
		}else {
			strAmPm="오후 ";
		}
		System.out.println("현재 시간은 "+strAmPm+hour+"시 "+minute+"분 "+second+"초 입니다.");
		

	}

}
