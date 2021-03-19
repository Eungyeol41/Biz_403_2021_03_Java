package com.callor.controller;

public class Varriable_01 {
	
	public static void main(String[] args) {
		
		int intNum = 4;
		System.out.println(intNum % 2);
		System.out.println(intNum % 2 == 0);
		System.out.println(intNum % 2 == 0 ? "0" : "0 아님");
		
		int intResult = intNum % 2;
		boolean bYes = (intNum % 2) == 0;
		boolean bYes1 = 3 == 3;
		
		/*
		 * 블린값(형)
		 * true, false : 키워드이자 하나의 값
		 * 값 : 연산된 결과
		 */
		
		boolean bYes2 = true;
		bYes2 = false;
		
		// 비교연산자
		// 어떤 값들이 같은지, 크기가 어떠한지를 판단하는 연산
		// 결과는 true, false가 있다
		bYes = 3 > 3; // false
		bYes = 3 >= 3; // true
		bYes = 3 < 3; // false
		bYes = 3 <= 3; // true
		bYes = 3 == 3; // true
		
		bYes = false;
		
		//어떤 조건이 true일 때만 코드를 실행하고 싶을 때  bYes에 담긴 값이 true일 때
		if(bYes) {
			System.out.println("bYes는 true");
		}
		
	}

}
