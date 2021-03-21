package com.callor.controller;

public class Score_06A {

	public static void main(String[] args) {
		
		int intKor = 90;
		int intEng = 88;
		int intMath = 66;
		
		int intSum = intKor + intEng + intMath;
		int intAvg = intSum / 3;
		float floatAvg = (float)intAvg;
		
		if(floatAvg >= 95) {
			System.out.println("장원");
		} else if(floatAvg > 90) {
			System.out.println("차석");
		} else if(floatAvg >= 80) {
			System.out.println("우등");
		} else if(floatAvg >= 60) {
			System.out.println("아차상");
		} else{
			System.out.println("과락");
		}
		
	}
}
