package com.iu.api1.wrappers.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JuminCheck jumincheck = new JuminCheck();
		JuminCheck2 juminCheck2 = new JuminCheck2();
		System.out.println("주민등록번호 입력");//991022-1546411
		String juminnumber = sc.next();
		String [] jumin = juminnumber.split("-");
//		jumincheck.check1(jumin);
//		jumincheck.check2(jumin);
		juminCheck2.jumincheck(jumin);
	}

}
