package com.iu.api2.collections.ex1;

public class StudentView {
	StudentDAO studentDAO = new StudentDAO();
	
	
	
	public  void Viewone(StudentDTO students) {
		System.out.println(students.getName());
		System.out.println(students.getNum());
		System.out.println(students.getKor());
		System.out.println(students.getEng());
		System.out.println(students.getMath());
		System.out.println(students.getTotal());
		System.out.println(students.getAvg());
	}
	public void ViewAll(StudentDTO [] students) {
		for(int i = 0; i<students.length; i++) {
			Viewone(students[i]);
			System.out.println("");
		}
	}
}
