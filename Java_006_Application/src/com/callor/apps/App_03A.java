package com.callor.apps;

import java.util.Random;

public class App_03A {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int numsLength = 20;
		int[] intNums = new int[numsLength];
		
		// 요소 : 배열의 몇 번째 값
		// 위치 : 배열의 몇 번째
		// 첨자 : 배열의 몇 번째인가를 알려주는 값
		for(int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}
		
		for(int i = 0; i < intNums.length; i++) {
			if(intNums[i] % 2 == 0) {
				// 짝수인 값을 출력
				// System.out.println(intNums[i]);
				
				// 몇 번째 위치(요소, 첨자)에 저장되어 있나
				// System.out.println(i);
				
				System.out.printf("%d번째 값 : %d\n",i ,intNums[i]);
			}
		}
	}
}
