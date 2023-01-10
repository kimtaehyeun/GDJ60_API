package com.iu.api2.collections.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {

	private StringBuffer sb;
	
	
	public StudentDAO() {
		this.sb = new StringBuffer();
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji, 3, 89 ,74 ,87 ");
		sb.append("choa,4, 71 ,25 ,99 ");
		
		
	}
	//학생 정보 초기화
	public ArrayList<StudentDTO> init() {
		String data = this.sb.toString();
		data = data.replace(" ", "-");
		data = data.replace(",","");
		System.out.println(data);
		StringTokenizer st = new StringTokenizer(data,"-");
		ArrayList<StudentDTO> ar = new ArrayList<>();
		while(st.hasMoreTokens()) {
			StudentDTO studentDTO = new StudentDTO();
			
			studentDTO.setName(st.nextToken());
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			ar.add(studentDTO);
			
		}
	return ar;
	}
}
