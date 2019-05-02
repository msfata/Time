package com.timer;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * @autor MSFATA
 * */
public class Timer {
	public static String time;
	public static String amPm;

	// returns only time
	public static String getTime() {
		new Thread() {
			public void run() {
				for (;;) {
					Calendar cal = new GregorianCalendar();
					int hour = cal.get(Calendar.HOUR);
					int min = cal.get(Calendar.MINUTE);
					int sec = cal.get(Calendar.SECOND);
					int am_pm = cal.get(Calendar.AM_PM);
					switch (am_pm) {
					case 1:
						amPm = "PM";
						break;
					case 0:
						amPm = "AM";
						break;

					case 2:
						amPm = "AM";
						break;

					}
					time = hour + ":" + min + ":" + sec + " " + amPm;
					System.out.println(time);
				}
			}
		}.start();
		return time;
	}

	// returns only date
	public static String getDate() {
		Calendar cal = new GregorianCalendar();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		time = "" + day + "/" + (month + 1) + "/" + year;
		return time;
	}
}