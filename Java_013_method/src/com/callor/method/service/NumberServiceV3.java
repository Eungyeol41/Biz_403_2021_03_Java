package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV3 {

	public Integer inputNum() {

		Scanner scan = new Scanner(System.in);
		Integer intNum;

		while (true) {
			System.out.println("정수  0 ~ 100까지 중 입력");
			System.out.println("QUIT 입력하면 종료");
			System.out.print(" >> ");
			String strNum = scan.nextLine();

			if (strNum.equals("QUIT")) {
				return null;
			} // else {

			try {
				intNum = Integer.valueOf(strNum);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("숫자가 아닌 값을 입력하였습니다");
				continue;
			} // end try - catch

			// } // end if - else

			if (intNum < 0 || intNum > 100) {
				System.out.println("정수는 0 ~ 100 내에서만 입력하세요");
				System.out.print(" >> ");
				continue;
			} // end if

			return intNum;

		} // end while

	} // end inputNum
}
