package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {

	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os =null;
		OutputStreamWriter ow=null;
		BufferedWriter bw=null;
		Scanner scanner= null;
		InputStream is=null;
		InputStreamReader ir = null;
		BufferedReader br = null;	
		try {
			//객체 생성시 서버 접속 시도.

			socket = new Socket("192.168.1.114",8282);//0~65535		//소켓이 들어오면
			
			System.out.println("서버와 접속이 성공");

			
			boolean start = true;
			
			os =socket.getOutputStream();
			//char
			ow = new OutputStreamWriter(os);
			//Stream
			bw = new BufferedWriter(ow);
			
			
			while(start) {
				scanner = new Scanner(System.in);
				
					
					String msg = scanner.next();
					bw.write(msg+"\r\n");
					bw.flush();
					
					is = socket.getInputStream();
					ir = new InputStreamReader(is);
					br = new BufferedReader(ir);
					msg = br.readLine();
					
					System.out.println("서버 : " + msg);
					
				}
			


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
