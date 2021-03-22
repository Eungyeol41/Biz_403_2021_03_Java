package com.callor.controller;

public class Controller_01 {
// 1 ~ 100까지의 숫자 중에서 3의 배수인 수들의 합, 4의 배수인 수들의 합, 3과 5의 배수인 수들의 합을 계산하고 결과를 출력
	public static void main(String[] args) {
		
		int i = 0;
		int intSum = 0;
		int intSum1 = 0;
		int intSum2 = 0;
		
		// for(i = 0; i < 100; i++
		for(i = 1; i <= 100; i++) {
			
			if (i % 3 == 0) {
				intSum += i;
				
				if (i % 5 == 0) {
					intSum2 += i;
				}
			} 
			
			if (i % 4 == 0) {
				intSum1 += i;
			} 
				
		
		}
		System.out.println("====================================");
		System.out.println("3의 배수의 합 : " +intSum);
		System.out.println("4의 배수의 합 : " + intSum1);
		System.out.println("3과 5의 배수의 합 : " + intSum2);
		System.out.println("====================================");
		
	}
}
