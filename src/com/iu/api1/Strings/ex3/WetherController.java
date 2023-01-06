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
			System.out.println("1. 초기화\t2. 전국날씨정보\t3.지역날씨검색\t4.지역날씨추가\t5.지역날씨삭제\t6.종료");
			int a = sc.nextInt();
			switch(a) {
			
			case 1 : 
				System.out.println("초기화");
				datas = wetherData.init();
				break;
			case 2 : 
				System.out.println("전국 날씨 정보");
				wetherview.WetherAll(datas);
				break;
			case 3 : 
				System.out.println("지역 날씨 검색");
				wetherInput.Wethersearch(datas);
				break;
			case 4 : 
				System.out.println("지역날씨 추가");
				datas=wetherInput.Wetheradd(datas);
				break;
			case 5 : 
				System.out.println("지역날씨 삭제");
				datas=wetherInput.Wetherremove(datas);
				break;
			default : 
				sw=false;
				
			
			}
		}
	}
}
