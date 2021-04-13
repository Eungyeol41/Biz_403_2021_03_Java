package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_03 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/sample_score.txt";
		
		// 파일을 읽기 위해서 open하는 클래스
		// OS에게 파일을 읽을 수 있도록 허락해달라 요청하기
		FileReader fileReader = null;
		
		// FileReader가 open해 놓은 파일에서 데이터를 읽어서 buffer라고 하는 임시 기억 장소에 저장해 놓는다
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			// 파일에 저장된 데이터의 라인수를 알 때는 for()를 이용하여 읽을 수 있는데..
			// 라인수를 알 수 없을 때는???
			// for(int i = 0; i < 30; i++) {
			
			/*
			 * bufferedReader.readLine() method를 실행하면 buffer에 저장된 데이터를 한 라인씩 읽어서 String 데이터로 return을 한다
			 * 
			 * 매번 호출될 때마다 자동으로다음 라인을 읽어서 String 데이터로 retrun을 한다.
			 * 
			 * 만약 readLine() method를 데이터 개수만큼 반복하면 모든 데이터를 읽을 수 있다.
			 * 
			 * 하지만 이 방법은 데이터의 개수를 알아야만 실행할 수 있다.
			 * 
			 * 데이터의 개수를 정확히 알 수 없을 때는 어ㅉ러 수 없이 무한반복을 해야 할 텐데 무한밥고문을 실행할 때는 중간에 탈출구를 고민해야 한다.
			 * 마찬가지로 readLine() 탈출할 수 있는 방법을 
			 */
			while(true) {
				String str = buffer.readLine();
				System.out.println(str);
			}
			// System.out.println(buffer.readLine());
			// System.out.println(buffer.readLine());
			// System.out.println(buffer.readLine());
			// buffer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
