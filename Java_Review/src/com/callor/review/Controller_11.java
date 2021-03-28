
package com.callor.review;

import java.util.Random;

public class Controller_11 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		for(int i = 0; i < 5; i++) {
			int num = rnd.nextInt(100) + 1;
			if(num % 3 == 0) {
				System.out.printf("%d는(은) 3의 배수\n", num);
			} else {
				System.out.printf("%d는(은) 3의 배수가 아니다\n", num);
			}
		}
		
	}
}