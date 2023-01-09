package com.iu.api1.wrappers.ex1;

public class JuminCheck2 {
	//주민번호 받아서
	//check
	//991022-1234567
	//주민번호 맨 끝자리는 체크용 번호
	//	9		9	1	0	2	2	-	1	2	3	4	5	6	7
	
	//X 2		3	4	5	6	7		8	9	2	3	4	5
	//	18		27	4	0	12	14		8	18	6	12	20	30
	//	합이 122 합을 11로 나누어서 나머지 구함
	//122/11 = 몫:11, 나머지 1 이런식으로
	//나머지 값을 11로 뺀 결과값 하고 체크용 번호랑 같은지 확인.
	//11 -1 10
	//11로 뺀 결과값이 두자리라면
	//11로 뺀 결과값을 다시 10으로 나눈 나머지를 체크용 
	//번호랑 같은지 확인
	//10/10 몫 1, 나머지 0 과 체크용 번호가 같은지 확인
	
	public void jumincheck(String [] jumin) {
		int last = Integer.parseInt(jumin[1].substring(6));
		jumin[1]=jumin[1].substring(0,6);
		
		String [] first = jumin[0].split("");
		String [] second =jumin[1].split("");
		Integer sum = 0;
		int total = 0;
		int j = 2;
		for(int i=0; i<first.length;i++) {
			sum+=Integer.parseInt(first[i])*j;
			j++;
		}
		for(int i=0; i<first.length;i++) {
			if(j/10==1)
				j=2;
			sum+=Integer.parseInt(second[i])*j;
			j++;
		}
		sum = sum%11;//11로나눈 나머지
		total = 11-sum;
	
		if(total/10==1) {//두자리면
			if(total%10==last) {
				System.out.println("같다");
			}
			else
				System.out.println("다르다");
		}
		else {
			if(total==last)
				System.out.println("같다");
			else
				System.out.println("다르다");
		}
		
		
	}
}
