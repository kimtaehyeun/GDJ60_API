package com.iu.api1.wrappers;

public class Wrapper2 {

	public static void main(String[] args) {
		int num =10;
		
		
//		Integer num2 = new Integer(num);
		//Auto-Boxing
		//primitive -> reference
		Integer num2 = num;
		num = num2.intValue();
		
		//Atuo-unBoxing
		//Reference -> Primitive;
//		num = num2.intValue();
		num = num2;
	
	}

}
