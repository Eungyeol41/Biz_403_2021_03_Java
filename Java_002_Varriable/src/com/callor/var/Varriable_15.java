package com.callor.var;

public class Varriable_15 {

	public static void main(String[] args) {
		
		// 1. intSum, intNum 변수를 선언 초기화하고
		// 2. 0 ~ 10까지 숫자 중 짝수의 합을 구하여 출력
		int intNum = 0;
		int intSum = 0;
		
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		System.out.println(intSum);
		
		
	}

}
