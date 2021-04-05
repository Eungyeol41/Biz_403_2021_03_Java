package com.callor.classes;

import java.util.Random;

public class Class_01B {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int intNum = 0;
		intNum = rnd.nextInt(51) + 50;
		for(int i = 2; i < intNum; i++) {
			if(intNum % i == 0) {
				System.out.println(i);
			}
		}
	}
}
