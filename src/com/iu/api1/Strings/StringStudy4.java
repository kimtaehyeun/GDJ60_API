package com.iu.api1.Strings;

public class StringStudy4 {

	public static void main(String[] args) {
		
		String str= "StarWars";
		String result = str.substring(4);
		System.out.println(result);
		result = str.substring(4,5);
		System.out.println(result);
//		System.out.println(result.substring(0,1));
		
		str = "test@naver.com";
		int a = str.lastIndexOf("@");
		result = str.substring(str.indexOf("@")+1);
		//result = str.substring(a+1);
		System.out.println(result);
		////
		
		
	}

}
