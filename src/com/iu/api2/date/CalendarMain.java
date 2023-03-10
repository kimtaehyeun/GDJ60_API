package com.iu.api2.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain {

	public static void main(String[] args) {
		//GregorianCalendar
		Calendar ca = new GregorianCalendar();
		//현재 날짜와 시간으로 객체가 만들어짐
		ca = Calendar.getInstance();
		ca.set(Calendar.YEAR, 2032);
		//월은 0부터 시작
		ca.set(Calendar.MONTH, 11);
		//year
		int year = ca.get(Calendar.YEAR);
		System.out.println("Year : "+year);
		//월
		int month = ca.get(Calendar.MONTH);
		System.out.println("Month : "+(month+1));
		int date = ca.get(Calendar.DATE);
		System.out.println("Date : "+date);
		int day = ca.get(Calendar.DAY_OF_WEEK);
		System.out.println("Day : " + day);
		int hour = ca.get(Calendar.HOUR);
		System.out.println("hour :"+hour);
		int min = ca.get(Calendar.MINUTE);
		System.out.println("minute : " + min);
		
	}

}
