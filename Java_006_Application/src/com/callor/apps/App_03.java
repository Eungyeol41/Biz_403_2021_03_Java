package com.callor.apps;

import java.util.Random;

public class App_03 {

	public static void main(String[] args) {
		
		int numsLength = 20;
		int[] intNums = new int[20];
		Random rnd = new Random();
		
		for(int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
			
			if(intNums[i] % 2 == 0) {
				System.out.printf("%d번째 위치 : %d\n",i , intNums[i]);
			}
		}
		
	}
}
