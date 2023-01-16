package com.iu.api5.thread;

public class ThreadMain {

	public static void main(String[] args) {

		ThreadTest1 tt1 = new ThreadTest1();
		ThreadTest2 tt2 = new ThreadTest2();
		ThreadTest3 tt3 = new ThreadTest3();
		ThreadTest4 tt4 = new ThreadTest4();
		tt1.start();//OS에게 위임
		tt2.start();//OS에게 위임
		
		//runable인터페이스 구현할때 Thread객체를 선언해줘야한다.
		Thread tr1 = new Thread(tt3);
		Thread tr2 = new Thread(tt4);
		tr1.start();
		tr2.start();
	}
}
