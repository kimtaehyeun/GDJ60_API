package com.iu.api1.Strings.ex3;

import java.util.Scanner;

public class WetherInput {

	public void Wethersearch() {
		WetherData wetherData= new WetherData();
		WetherDTO [] datas = wetherData.init();
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
			wetherView.WetherOne(null);
		}
	}


	public WetherDTO[] Wetheradd(WetherDTO [] datas) {
		WetherData wetherData= new WetherData();
		WetherDTO  data = new WetherDTO();

		Scanner sc = new Scanner(System.in);


		WetherDTO []adddatas = new WetherDTO[datas.length+1];

		for(int i= 0; i<datas.length;i++) {
			adddatas[i]=datas[i];
		}
		System.out.print("추가할 도시 입력 : ");
		data.setCity(sc.next().toUpperCase());
		System.out.print("추가할 온도 입력 : ");
		data.setGion(sc.next());
		System.out.print("추가할 날씨 입력 : ");
		data.setStatus(sc.next());
		System.out.print("추가할 미세먼지농도 입력 : ");
		data.setMise(sc.next());
		adddatas[datas.length]=data;
		for(int i =0; i<adddatas.length;i++) {
			System.out.println(adddatas[i].getCity());
			System.out.println(adddatas[i].getGion());
			System.out.println(adddatas[i].getStatus());
			System.out.println(adddatas[i].getMise());

		}


		return adddatas;

	}

	public WetherDTO[] Wetherremove(WetherDTO [] datas) {
		WetherData wetherData= new WetherData();
		WetherDTO  data = new WetherDTO();
		WetherDTO [] removedata = new WetherDTO[datas.length];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 도시 : ");
		String remove = sc.next();
		int x=0;
		for(int i =0; i<datas.length; i++) {
			if(remove.toLowerCase().equals(datas[i].getCity())) {
				
			}
			else {
				removedata[x]=datas[i];
				x++;
			}
		}
		for(int i = 0; i<removedata.length-1; i++) {
			System.out.println(removedata[i].getCity());
			System.out.println(removedata[i].getGion());
			System.out.println(removedata[i].getStatus());
			System.out.println(removedata[i].getMise());
			
		}
		
		
			return removedata;
	}
}
