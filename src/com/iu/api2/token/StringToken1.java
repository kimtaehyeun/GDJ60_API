package com.iu.api2.token;

import java.util.StringTokenizer;

public class StringToken1 {

	public static void main(String[] args) {

		String nations = "Korea,서울,USA,워싱턴,UK,런던,Japan,도쿄";
		StringTokenizer st = new StringTokenizer(nations,",");
		String [] n = nations.split(",");
		//스플릿 대신 토큰을 쓰는 이유 = 여러개가 하나의 데이터 형식인 경우
		//토큰이 훨씬 편하다.
		
//		for(int i = 0; i<n.length; i++) {
//			NationDTO nationDTO = new NationDTO();
//			nationDTO.setName(n[i]);
//			nationDTO.setCity(n[++i]);
//		}//스플릿을 쓰는경우 배열을 계산하여야 해서 부담스러움
//		스플릿은 독립적으로 하나의 데이터당 하나씩 독립적으로 작용할때
//		hasmoretokens는 여러개의 데이터가 한개로 묶일때
		while(st.hasMoreTokens()) {
			NationDTO nationDTO = new NationDTO();
			
			String t1 = st.nextToken();
			nationDTO.setName(t1);
			System.out.println(t1);
			
			String t2 = st.nextToken();
			nationDTO.setCity(t2);
			System.out.println(t2);
			//인덱스 번호를 생각할 필요가 없다.
		}
		
	}
}
