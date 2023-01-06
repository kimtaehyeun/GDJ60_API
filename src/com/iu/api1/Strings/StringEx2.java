package com.iu.api1.Strings;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = {"jpg","jpeg","gif","png"};
		System.out.println("파일명을 입력");
		String fileName = sc.next();//sf.sd.dsf.df

		int idx= fileName.lastIndexOf(".");
		int flag =0;
		for(int i=0; i<names.length;i++) {
			if(fileName.substring(idx+1).equals(names[i])) {
				System.out.println(fileName);
				flag =1;
			}
		}
		if(flag==0) {
			System.out.println("그림이 아닙니다.");
		}
		
			

	}

}
