package com.iu.api1.Strings;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		
		sb.append("World");
		
		System.out.println(sb);
				
		
		//참조 변수를 출력 하면 toString() : 클래스명@객체주소
		//		toString를 오버라이딩했다.
		//String str = sb;//안들어감 = 변수에는 같은 데이터 타입만 대입 가능.
		String str = sb.substring(0);
		System.out.println(str);
		sb.reverse();
		System.out.println(sb);
		str = str.valueOf(false);
		//static이 붙은 애들은 클래스.~~~라고쓴다.
		
		System.out.println(str);
		
	}	

}
