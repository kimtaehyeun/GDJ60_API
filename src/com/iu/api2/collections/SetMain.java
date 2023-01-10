package com.iu.api2.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		
		
		hs.add(1);
		hs.add(11);
		hs.add(11);
		hs.add(2);
		hs.remove(1);
//		System.out.println(hs.toString());
//		System.out.println(hs.size());
		
		//Iterator
		//반복형
		//list나 set처럼 배열처럼 모으는 것 중 하나.
		//존재 이유는 set때문에 존재
		//set에 있는 데이터data를 하나씩 꺼내기 위해 set->Iterator형식으로 바꿔줌
		//변수 선언
		Iterator<Integer> is = hs.iterator();
		
		while(is.hasNext()) {
			Integer num =is.next();
			System.out.println(num);
		}
		
	}

}
