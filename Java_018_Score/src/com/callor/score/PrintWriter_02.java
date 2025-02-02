package com.callor.score;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintWriter_02 {

	/*
	 * Stream (데이터의 흐름)
	 * 
	 * 컴퓨터에서 데이터를 포현할 때 가장 작은 단위 : bit(이진수의 1자리)
	 * 가장 작은 데이터(정보)의 표현 단위 : 8bit = 1byte
	 * 메모리에 데이터를 저장할 때는 모든 데이터를 이진수로 변환하고 이진수를 8개씩 단위로 묶어서 저장한다
	 * 
	 * 이진수 8개를 특별한 그룹으로 묶어서 4byte, 2byte, 8byte 단위로 저장을 하는 데 이 단위를 word라고 한다
	 * 이 데이터를 파일에 저장, 읽기를 할 때, 네트워크를 통해서 데이터를 교환할 때는 모든 데이터를 bit 단위로만 취급할 수 있다.
	 * 키보드에서 A라는 문자를 누르면 키보드 내의 어떤 장치에서 A라는 문자에 해당하는 이진수 신호를 만든다.
	 * 		65(0100-0001)
	 * 		이진수 신호를 1개씩(1bit씩) 순서대로 컴퓨터로 보낸다
	 * 
	 *  Stream 데이터 전송 (Streaming)
	 *  장치와 장치, 네트워크 통신에 모든 데이터를 bit로 바꾸어 전송하는 것
	 */
	public static void main(String[] args) {
		
		InputStreamReader key = null;
		BufferedReader buffer = null;
		
		key = new InputStreamReader(System.in);
		buffer = new BufferedReader(key);

		String fileName = "src/com/callor/score/print.txt";
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		try {
			fileWriter = new FileWriter(fileName, true);
			out = new PrintWriter(fileWriter);
			while(true) {
				System.out.print(">> ");
				String str = buffer.readLine();
				if(str.equals("QUIT")) break;
				
				System.out.println("입력 문자열 : " + str);
				out.println("입력값 : " + str);
				
			}
			System.out.println("종료!!!");
			
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
