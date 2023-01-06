package com.iu.api1.Strings.ex3;

import java.util.Scanner;
//2. DTO 하나의 정보를 출력하는 메서드
//2개 메서드 생성
// //1.모든 날씨 정보를 출력하는 메서드

public class WetherView {
	WetherData wetherData = new WetherData();
	WetherDTO []  datas = wetherData.init();
	
	public void WetherOne(WetherDTO datas) {
	
			System.out.println(datas.getCity());
			System.out.println(datas.getGion());
			System.out.println(datas.getStatus());
			System.out.println(datas.getMise());
		
	
		
	}
	public void WetherAll(WetherDTO [] datas) {
		for(int i = 0; i<datas.length;i++) {
			
			WetherOne(datas[i]);
			System.out.println("");
		}
	}
}

//선생님의 오버로딩
//package com.iu.api1.strings.ex3;
//
//public class WeatherView {
//	
//	//2개의 메서드 생성
//	
//	//1.모든 날씨 정보를 출력
//	public void view(WeatherDTO [] datas) {
//		for(int i=0;i<datas.length;i++) {
//			this.view(datas[i]);
//		}
//	}
//	
//	//2. DTO하나의 정보를 출력
//	public void view(WeatherDTO weatherDTO) {
//		System.out.println("---------------");
//		System.out.println("City   : "+weatherDTO.getCity());
//		System.out.println("Gion   : "+weatherDTO.getGion());
//		System.out.println("Status : "+weatherDTO.getStatus());
//		System.out.println("Mise   : "+weatherDTO.getMise());
//	}
//
//}
