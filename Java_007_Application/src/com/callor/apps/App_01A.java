package com.callor.apps;

import java.util.Random;

public class App_01A {

	public static void main(String[] args) {
		
		int[] intNum = new int[20];
		Random rnd = new Random();
		
		int j = 0;
		boolean notPrime = false;
		
		for(int i = 0; i < 20; i++) {
			intNum[i] = rnd.nextInt(51) + 50;
			
			for(j = 2; j < intNum[i]; j++) {
				if(intNum[i] % j == 0) {
					notPrime = true;
					break;
				}
			}
			if(intNum[i] == j) {
				System.out.println(intNum[i]);
			}
		}
		
		
	}
}