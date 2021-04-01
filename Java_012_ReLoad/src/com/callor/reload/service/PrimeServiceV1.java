package com.callor.reload.service;

import java.util.Random;

public class PrimeServiceV1 {

	Random rnd;

	public PrimeServiceV1() {

		rnd = new Random();
	}

	public void PrimeNum() {

		int num;
		int nCount = 0;
		
		num = rnd.nextInt(51) + 50;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				nCount++;
			}
		}

		if (nCount > 0) {
			System.out.println(num + "은(는) 소수가 아니다");
		} else {
			System.out.println(num + "은(는) 소수이다");
		}

	}

}
