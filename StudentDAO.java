package com.iu.api2.collections.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO {

	Calendar ca = Calendar.getInstance();
	SimpleDateFormat sd = new SimpleDateFormat("yy년MM월dd일E_hhmm");
	String date = sd.format(ca.getTime());
	private String filename=null;
	private StringBuffer sb;

	public StudentDAO() {
	}
	ArrayList<StudentDTO> stuArrayList = new ArrayList<>();
	boolean backup = true;
	public ArrayList<StudentDTO> init() {
		File file;


		if(filename==null) {
			file = new File("C:\\fileTest","test.txt");

		}
		else {
			file = new File("C:\\fileTest",filename+".txt");
			stuArrayList.clear();

		}

		try {
			FileReader fr = new FileReader(file);
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



				stuArrayList.add(studentDTO);




			}

		} catch (Exception e) {

			e.printStackTrace();

		}


		//		while(st.hasMoreTokens()) {
		//			
		//			StudentDTO studentDTO = new StudentDTO();
		//			
		//			studentDTO.setName(st.nextToken());
		//			studentDTO.setNum(Integer.parseInt(st.nextToken()));
		//			studentDTO.setKor(Integer.parseInt(st.nextToken()));
		//			studentDTO.setEng(Integer.parseInt(st.nextToken()));
		//			studentDTO.setMath(Integer.parseInt(st.nextToken()));
		//			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
		//			studentDTO.setAvg(studentDTO.getTotal()/3.0);
		//			
		//			
		//			stuArrayList.add(studentDTO);
		//			
		//			
		//		}


		return stuArrayList;

	}
	//	public void studentBackup(ArrayList<StudentDTO> ar) {
	//		
	//		File file = new File("C:\\fileTest","student.txt");
	//		FileWriter fw = null;
	//		try {
	//			fw = new FileWriter(file);
	//			for(StudentDTO studentDTO : ar) {
	//				StringBuffer sb= new StringBuffer();
	//				sb.append(studentDTO.getName());
	//				sb.append("-");
	//				sb.append(studentDTO.getNum());
	//				sb.append("-");
	//				sb.append(studentDTO.getKor());
	//				sb.append("-");
	//				sb.append(studentDTO.getEng());
	//				sb.append("-");
	//				sb.append(studentDTO.getMath());
	//				sb.append("\r\n");
	//				
	//				fw.write(sb.toString());
	//				fw.flush();
	//				
	//			}
	//		}
	//		catch(Exception e) {
	//			e.printStackTrace();
	//		}
	//		finally {
	//			try {
	//				fw.close();
	//			} catch (IOException e) {
	//				// TODO Auto-generated catch block
	//				e.printStackTrace();
	//			}
	//		}
	//	}
	public void studentsbackup() {

		File file = new File("C:\\fileTest",date+".txt");
		filename = date;
		try {
			FileWriter fw = new FileWriter(file,false);
			for(int i = 0; i<stuArrayList.size(); i++) {
				fw.write(stuArrayList.get(i).getName()+"-");
				fw.write(stuArrayList.get(i).getNum()+"-");
				fw.write(stuArrayList.get(i).getKor()+"-");
				fw.write(stuArrayList.get(i).getEng()+"-");
				fw.write(stuArrayList.get(i).getMath()+"\r\n");

				fw.flush();

			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	public void add(){
		Scanner sc = new Scanner(System.in);

		StudentDTO studentDTO = new StudentDTO();
		System.out.println("이름입력");
		studentDTO.setName(sc.next());
		System.out.println("번호입력");
		studentDTO.setNum(sc.nextInt());
		System.out.println("국어 입력");
		studentDTO.setKor(sc.nextInt());
		System.out.println("영어입력");
		studentDTO.setEng(sc.nextInt());
		System.out.println("수학입력");
		studentDTO.setMath(sc.nextInt());

		studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
		studentDTO.setAvg(studentDTO.getTotal()/3.0);
		stuArrayList.add(studentDTO);

	}
	public void remove() {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 이름 입력");
		String rname = sc.next();
		for(int i=0; i<stuArrayList.size(); i++) {
			if(stuArrayList.get(i).getName().equals(rname)) {
				stuArrayList.remove(i);
			}
		}
	}
}
