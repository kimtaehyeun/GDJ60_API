package com.iu.api2.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar ca = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 E");
		String p=sd.format(ca.getTime());
		System.out.println(p);
	}

}
