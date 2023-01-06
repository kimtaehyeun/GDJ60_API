package com.iu.api1.Strings.ex3;

public class WetherData {

	private String data;
	public WetherData() {
		this.data = "SEOUL,12,맑음,60%,DAEGU,68,비,10%,"
				+"JEJU,-56,눈,12%,JUNJU,32,흐림,5%";
	}
	
	public WetherDTO[] init() {
		String [] result = this.data.split(",");
		
		WetherDTO[] wethers = new WetherDTO[result.length/4];
		
		int idx = 0;
		for(int i = 0; i<result.length;i=i+4) {
			WetherDTO in = new WetherDTO();
			in.setCity(result[i]);
			in.setGion(result[i+1]);
			in.setStatus(result[i+2]);
			in.setMise(result[i+3]);
			
			wethers[idx]=in;
			idx++;
			
		}
		
		

		
		
		return wethers;
	}
	
	//메서드명 init;
	//data를 파싱해서 각 데이터를 DTO에 대입하고 DTO들을 리턴
	
}
