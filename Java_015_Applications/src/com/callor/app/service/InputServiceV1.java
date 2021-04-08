package com.callor.app.service;

import java.util.Scanner;

public class InputServiceV1 {

	Scanner scan = new Scanner(System.in);
	
	public Integer inputValue(String title) {
		
		while(true) {
			System.out.println(title + " 값을 입력하세요 ( QUIT : 입력 중단)");
			System.out.print(" >> ");
			String strNum = scan.nextLine();
			
			if(strNum.equals("QUIT")) {
				return null;
			} else {
				Integer intNum = null;
				try {
					intNum = Integer.valueOf(strNum);
				} catch (NumberFormatException e) {
					System.out.println("정수나 QUIT만 입력 가능합니다");
					continue;
				}// end try-catch
				return intNum;
			}// end if-else
		}// end while
	}// end inputValue(title)
	
	public Integer inputValue(String title, int start) {
		
		while(true) {
			Integer intNum1 = this.inputValue(title);
			if(intNum1 == null) {
				return null;
			} else if(intNum1 < start) {
				System.out.printf("정수값은 %d부터 입력합니다", start);
				continue;
			}// end if-else if
			return intNum1;
		}// end while
	}// end inputValue(title, start)
	
	public Integer inputValue(String title, int start, int end) {
		
		while(true) {
			Integer intNum2 = this.inputValue(title);
			if(intNum2 == null) {
				return null;
			} else if(intNum2 < start || intNum2 > end) {
				System.out.printf("입력값은 %d ~ %d 범위입니다", start, end);
				System.out.println();
				continue;
			}// end if-else if
			return intNum2;
		}// end while
	}// end inputValue(title, start, end)
}
