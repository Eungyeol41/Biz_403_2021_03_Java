package com.callor.review;

public class Controller_01 {

	public static void main(String[] args) {

		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum1 += i;
				if (i % 5 == 0) {
					sum3 += i;
				}
			} else if (i % 4 == 0) {
				sum2 += i;
			}
		}

		System.out.println("3의 배수의 합 : " + sum1);
		System.out.println("4의 배수의 합 : " + sum2);
		System.out.println("3의 배수이면서 5의 배수의 합 : " + sum3);
	}
}
