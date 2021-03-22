package com.callor.controller;

public class Controller_03 {

	public static void main(String[] args) {
		
		int intNum1 = 30;
		int intNum2 = 40;
		
		// 20 < intNum1 < 50
		// true AND true
		boolean bYes = intNum1 > 20 && intNum1 < 50;
		// true OR false
		bYes = intNum1 > 20 || intNum1 > 50;
		// true AND false
		bYes = 50 > 20 && 20 > 50;
	}
}
