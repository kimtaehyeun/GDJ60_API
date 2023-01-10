package com.iu.api2.collections.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {

	public void Start() {
		Scanner sc = new Scanner(System.in);
		
		StudentDAO st = new StudentDAO();
		ArrayList<StudentDTO> sutdents = st.init();
		StudentView sv = new StudentView();
		boolean start = true;
		
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
				System.out.println("1. 학생 정보 초기화");
					stud
				break;
			}
			case 2: {
				System.out.println("2. 학생 정보  전체 조회");
				
				break;
			}
			case 3: {
				System.out.println("3. 학생 정보 검색 조회(이름)");
				break;
			}
			case 4: {
				System.out.println("4. 학생 정보 추가");
				break;
			}
			case 5: {
				System.out.println("5. 학생 정보 삭제 (이름)");
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
