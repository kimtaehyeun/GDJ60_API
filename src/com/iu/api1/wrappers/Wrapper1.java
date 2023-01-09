package com.iu.api1.wrappers;

public class Wrapper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.BYTES);
		//4바이트
		System.out.println(Long.BYTES);
		//8바이트
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		String n1 = "1";
		Integer int1 = new Integer(n1);//Deprecated사용하지 말것을 권장한다.
		
		int num1 = Integer.parseInt(n1);//가장 중요
		System.out.println(num1*2);
		n1 = "12.323";
		double d1 = Double.parseDouble(n1);
		System.out.println(d1*2);
		
		
	}

}
