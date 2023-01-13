package com.iu.api4.network.ex.servers;

import java.util.ArrayList;

public class StudentView {

	public  void Viewone(StudentDTO students) {
		System.out.println(students.getName());
		System.out.println(students.getNum());
		System.out.println(students.getKor());
		System.out.println(students.getEng());
		System.out.println(students.getMath());
		System.out.println(students.getTotal());
		System.out.println(students.getAvg());
	}
	public void ViewAll(ArrayList<StudentDTO> st) {
		
		
		for(int i = 0; i<st.size(); i++) {
			Viewone(st.get(i));
			System.out.println("");
		}
	}
}
