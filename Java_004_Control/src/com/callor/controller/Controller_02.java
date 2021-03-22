package com.callor.controller;

public class Controller_02 {

	public static void main(String[] args) {
		
		/*
		 * boolean(Boolean)
		 * 		true, false 2가지 경우의 값을 갖는 특별한 형태
		 * 대입연산자(=) 오른쪽의 연산을 수행하여 
		 *  	3 == 3 (== : 동등연산자, 일치연산자) 수행하여 결과를 bYes 변수에 담아라
		 * 
		 * 동등연산자 : 두 값이 같냐?
		 * 	결과는 true, false가 된다.
		 */
		boolean bYes = 3 == 3; // true;
		
		bYes = 15 % 3 == 0; // true;
		
		int intNum = 15;
		
		// intNum에 담긴 값이 3의 배수이냐?
		System.out.println(intNum % 3 == 0);
		
		// intNum에 담긴 값이 5의 배수이냐?
		System.out.println(intNum % 5 == 0);

		// intNum에 담긴 값이 3의 배수이면서 5의 배수이냐?
		// %3 == 0 AND %5 = 0 이냐?
		
		// && : AND관계연산자
		bYes = intNum % 3 == 0 && intNum % 5 == 0;
		
		intNum = 12;
		
		//intNum에 담긴 값이 3의 배수이거나(또는) 5의 배수이냐?
		// || : OR 관계연산자
		// 		=> 둘 중 하나만 참이면 참
		bYes = intNum % 3 == 0 || intNum % 5 == 0;
		
		/*
		 * 관계연산자
		 * 2가지 이상의 비교연산(=, <, >, <=, >=, !=)을 동시에 수행하기 위한 연산
		 */
		// &&는 true : 1, false : 0으로 하는 곱셈 연산을 기억하면 된다.
		bYes = true && true; // T (1 * 1 = 1)
		bYes = true && false; // F (1 * 0 = 0)
		bYes = false && true; // F (1 * 0 = 0)
		bYes = false && false; // F (0 * 0 = 0)
		
		// ||(filter 기호)는 True : 1, false : 0으로 하는 덧셈을 연상한다
		bYes = true || true; // T (1 + 1 = 1 - 있다)
		bYes = true || false; // T (1 + 0 = 1)
		bYes = false || true; // T (1 + 0 = 1)
		bYes = false || false; // F (0 + 0 = 0)
		
	}
}
