package com.callor.controller;

public class Cont_08A {

	public static void main(String[] args) {
		
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
