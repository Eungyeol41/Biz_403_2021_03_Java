package com.callor.controller;

public class Controller_01B {

	public static void main(String[] args) {
		int intSum1 = 0;
		int intSum2 = 0;
		int intSum3 = 0;
		for(int i = 0; i <= 100; i++) {
			if(i % 3 == 0) {
				intSum1 += i;
			}
			if(i % 4 == 0) {
				intSum2 += i;
			}
			if(i % 3 == 0 && i % 5 == 0) {
				intSum3 += i;
			}
		}
		System.out.println("======================");
		System.out.printf("3의 배수의 합 : %d\n", intSum1);
		System.out.printf("4의 배수의 합 : %d\n", intSum2);
		System.out.printf("3의 배수이면서 5의 배수의 합 : %d\n", intSum3);
		System.out.println("======================");
	}
}
