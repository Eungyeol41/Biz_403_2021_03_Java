package com.callor.apps;

/*
 * 배열에 저장된 값 중에서 짝수가 저장된 최초의 위치는 어디인가
 */
import java.util.Random;

public class App_04A {

	public static void main(String[] args) {
		Random rnd = new Random();
		//int intNums[] = new int[20];
		int[] intNums = new int[20];
		
		for(int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
			
			if(intNums[i] % 3 == 0) {
				System.out.printf("3의 배수가 저장된 최초의 위치 : ");
				System.out.println(i + "번");
				break;
			}
			
		}
		
		
	}
}
