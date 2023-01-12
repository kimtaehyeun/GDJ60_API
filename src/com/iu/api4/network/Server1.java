package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {

	public static void main(String[] args) {

		ServerSocket ss =null;
		Socket sc = null;
		InputStream is=null;
		InputStreamReader ir = null;
		BufferedReader br = null;

		OutputStream os =null;
		OutputStreamWriter ow=null;
		BufferedWriter bw=null;
		Scanner scanner= null;
		try {

			ss = new ServerSocket(8282);
			System.out.println("클라이언트 접속을 기다리는중");
			sc = ss.accept();
			System.out.println("클라이언트와 연결 성공");
			boolean toggle = true;
			boolean start = true;
			os = sc.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			scanner = new Scanner(System.in);

			while(start) {
				 
					System.out.println("클라이언트로 보낼 메세지를 입력");
					String msg = scanner.next();
					bw.write(msg+"\r\n");
					bw.flush();
					
					
				
					is = sc.getInputStream();
					ir = new InputStreamReader(is);
					br = new BufferedReader(ir);

					msg = br.readLine();
					
					System.out.println("Client : " + msg);
					
				
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		finally {
			
			
		}
	}

}
