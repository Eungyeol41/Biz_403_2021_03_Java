package com.callor.var;

public class Varriable_17 {
	
	public static void main(String[] args) {
		
		/*
		 * 변수를 어떤 값으로 시작할까
		 * 변수(에 저장된) 값이 어떻게 변화할까
		 */
		int num1 = 0;
		
		num1 = 100;
		System.out.println(num1);
				
		num1 = 200;
		System.out.println(num1);
		
		num1 = 300;
		System.out.println(num1);
		
		num1 = 100 * 200;
		System.out.println(num1);
		
		num1++; // 1 증가
		++num1; // 1 증가
		System.out.println(num1);
		
		num1 += 50; // 20002 + 50 한 값이 num1에 저장
		System.out.println(num1); // 20052
		
		int num2 = 3;
		
		// 1. num2 += 10 : num2 == 13 저장될 것이다
		// 2. num1에 13 저장
		num1 = (num2 += 10);
		System.out.println(num1); // 13
		
		
		
		
		
		
		
	}

}
