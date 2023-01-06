package com.iu.api1.Strings.ex3;

import java.util.Scanner;

public class WetherController {

	public void start() {
		boolean sw = true;
		Scanner sc = new Scanner(System.in);
		WetherData wetherData = new WetherData();
		WetherView wetherview = new WetherView();
		WetherInput wetherInput = new WetherInput();
		WetherDTO []  datas = wetherData.init();
		
		while(sw) {
			System.out.print("번호 입력 : ");
			int a = sc.nextInt();
			switch(a) {
			
			case 1 : 
				System.out.println("초기화");
				break;
			case 2 : 
				System.out.println("전국 날씨 정보");
				wetherview.WetherAll();
				break;
			case 3 : 
				System.out.println("지역 날씨 검색");
				wetherInput.Wethersearch();
				break;
			case 4 : 
				System.out.println("지역날씨 추가");
				wetherInput.Wetheradd(datas);
				break;
			case 5 : 
				System.out.println("지역날씨 삭제");
				wetherInput.Wetherremove(datas);
				break;
				
			
			}
		}
	}
}
