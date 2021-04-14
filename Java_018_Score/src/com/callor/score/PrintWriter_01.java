package com.callor.score;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriter_01 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/test.txt";
		PrintWriter out = null;
		
		try {
			out = new PrintWriter(fileName);
			for(int i = 0; i < 10; i++) {
				out.printf("%05d\n", i + 1);
			}
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
