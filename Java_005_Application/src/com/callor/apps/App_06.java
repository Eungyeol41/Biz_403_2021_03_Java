package com.callor.apps;

public class App_06 {

	public static void main(String[] args) {
		
		int intNum = 3_385_859;
		/*
		 * intNum의 자릿수가 얼마인가?
		 */
		int nCount = 0;
		while(intNum > 0) {
			
			nCount++;
			// intNum = intNum % 10
			// intNum 값과 10을 나머지 연산을 수행
			// intNum / 10 => 3385859 / 10 => 338585
			intNum /= 10; //9
			System.out.println(intNum);
		}
		
		System.out.println( nCount + "자릿수");
		
		
		/* 
		 * while(true) { }
		 * while() {} 반복문을 끝내기 위한 비교연산 명령문
		 * 		intNum <= 0이면 반복문을 끝내라
		 * 이 명령 대신 조건문을 반대로 설정하여 while(조건)dmfh tlfgodgksek
		 * if(intNum <= 0) {
		 * 		break;
		 * }
		 */
	}
}
