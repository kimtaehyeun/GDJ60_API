package com.iu.api1.wrappers.ex1;

public class JuminCheck {

	public void check1(String [] jumin) {
		//주민등록번호를 받아서
		//남자인지 여자인지 출력
		char sexin = jumin[1].toString().charAt(0);
		String sex = String.valueOf(sexin);
		
		String [] man= {"1","3"};
		String [] woman={"2","4"};
		for(int i = 0 ;i<2;i++) {
			if(man[i].toString().equals(sex)) {
				System.out.println("남자입니다.");
				
			}
			else if(woman[i].toString().equals(sex)) {
				System.out.println("여자입니다.");
			}
		}
	}
	public void check2(String [] jumin) {
		//주민등록번호를 받아서
		//나이를 계산
		//3-5 : 봄
		//6-8 : 여름
		//9-11 : 가을
		//12-2 : 겨울
		//991022-1546411
		//1. 나이계산
		String y = jumin[0].substring(0,2);
		String check = jumin[1].substring(0,1);
		System.out.println(check);
		int year = 1900;
		if(check.equals("3")||check.equals("5")) {
			year=2000;
		}
		year = year+Integer.parseInt(y);
		int age = 2023-year;
		System.out.println("Age : "+age);
//		//2.계절 계산
//		String gejul = jumin[0].substring(2,4);
//		if(gejul.equals("3")||gejul.equals("4")||gejul.equals("5"))
//			System.out.println("봄");
//		else if(gejul.equals("6")||gejul.equals("7")||gejul.equals("8"))
//			System.out.println("여름");
//		else if(gejul.equals("9")||gejul.equals("10")||gejul.equals("11"))
//			System.out.println("가을");
//		else if(gejul.equals("12")||gejul.equals("1")||gejul.equals("2"))
//			System.out.println("겨울");
		String m =jumin[0].substring(2,4);
		int month = Integer.parseInt(m);
			if(month>=3&&month<=5) 
				System.out.println("봄");
			else if(month>=6&&month<=8)
				System.out.println("여름");
			else if(month>=9&&month<=11)
				System.out.println("가을");
			else
				System.out.println("겨울");
	}
}
