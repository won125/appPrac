package javaAPI;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 (hh시 mm분 ss초)");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 (E)");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 D일");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy년 MM월 dd일 (HH시 mm분 ss초)");
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일-w주차 (a hh시 mm분 ss초)");
		System.out.println(sdf5.format(date));

	}

}
