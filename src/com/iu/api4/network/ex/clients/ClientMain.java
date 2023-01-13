package com.iu.api4.network.ex.clients;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

import com.iu.api4.network.ex.servers.StudentDTO;

public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		Scanner sc = null;
		InputStream is = null;
		InputStreamReader ir = null;

		OutputStream os = null;
		OutputStreamWriter ow=null;
		ArrayList<StudentDTO> students = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		ClientPasing cp = null;
		try {
			socket = new Socket("192.168.1.31", 8282);
			System.out.println("접속");
			sc= new Scanner(System.in);
			os = socket.getOutputStream(); //char
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			cp = new ClientPasing();
			students = new ArrayList<>();
			while(true) {
				System.out.println("1번:전체출력 ,2번:한명 출력 , 3번:학생 추가 , 4번:학생 삭제 5,:종료");
				System.out.print("번호 입력 : ");
				String num = sc.next();

				bw.write(num+"\r\n");
				bw.flush();
				String msg = br.readLine();
				if(num.equals("1")) {
					cp.ViewAll(cp.pasing(msg));
				}
				else if(num.equals("2")) {
					System.out.println(msg);
					String data = sc.next();
					bw.write(data+"\r\n");
					bw.flush();
					msg = br.readLine();
					
					cp.Viewone(cp.pasing(msg).get(cp.pasing(msg).size()-1));
					System.out.println("한명 : "+msg);
				}
				else if(num.equals("3")) {
					System.out.println(msg);
					String data = sc.next();
					bw.write(data+"\r\n");
					bw.flush();
					msg = br.readLine();
					
					System.out.println(msg);
				}else if(num.equals("4")) {
					System.out.println(msg);
					String data = sc.next();
					bw.write(data+"\r\n");
					bw.flush();
					msg = br.readLine();
					System.out.println(msg);
				}
				else if(num.equals("5")) {
					System.out.println(msg);
					break;

				}
				else {
					System.out.println("다시 입력해 주세요");
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
				is.close();
				os.close();
				socket.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
