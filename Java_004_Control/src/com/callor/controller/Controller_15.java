package com.callor.controller;

import java.util.Random;

public class Controller_15 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int int1 = rnd.nextInt(100) +1;
		int int2 = rnd.nextInt(100) +1;
		int int3 = rnd.nextInt(100) +1;
		int int4 = rnd.nextInt(100) +1;
		int int5 = rnd.nextInt(100) +1;
		int int6 = rnd.nextInt(100) +1;
		int int7 = rnd.nextInt(100) +1;
		int int8 = rnd.nextInt(100) +1;
		int int9 = rnd.nextInt(100) +1;
		int int10 = rnd.nextInt(100) +1;
		
		/*
		 * num 변수하고 intKor 이름하고 합하여
		 * 		intKor1 ~ intKor5처럼 만들 수 있을 것 같지만 안 됨..!
		 * intKornum이라고 작성하면 java는 intKornum이라는 변수를 찾으려고 함
		 */
		// 
		
		int intSum = int1 + int2 + int3 + int3 + int5 + int6 + int7 + int8 +int9 + int10;
		float floatAvg = (float)intSum / 10;
		
		System.out.println("=============================================");
		System.out.println("학생1 : " + int1);
		System.out.println("학생2 : " + int2);
		System.out.println("학생3 : " + int3);
		System.out.println("학생4 : " + int4);
		System.out.println("학생5 : " + int5);
		System.out.println("학생6 : " + int6);
		System.out.println("학생7 : " + int7);
		System.out.println("학생8 : " + int8);
		System.out.println("학생9 : " + int9);
		System.out.println("학생10 : " + int10);
		System.out.println("----------------------------------------------");
		System.out.printf("총점 : %d,\t평균 : %3.2f\n", intSum, floatAvg);
		System.out.println("=============================================");
	}
}
