package com.iu.api1.Strings.ex3;

import java.util.StringTokenizer;

public class WetherData {

	private String data;
	public WetherData() {
		this.data = "SEOUL,12,맑음,60%,DAEGU,68,비,10%,"
				+"JEJU,-56,눈,12%,JUNJU,32,흐림,5%";
	}
	public WetherDTO [] init() {
		StringTokenizer st = new StringTokenizer(data,",");
		WetherDTO [] wethers = new WetherDTO[st.countTokens()/4];
		int i= 0;
		while(st.hasMoreTokens()) {
			
			WetherDTO wetherDTO = new WetherDTO();
			
			String t1 = st.nextToken();
			wetherDTO.setCity(t1);
			String t2 = st.nextToken();
			wetherDTO.setGion(t2);
			String t3 = st.nextToken();
			wetherDTO.setStatus(t3);
			String t4 = st.nextToken();
			wetherDTO.setMise(t4);
			
			wethers[i]=wetherDTO;
			i++;
		}
		
		
		return wethers;
	}
//	public WetherDTO[] init() {
//		String [] result = this.data.split(",");//16
//		
//		WetherDTO[] wethers = new WetherDTO[result.length/4];//4
//		//0~15
//		int idx = 0;
//		for(int i = 0; i<result.length;i=i+4) {//0~15	0,4,8
//			WetherDTO in = new WetherDTO();
//			in.setCity(result[i]);//	0		4
//			in.setGion(result[i+1]);//	1		5
//			in.setStatus(result[i+2]);//2		6
//			in.setMise(result[i+3]);//	3		7
//			
//			wethers[idx]=in;
//			idx++;
//			
//		}
//	
//		return wethers;
//	}
	
	//메서드명 init;
	//data를 파싱해서 각 데이터를 DTO에 대입하고 DTO들을 리턴
	
}
