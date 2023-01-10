package com.iu.api2.collections.sample;

import java.util.ArrayList;

public class CollectionMain {

	public static void main(String[] args) {
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();
		//c1 c2 모으는 어레이 리스트.
		ArrayList<Parent> ar = new ArrayList<>();
		
		ar.add(child1);
		ar.add(child2);
		System.out.println(ar.get(0) instanceof Child1);
		
		
		
		ArrayList<? extends Parent> ar2 = new ArrayList<>();
		
	}

}
