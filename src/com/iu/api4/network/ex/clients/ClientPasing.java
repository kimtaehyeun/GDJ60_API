package com.iu.api4.network.ex.clients;

import java.util.ArrayList;
import java.util.StringTokenizer;

import com.iu.api4.network.ex.servers.StudentDTO;

public class ClientPasing {
	
	public ArrayList<StudentDTO> pasing(String msg) {
		StringTokenizer st = new StringTokenizer(msg,"-");
		StudentDTO studentDTO = new StudentDTO();
		
		ArrayList<StudentDTO> ar = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
		studentDTO.setName(st.nextToken());
		studentDTO.setNum(Integer.parseInt(st.nextToken()));
		studentDTO.setKor(Integer.parseInt(st.nextToken()));
		studentDTO.setEng(Integer.parseInt(st.nextToken()));
		studentDTO.setMath(Integer.parseInt(st.nextToken()));
		studentDTO.setTotal(Integer.parseInt(st.nextToken()));
		studentDTO.setAvg(Double.parseDouble(st.nextToken()));
		ar.add(studentDTO);
		}
		return ar ;
	}
	public  void Viewone(StudentDTO students) {
		System.out.println("이름 : "+students.getName());
		System.out.println("번호 : "+students.getNum());
		System.out.println("국어 : "+students.getKor());
		System.out.println("영어 : "+students.getEng());
		System.out.println("수학 : "+students.getMath());
		System.out.println("총점 : "+students.getTotal());
		System.out.println("평균 : "+students.getAvg());
	}
	public void ViewAll(ArrayList<StudentDTO> st) {
		
		
		for(int i = 0; i<st.size(); i++) {
			Viewone(st.get(i));
			System.out.println("");
		}
	}
}
