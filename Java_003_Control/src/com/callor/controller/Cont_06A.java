package com.callor.controller;

public class Cont_06A {
	
	public static void main(String[] args) {
		
		int intKor = 0;
		int intEng = 0;
		
		intKor = 90;
		intEng = 100;
		
		System.out.println("국어 : " + intKor);
		System.out.println("영어 : " + intEng);
		
		System.out.println("==================");
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d. 우리나라 대한민국\n", i);			
		}
		
		System.out.println("---------------------");
		String strName = "우리나라 대한민국";
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d. %s\n", i + 1, strName);
		}
		
	}

}
