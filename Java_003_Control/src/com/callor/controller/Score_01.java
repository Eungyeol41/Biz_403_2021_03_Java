package com.callor.controller;

public class Score_01 {
	
	public static void main(String[] args) {
		
		String strKor = "국어";
		String strEng = "영어";
		String strMath = "수학";
		
		int intKor = 80;
		int intEng = 77;
		int intMath = 65;
		
		int intSum = intKor + intEng + intMath;
		/*
		 *  intSum = intKor;
		 *  intSum += intEng;
		 *  intSum +=intMath;
		 */
		int intAvg = intSum / 3;
		
		System.out.println("========================");
		System.out.println(strKor + ":" + intKor);
		System.out.println(strEng + ":" + intEng);
		System.out.println(strMath + ":" + intMath);
		/*
		 * System.out.println("국어 : %d\n", intKor);
		 */
		
		System.out.println("------------------------");
		
		System.out.printf("총점 : %d\t", intSum);
		System.out.printf("평균 : %d\n", intAvg);
		//System.out.println("총점 : %d\t평균 : %d", intSum, intAvg);
		
		System.out.println("========================");
		

	}

}
