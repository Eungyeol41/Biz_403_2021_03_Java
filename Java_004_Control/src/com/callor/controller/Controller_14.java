package com.callor.controller;

import java.util.Random;

public class Controller_14 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int intKor = 0;
		int intEng= 0;
		int intMath = 0;
			
		intKor = rnd.nextInt(100) +1;
		intEng = rnd.nextInt(100) +1;
		intMath = rnd.nextInt(100) +1;
		
		int intSum = 0;	// 0으로 선언하지 않고 바로 밑에처럼 하는 것도 가능
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		float floatAvg = (float)intSum / 3;
		
		System.out.println("=================================");
		System.out.printf("국어 : %d\n", intKor);
		System.out.printf("영어 : %d\n", intEng);
		System.out.printf("수학 : %d\n", intMath);
		System.out.println("----------------------------------");
		System.out.printf("총점 : %d,\t평균 : %3.2f\n", intSum, floatAvg);
		System.out.println("==================================");

	
	}
}
