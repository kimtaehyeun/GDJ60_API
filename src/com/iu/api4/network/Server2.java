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
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;

public class Server2 {

	public static void main(String[] args) {
		//접속준비
		//1번이면 점심메뉴중 하나를 랜덤하게 골라서 전송
		//2번이면 저녁메뉴중 하나를 랜덤하게 골라서 전송
		//3번 종료
		Socket socket = null;
		ServerSocket ss=null;
		
		
		InputStream is = null;
		InputStreamReader ir = null;
		Random random = null;
		OutputStream os = null;
		OutputStreamWriter ow=null;

		BufferedReader br = null;
		BufferedWriter bw = null;
		ArrayList<String> lunch = null;
		ArrayList<String> dinner = null;

		try {
			boolean sw = true;
			lunch = new ArrayList<>();
			dinner = new ArrayList<>();
			random = new Random();
			String food = "순대국밥,대창국밥,따로국밥,돼지국밥,차돌국밥,양념치킨,순살치킨,반반치킨,뿌링클치킨,맛초킹치킨";
			StringTokenizer st = new StringTokenizer(food, ",");
			while(st.hasMoreTokens()) {
				String data = st.nextToken();
				if(lunch.size()<5)
					lunch.add(data);
				else
					dinner.add(data);
			}




			ss = new ServerSocket(8282);
			System.out.println("대기중");
			socket = ss.accept();
			System.out.println("접속완료");

			//reader
			while(sw) {
				is= socket.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				String msg = br.readLine();
				//writer
				os = socket.getOutputStream();
				ow = new OutputStreamWriter(os);
				bw = new BufferedWriter(ow);


				if(msg.equals("1")){
					int n = random.nextInt(5);
					System.out.println(lunch.get(n)+"보냄");
					bw.write(lunch.get(n)+"\r\n");
					bw.flush();
				}
				else if(msg.equals("2")) {
					int n  = random.nextInt(5);
					System.out.println(dinner.get(n)+"보냄");
					bw.write(dinner.get(n)+"\r\n");
					bw.flush();
				}
				else {
					System.out.println("종료되었습니다.");
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {

			try {
				br.close();
				bw.close();
				ir.close();
				ow.close();
				os.close();
				is.close();
				socket.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}