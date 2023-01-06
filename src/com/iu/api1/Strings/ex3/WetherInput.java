package com.iu.api1.Strings.ex3;

import java.util.Scanner;

public class WetherInput {

	public void Wethersearch(WetherDTO [] datas) {
		
		WetherView wetherView = new WetherView();
		Scanner sc = new Scanner(System.in);
		System.out.print("도시 입력 : ");
		String sity = sc.next().toUpperCase();
		boolean flag = true;
		for(int i = 0; i<datas.length;i++) {
			if(sity.equals(datas[i].getCity())){
				wetherView.WetherOne(datas[i]);
				flag = false;
			}
		}
		if(flag==true) {
			System.out.println("잘못 입력하였습니다.");
		}
	}


	public WetherDTO[] Wetheradd(WetherDTO [] datas) {
		
		WetherDTO  data = new WetherDTO();
		Scanner sc = new Scanner(System.in);
		WetherDTO []adddatas = new WetherDTO[datas.length+1];

		
		System.out.print("추가할 도시 입력 : ");
		data.setCity(sc.next().toUpperCase());
		System.out.print("추가할 온도 입력 : ");
		data.setGion(sc.next());
		System.out.print("추가할 날씨 입력 : ");
		data.setStatus(sc.next());
		System.out.print("추가할 미세먼지농도 입력 : ");
		data.setMise(sc.next());
		for(int i= 0; i<datas.length;i++) {
			adddatas[i]=datas[i];
		}
		adddatas[datas.length]=data;
		
		return adddatas;

	}

	public WetherDTO[] Wetherremove(WetherDTO [] datas) {
		WetherDTO [] removedata = new WetherDTO[datas.length-1];//3
					//2,1,0
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 도시 : ");
		String remove = sc.next().toUpperCase();
		int x=0;
		
		for(int i =0; i<datas.length; i++) {
			
			if(remove.equals(datas[i].getCity().toUpperCase())) {
				System.out.println("삭제되었습니다.");
			}
			else {
				removedata[x]=datas[i];
				x++;
			}
		}
		
		
		
			return removedata;
	}
}
