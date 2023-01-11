package com.iu.api2.util;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {

		Random random = new Random();

		//1000원 로또 구매 1-45
		//로또 뽑는데 번호 총 6개 중복제거
		
		
		
		
		
		
		HashSet<Integer>lotto= new HashSet<>();
		while(lotto.size()<5) {
			lotto.add(random.nextInt(10)+1);
		}
		System.out.println("set : "+lotto);

		ArrayList<Integer> rotto = new ArrayList<>();
//		ArrayList<Integer> ar = new ArrayList<>();
		ArrayList<Integer> teacher = new ArrayList<>();
		
		while(teacher.size()<6) {
			int n = random.nextInt(10);
			boolean check = true;
			for(int i = 0; i<teacher.size(); i++) {
				if(n==teacher.get(i)) {
					check =false;
					break;
				}
			}
			if(check) {
				teacher.add(n);
			}
			
		}
		System.out.println(teacher);
		
		
		
		
		for(int i =0; i<5; i++) {
			rotto.add(random.nextInt(10)+1);
		}
		boolean sw = true;
		int x = 0;
//		while(sw) {
//			
//			for(int i=1; i<rotto.size(); i++) {
//				if(rotto.get(0)==rotto.get(i)) {
//					rotto.set(i,random.nextInt(10)+1);
//				}
//				else {
//					for(int j=2;j<rotto.size();j++) {
//						if(rotto.get(1)==rotto.get(j)) {
//							rotto.set(j,random.nextInt(10)+1);
//						}
//						else{
//							for(int a=3;a<rotto.size();a++) {
//								if(rotto.get(1)==rotto.get(a)) {
//									rotto.set(a,random.nextInt(10)+1);
//								}
//								else {
//									for(int b=4;b<rotto.size();b++) {
//										if(rotto.get(1)==rotto.get(b)) {
//											rotto.set(b,random.nextInt(10)+1);
//										}
//										else
//											sw=false;
//									}
//								}
//							}
//						}
//					}
//
//				}
//			}
//
//
//			System.out.println("array : "+rotto);
//			//		System.out.println(num);
//		}
//		for(int i=1; i<7; i++) {
//			int num1 = random.nextInt(6)+1;
//			ar.add(num1);
//			for(int k=0; k<i-1;k++) {
//				
//				if(num1 == ar.get(k)) {
//					ar.remove(k);
//					i--;
//					break;
//				}
//			}
//		}
		
//		System.out.println(ar);
	}
}
