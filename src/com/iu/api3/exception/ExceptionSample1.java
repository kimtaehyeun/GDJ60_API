package com.iu.api3.exception;

import java.util.Random;

public class ExceptionSample1 {

	
	public void ex2() throws Exception{
		int num1 = 65;
		int num2 = 48;
		int sum = num2-num1;
		if(sum<0) {
			throw new CustomException("음수");
		}
		if(sum>99) {
			throw new CustomException("몰라");
		}
	}

	public void ex1() throws ArithmeticException,NullPointerException,Exception{
		Random random = new Random();
		int num = random.nextInt(2);
		
		num = 10/num;
		
		System.out.println(num);
		
		
		
	}
}
