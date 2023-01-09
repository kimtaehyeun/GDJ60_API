package com.iu.api1.wrappers.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMain2 {

	public static void main(String[] args) {
		int []arr = new int [3];
		ArrayList ar = new ArrayList();
		//다형성	- 상속관계에서만 가능
		//모든애들은 object 타입이기때문에 가능하다.
		
		ar.add(1);		//Auto-Boxing
		//바뀌는 순서 : int -> Integer -> object
		ar.add(1.2);
		ar.add('a');
		ar.add(false);
		ar.add("hello");
		ar.add(new Scanner(System.in));

		for(int i =0; i<ar.size();i++)
			System.out.println(ar.get(i));
	}

}
