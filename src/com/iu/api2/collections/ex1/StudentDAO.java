package com.iu.api2.collections.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO {

	private StringBuffer sb;
	
	
	public StudentDAO() {
		this.sb = new StringBuffer();
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji-3-23-53-23");
		
	}
	ArrayList<StudentDTO> stuArrayList = new ArrayList<>();
	public ArrayList<StudentDTO> init() {
		
		String string = sb.toString();
		StringTokenizer st = new StringTokenizer(string,"-");
		
		while(st.hasMoreTokens()) {
			
			StudentDTO studentDTO = new StudentDTO();
			
			studentDTO.setName(st.nextToken());
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			studentDTO.setKor(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			
			
			stuArrayList.add(studentDTO);
			
			
		}

		
		return stuArrayList;
	}
	public void add(){
		Scanner sc = new Scanner(System.in);
		
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("이름입력");
		studentDTO.setName(sc.next());
		System.out.println("번호입력");
		studentDTO.setNum(sc.nextInt());
		System.out.println("국어 입력");
		studentDTO.setKor(sc.nextInt());
		System.out.println("영어입력");
		studentDTO.setEng(sc.nextInt());
		System.out.println("수학입력");
		studentDTO.setMath(sc.nextInt());
		
		studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
		studentDTO.setAvg(studentDTO.getTotal()/3.0);
		stuArrayList.add(studentDTO);
		
	}
	public void remove() {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 이름 입력");
		String rname = sc.next();
		for(int i=0; i<stuArrayList.size(); i++) {
			if(stuArrayList.get(i).getName().equals(rname)) {
				stuArrayList.remove(i);
			}
		}
	}
}
