package com.iu.api2.date;

import java.util.Calendar;

public class CalenderMain2 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		Calendar sample = Calendar.getInstance();
		birth.set(1999, 9, 22);
		sample.set(Calendar.MINUTE,sample.get(Calendar.MINUTE));
		long n = now.getTimeInMillis();
		long s = sample.getTimeInMillis();
		long b = birth.getTimeInMillis();
		n = n-b;
//		n = s -n;
		n = n/(1000*60*60*24);
		n=n/365;
		System.out.println("n : "+n);
		System.out.println("s : "+s);
		System.out.println(now.getTime());
		System.out.println(sample.getTime());
		System.out.println("birth : "+birth.getTime());
	
	}
}
