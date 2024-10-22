package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Student_01 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/student.txt";
		
		FileReader fileReader = null;
		
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			System.out.println("=".repeat(50));
			
			while (true) {
				String reader = buffer.readLine();
				if (reader == null) {
					break;
				}
				
				String[] num = reader.split(":");
				System.out.println(num[1] + "\t" + num[5]);
			}
			buffer.close();
			System.out.println("=".repeat(50));
			
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
