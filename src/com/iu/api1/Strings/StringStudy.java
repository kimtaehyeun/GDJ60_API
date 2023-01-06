package com.iu.api1.Strings;

import java.util.Comparator;

public class StringStudy {

	public static void main(String[] args) {
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		String str = new String("abcde");
		
		String str2 = "abcde";
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str == str2);
		
		
		boolean check = str.equals(str2);//equals메소드를 쓰면 ㅇ주소값이 아닌 내용값을 비교하는것.
		
		System.out.println(check);
		
		char i = str.charAt(2);//string 클래스 안에 있는 charAT메소드
		
		int b = str.indexOf(i);
		
		System.out.println(i);
		
		System.out.println("index of : "+b);
		String x = str.intern();
		System.out.println(x);
	}

}
