package com.callor.controller;

public class Cont_10A {

	public static void main(String[] args) {
		
		int intNum = 7;
		if(intNum % 2 == 0){
			System.out.println("2의 배수");
		} else if(intNum % 3 == 0) {
			System.out.println("3의 배수");
		} else if(intNum % 5 == 0) {
			System.out.println("5의 배수");
		} else {
			System.out.println("2, 3, 5의 배수가 아니다");
		}
		
	}
}
