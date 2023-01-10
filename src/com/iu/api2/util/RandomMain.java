package com.iu.api2.util;

import java.util.ArrayList;
import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {

		Random random = new Random();

		//1000원 로또 구매 1-45
		//로또 뽑는데 번호 총 6개 중복제거

		//		int num = random.nextInt(9)+1;
		ArrayList<Integer> rotto = new ArrayList<>();



		for(int i =0; i<6; i++) {
			rotto.add(random.nextInt(10)+1);
			for(int j =0; j<rotto.size()-1;j++) {
				
				if(rotto.get(j)==rotto.get(j+1)) {
					rotto.remove(j);
					rotto.add(j,random.nextInt(10)+1);
				}
			
			}
		
		}
		rotto.remove(5);



		System.out.println(rotto);


		//		System.out.println(num);
	}

}
