package com.callor.classes;

import java.util.Random;

public class Value_01 {

	public static void main(String[] args) {
		
		/*
		 * java Keyword이면서 값인 경우가 있다
		 * true, false는 boolean 형의 값
		 * 참, 거짓을 나타내는 java 언어의 고유한 값
		 */
		boolean bYes = true;
		bYes = false;
		
		//30 : 정수값, 리터럴
		int num = 30;
		
		/*
		 * 널값 : 아무것도 아닌 값
		 */
		Integer num1 = 0;
		
		// -1 입력했을 때 코드를 종료하고 싶다
		if(num1 == -1) {
			//코드 종료
			
		}
		num1 =  method();
		if(num1 == null) {
			System.out.println("3의 배수도 아니고" + "4의 배수도 아니다");
		}
		
		num1 = 0;
		
	}
	
	// 0 ~ 99까지 중의 난수 1개를 생성하여 return하는 method
	private static Integer method() {
		Random rnd = new Random();
		Integer num = rnd.nextInt(100);
		if(num % 3 == 0) {
			return 1;
		} else if (num % 4 == 0) {
			return -1;
		} else {
			return null;
		}
		
	}
}
