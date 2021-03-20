package com.callor.controller;

public class Cont_07A {

	public static void main(String[] args) {
		
		int intNum = 15;
		for(int index = 2; index < intNum -1; index++) {
			System.out.println(intNum % index == 0 ? "No 소수" : "소수");
		}
		
		
	}
}
