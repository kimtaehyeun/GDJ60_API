package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 서버 접속 시도
		//2. 1번 점심, 2번 저녁 3번 종료
		//3. 1,2,3고르기
		// 1번 선택 : 서버에서 점심 메뉴중 하나 보내줌 ,출력
		// 2번 선택 : 서버에서 저녁 메뉴중 하나 보내줌 , 출력
		// 3번 선택 : 종료
		Socket socket = null;
		Scanner sc = null;
		InputStream is = null;
		InputStreamReader ir = null;

		OutputStream os = null;
		OutputStreamWriter ow=null;

		BufferedReader br = null;
		BufferedWriter bw = null;
		//전승민 : 192.168.1.114
		try {
			boolean sw = true;
			socket = new Socket("192.168.1.31", 8282);
			System.out.println("접속");
			sc= new Scanner(System.in);

			while(sw) {
				os = socket.getOutputStream(); //char
				ow = new OutputStreamWriter(os);
				bw = new BufferedWriter(ow);

				System.out.println("1번: 점심 , 2번: 저녁, 3번: 종료");
				System.out.print("번호 입력 : ");
				String num = sc.next();
				bw.write(num+"\r\n");
				bw.flush();
				is = socket.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				String msg = br.readLine();
				if(num.equals("1")) {
					System.out.println("전체 : "+msg);
				}
				else if(num.equals("2")) {
					System.out.println("이름입력 : ");
					String data = sc.next();
					bw.write(num+"\r\n");
					bw.flush();
				}
				else if(num.equals("3")) {
					System.out.println("종료");
					break;
				}
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				br.close();
				bw.close();
				ir.close();
				ow.close();
				os.close();
				is.close();
				socket.close();
				sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}
