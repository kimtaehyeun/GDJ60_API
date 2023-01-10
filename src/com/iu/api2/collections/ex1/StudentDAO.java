package com.iu.api2.collections.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {

	private StringBuffer sb;
	
	
	public StudentDAO() {
		this.sb = new StringBuffer();
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji-3-23-53-23");
		
	}
	public ArrayList<StudentDTO> init() {
		
		String string = sb.toString();
		StringTokenizer st = new StringTokenizer(string,"-");
		StudentDTO [] students = new StudentDTO[st.countTokens()/5];
		
		ArrayList<StudentDTO> stuArrayList = new ArrayList<>();
		ArrayList arrayList = new ArrayList();
		while(st.hasMoreTokens()) {
			
			StudentDTO studentDTO = new StudentDTO();
			
			studentDTO.setName(st.nextToken());
			
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			
			studentDTO.setKor(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg((double)studentDTO.getTotal()/3);
			
			
			stuArrayList.add(studentDTO);
			
			
		}

		
		return stuArrayList;
	}
}
