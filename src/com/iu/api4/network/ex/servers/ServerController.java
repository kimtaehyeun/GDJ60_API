package com.iu.api4.network.ex.servers;

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

public class ServerController {
	Socket socket = null;
	ServerSocket ss=null;
	ServerDAO serverDAO = null;
	InputStream is = null;
	InputStreamReader ir = null;
	Random random = null;
	BufferedReader br = null;
	public void ServerController() {

	}

	public void start() {
		OutputStream os = null;
		OutputStreamWriter ow=null;
		BufferedWriter bw = null;
		serverDAO = new ServerDAO();
		ArrayList<StudentDTO> students = serverDAO.init();
		boolean sw = true;
		try {
			ss = new ServerSocket(8282);
			System.out.println("대기중");
			socket = ss.accept();
			System.out.println("접속완료");
			serverDAO.ServerDAO(socket);
			is= socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);

			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			String  msg;
			while(sw) {
				
				msg = br.readLine();
				if(msg.equals("1")) {
					serverDAO.one(socket);

				}
				if(msg.equals("2")) {
					bw.write("학생의 이름을 적어주세요");
					bw.write("\r\n");
					bw.flush();
					msg = br.readLine();
					serverDAO.search(msg);

					
				}
				if(msg.equals("3")) {
					bw.write("학생의 정보를 적어주세요");
					bw.write("\r\n");
					bw.flush();
					msg = br.readLine();
					serverDAO.add(msg);
					bw.write("입력 완료");
					bw.write("\r\n");
					bw.flush();
					
				}
				if(msg.equals("4")) {
					bw.write("학생의 이름을 적어주세요");
					bw.write("\r\n");
					bw.flush();
					msg = br.readLine();
					serverDAO.remove(msg);
					bw.write("삭제 완료");
					bw.write("\r\n");
					bw.flush();
				}
				if(msg.equals("5")) {
					bw.write("종료합니다.");
					bw.write("\r\n");
					bw.flush();
					break;
				}

			}
		} catch (IOException e) {

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