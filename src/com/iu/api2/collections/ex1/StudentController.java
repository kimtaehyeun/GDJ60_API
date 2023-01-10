package com.iu.api2.collections.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
	private	StudentDAO st;
	private 	ArrayList<StudentDTO> students;
	private 	StudentView sv;
	private	boolean start ;
	private	Scanner sc;
	
	public StudentController() {
		this.st = new StudentDAO();
		this.sv = new StudentView();
		this.start = true;
		this.sc = new Scanner(System.in);
		
	}
	
	public void Start() {
		
		
			
		while(start) {
			System.out.println("1. 학생 정보 초기화");
			System.out.println("2. 학생 정보  전체 조회");
			System.out.println("3. 학생 정보 검색 조회(이름)");
			System.out.println("4. 학생 정보 추가");
			System.out.println("5. 학생 정보 삭제 (이름)");
			System.out.println("6. 프로그램 종료");
			System.out.println("번호를 입력하세요");
			int num = sc.nextInt();
			switch (num) {
			case 1: {
				students= st.init();
				System.out.println("1. 학생 정보 초기화");
				
				for(int i =0; i<students.size();i++) {
					System.out.println(students.get(i).getName());
				}
				break;
			}
			case 2: {
				System.out.println("2. 학생 정보  전체 조회");
				sv.ViewAll(students);
				break;
			}
			case 3: {
				System.out.println("3. 학생 정보 검색 조회(이름)");
				System.out.print("학생이름검색 : ");
				String name = sc.next();
				for(int i = 0; i <students.size(); i++) {
					if(name.equals(students.get(i).getName())){
						sv.Viewone(students.get(i));
					}
				}
				break;
			}
			case 4: {
				System.out.println("4. 학생 정보 추가");
				st.add();
				break;
			}
			case 5: {
				System.out.println("5. 학생 정보 삭제 (이름)");
				st.remove();
				break;
			}
			case 6: {
				System.out.println("6. 프로그램 종료");
				start = false;
				break;
			}
			default:
				System.out.println("잘못 입력하였습니다.");
			}
		}
	}
	
}
