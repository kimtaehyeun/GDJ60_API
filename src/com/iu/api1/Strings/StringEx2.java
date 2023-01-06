package com.iu.api1.Strings;
//선생님 버전

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = {"jpg","jpeg","gif","png"};
		System.out.println("파일명을 입력");
		String fileName = sc.next();//sf.sd.dsf.df
		int idx = fileName.lastIndexOf(".");
		System.out.println(idx);
		String result  = fileName.substring(idx+1);
		System.out.println(result);
			

	}

}
