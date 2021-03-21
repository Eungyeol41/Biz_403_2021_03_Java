package com.callor.controller;

public class Cont_08A {

	public static void main(String[] args) {
		
//		int intNum = 77;
//		for(int i = 2; i > intNum -1; i++) {
//			System.out.println(intNum % i == 0);
//			break;
//		}
		int intNum = 79;
		for(int i = 2; i < intNum ; i++) {
			boolean bYes = intNum % i == 0;
			if(bYes) {
				System.out.println(intNum + " : 소수가 아님");
			} else {
				System.out.println(intNum + " : 소수");
			}
			break;
		}
		
		
	}
}
