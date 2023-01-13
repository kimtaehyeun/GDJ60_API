package com.iu.api4.network.ex.servers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class ServerDAO {
	OutputStream os = null;
	OutputStreamWriter ow=null;
	BufferedWriter bw = null;
	ServerController servercontroller = new ServerController();
	ArrayList<StudentDTO> ar = new ArrayList<>();
	StudentDTO studentDTO = new StudentDTO();
	Socket so = null;
	public void ServerDAO(Socket socket) {
		so = socket;
		try {
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public ArrayList<StudentDTO> init(){
		File file = new File("C:\\filetest","test.txt");
		try {
			FileReader fr =new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String student = br.readLine();
				if(student==null) {
					break;
				}

				StringTokenizer st = new StringTokenizer(student,"-");


				StudentDTO studentDTO = new StudentDTO();

				studentDTO.setName(st.nextToken());
				studentDTO.setNum(Integer.parseInt(st.nextToken()));
				studentDTO.setKor(Integer.parseInt(st.nextToken()));
				studentDTO.setEng(Integer.parseInt(st.nextToken()));
				studentDTO.setMath(Integer.parseInt(st.nextToken()));
				studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
				studentDTO.setAvg(studentDTO.getTotal()/3.0);
				ar.add(studentDTO);




			}
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		return ar;
	}
	public void one(Socket socket) {
		//		writer


		try {

			for(int i = 0; i<ar.size(); i++) {

				bw.write(ar.get(i).getName()+"-");
				bw.write(ar.get(i).getNum()+"-");
				bw.write(ar.get(i).getKor()+"-");
				bw.write(ar.get(i).getEng()+"-");
				bw.write(ar.get(i).getMath()+"-");
				bw.write(ar.get(i).getTotal()+"-");
				bw.write(ar.get(i).getAvg()+"-");

			}
			bw.write("\r\n");
			bw.flush();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	public void search(String msg) {
		int count = 0;
		try {
			for(int i =0; i<ar.size(); i++) {
				if(msg.equals(ar.get(i).getName())){

					bw.write(ar.get(i).getName()+"-");
					bw.write(ar.get(i).getNum()+"-");
					bw.write(ar.get(i).getKor()+"-");
					bw.write(ar.get(i).getEng()+"-");
					bw.write(ar.get(i).getMath()+"-");
					bw.write(ar.get(i).getTotal()+"-");
					bw.write(ar.get(i).getAvg()+"-");


					bw.write("\r\n");
					bw.flush();
					break;
				}
				else {
					count++;
				}


			}
			if(count==ar.size()) {
				bw.write("학생을 찾을 수 없습니다.");
				bw.write("\r\n");
				bw.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}


	}
	public void add(String msg) {
		try {
			StringTokenizer st = new StringTokenizer(msg,"-");


			StudentDTO studentDTO = new StudentDTO();

			studentDTO.setName(st.nextToken());
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			studentDTO.setKor(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			ar.add(studentDTO);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void remove(String msg) {
		int count = 0;
		for(int i = 0; i<ar.size();i++) {
			if(ar.get(i).getName().equals(msg)) {
				ar.remove(i);
			}
			else {
				count++;
				
				
			}
		}
		if(count==ar.size()) {
			try {
				bw.write("학생을 찾을 수 없습니다.");
				bw.write("\r\n");
				bw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
