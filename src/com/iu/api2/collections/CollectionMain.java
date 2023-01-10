package com.iu.api2.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionMain {

	public static void main(String[] args) {
		ArrayList<Integer> ar1 = new ArrayList<>();
		ArrayList<Integer> ar2 = new ArrayList<>();
		
		ArrayList<ArrayList<Integer>> arsum = new ArrayList<>();
		ar1.add(1);
		ar2.add(1);
		
		arsum.add(ar1);
		arsum.add(ar2);
		arsum.get(0).get(0);
		System.out.println(arsum);
		
		HashMap<ArrayList<Integer>,ArrayList<Integer>> map = new HashMap<>();;
	
	}

}
