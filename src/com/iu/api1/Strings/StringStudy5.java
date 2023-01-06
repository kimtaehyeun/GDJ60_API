package com.iu.api1.Strings;

public class StringStudy5 {

	public static void main(String[] args) {

		String str = "apple#Apple, aPPle# appLe";
		str = str.replace(",", "#");
//		str = str.replaceAll(" ", "");
//		str = str.trim();
		String [] result = str.split("#");//파싱(parsing)
		
		for(int i= 0; i<result.length;i++) {
			System.out.println(result[i].trim().toUpperCase());
			
		}
		for(int i= 0; i<result.length;i++) {
			System.out.println(result[i].trim().toLowerCase());
			
		}
	}
}
