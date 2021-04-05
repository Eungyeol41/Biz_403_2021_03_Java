package com.callor.method.service;

import java.util.Random;

public class NumberServiceV1 {

	Integer num = null;
	
	public void inputNum() {
		
		Random rnd = new Random();
		
		num = rnd.nextInt(100) + 1;
		
		System.out.println("정수 : " + num);
		
		if(num % 3 == 0) {
			System.out.println(num);
		} else {
			return;
		}
		
	}
}
