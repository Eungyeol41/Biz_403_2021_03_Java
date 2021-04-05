package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV5 {

	public Integer inputNum(String title) {

		Scanner scan = new Scanner(System.in);
		Integer intNum = null;

		while (true) {
			System.out.println(title + " 값을 입력하세요");
			System.out.print(" >> ");
			String strInput = scan.nextLine();

			if (strInput.trim().equals("QUIT")) {
				return null;
			} else {

				try {
					intNum = Integer.valueOf(strInput);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					System.out.println("숫자나 QUIT만 입력하세요");
					continue;
				} // end try - catch

			} // end if- else

			if (intNum < 0 || intNum > 100) {
				System.out.println("범위를 벗어났음");
				continue;
			} // end if
			return intNum;
		} // end while
	}
}
