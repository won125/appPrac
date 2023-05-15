package javaAPI;

import java.util.TimeZone;

public class PrintTimeZoneEx1 {

	public static void main(String[] args) {
		String[] TimeZoneID=TimeZone.getAvailableIDs();
		for(String tz:TimeZoneID) {
			System.out.println(tz);
		}

	}

}
