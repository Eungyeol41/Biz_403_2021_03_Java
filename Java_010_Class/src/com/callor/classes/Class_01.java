package com.callor.classes;

import java.util.Arrays;
import java.util.Random;

public class Class_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int nCount = 0;

		int num = rnd.nextInt(51) + 50;

		System.out.println("생성된 난수 : " + num);
		System.out.println("=========================");
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				nCount++;
			}
		}
		System.out.println("약수의 개수 : " + nCount);
		
	}
}
