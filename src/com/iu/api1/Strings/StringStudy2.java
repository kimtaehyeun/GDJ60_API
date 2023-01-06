package com.iu.api1.Strings;

public class StringStudy2 {

	public static void main(String[] args) {
		String email = "a@bc@123@gmail.com";
		int idx = email.lastIndexOf("@", email.length());//없으면 -1
		
		System.out.println(idx);
		for(int i= 0; i <email.length();i++) {
			System.out.println(email.charAt(i));
		}
		String str = "";
	//	String str2  = null;//error
		System.out.println("Str : "+str.length());
	
		System.out.println("Before Email : "+email);
		email = email.replace("@","_");

		System.out.println("After Email : "+email);
	}

}
