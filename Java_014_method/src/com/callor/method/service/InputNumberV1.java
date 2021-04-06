package com.callor.method.service;

import java.util.Scanner;

public class InputNumberV1 {

	Scanner scan = new Scanner(System.in);

	public Integer inputValue(String title) {

		while (true) {
			System.out.println(title + " 값을 입력하세요");
			System.out.print(">> ");
			String strNum = scan.nextLine();
			Integer intNum = null;

			if (strNum.equals("QUIT")) {
				return null;
			} else {
				try {
					intNum = Integer.valueOf(strNum);
				} catch (NumberFormatException e) {
					System.out.println("정수 또는 QUIT만 입력하세요");
					continue;
				} // end try-catch
			} // end if-else
			return intNum;
		} // end while
	}// end inputValue
}
