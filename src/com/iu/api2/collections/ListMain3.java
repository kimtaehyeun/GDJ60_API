package com.iu.api2.collections;

import java.util.ArrayList;

public class ListMain3 {

	public static void main(String[] args) {
		//Collection은 Type에 안전하지 않다.
		//Geneic : Type의 안정성
		//E : 변수명
		//E = Integer
		ArrayList<Integer> ar = new ArrayList<>();//<안에 레퍼런스만나옴>
		ar.add(1);
		//※DTO : Data transfer object - 데이터 교환을 위해 사용하는 객체
		
		int num = ar.get(0);
		
		ArrayList<WetherDTO> ar2 = new ArrayList<>();
		
		WetherDTO wetherDTO = new WetherDTO();
		wetherDTO.setCity("Seoul");
		ar2.add(wetherDTO);
		
		wetherDTO = new WetherDTO();
		wetherDTO.setCity("Jeju");
		ar2.add(wetherDTO);
		
//		wetherDTO = new WetherDTO();
//		wetherDTO.setCity("Jeju");
//		
		ar2.remove(wetherDTO);//주소값이 들어가있음.
		
		for(int i =0; i<ar2.size();i++) {
			System.out.println(ar2.get(i).getCity());
		}
		
	}

}
