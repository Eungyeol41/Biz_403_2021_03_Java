package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV2 {

	public Integer inputNum() {
		Scanner scan = new Scanner(System.in);
		Integer intNum = null;

			System.out.println("0 ~ 100까지 정수를 입력하세요 ( QUIT : 입력중단)");
			System.out.print(" >> ");
			String strNum = scan.nextLine();
			
			
			if(strNum.equals("QUIT")) {
				return null;
			} else {
				intNum = Integer.valueOf(strNum);
				return intNum;
			}
			
	} // end inputNum

}
