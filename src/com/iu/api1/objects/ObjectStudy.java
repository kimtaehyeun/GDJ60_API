package com.iu.api1.objects;

public class ObjectStudy {
	public static void main(String[] args) {
		//객체 생성 공식
		Object object = new Object();
	//object  = 모든클래스의 조상이다.
		int x = object.hashCode();
		//멤버 사용(접근)
		//참조변수명.변수명, 참조변수명.메소드()
		System.out.println(x);
		
		String a= object.toString();
		System.out.println(a);
		System.out.println(object);
		
		Child child = new Child();
		Object ob = new Object();
		System.out.println(object == ob);
		boolean check = object.equals(ob);
		System.out.println(check);
		
		System.out.println(child.toString());
		System.out.println(child);
		System.out.println(child.hashCode());//메모리의 주소를 알고싶을때
		
		Object o = child;//다형성
		
		
	}
}
