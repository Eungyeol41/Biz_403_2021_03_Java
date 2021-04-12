package com.callor.app.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriterEx_01 {

	public static void main(String[] args) {
		
		//0 ~ 100 중 임의의 숫자 입력
		Random rnd = new Random();
		int a = rnd.nextInt(101);
		int b = rnd.nextInt(101);
		
		// 파일에 저장하기
		// 파일 위치
		String fileName = "src/com/callor/app/data.txt";
		
		// 객체 선언
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		// 파일에 데이터 기록을 위해 파일을 열고 새로운 파일 생성
		// 만약 있으면 새로 만들어라
		try {
			fileWriter = new FileWriter(fileName);
			out = new PrintWriter(fileWriter);
			out.println("=".repeat(20));
			
			out.printf("%d + %d = %d\n", a, b, a + b);
			if(a >= b) {
				out.printf("%d - %d = %d\n", a, b, a - b);
			} else {
				out.printf("%d - %d = %d\n", b, a, b - a);
			}// 뺄셈
			out.printf("%d x %d = %d\n", a, b, a * b);
			if(a >= b) {
				out.printf("%d / %d = %d\n", a, b, a / b);
			} else {
				out.printf("%d / %d = %d\n", b, a, b / a);
			} // 나눗셈
			out.println("=".repeat(20));
			
			out.flush(); // 파일에 저장
			out.close(); // end
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
