package com.callor.apps;

import com.callor.apps.service.PrimeServiceV1;

public class App_02 {
	public App_02() {
	}
	public static void main(String[] args) {
		int[] intNum = new int[20];
		
		// PrimeServiceV1 클래스를 사용하여 psV1 객체를 선언하고 생성하여 인스턴스변수로 만들었다
		// new PrimeServiceV1()
		//		PrimeServiceV1클래스에 있는 생성자 method를 호출(실행)하여 
		// 		psV1 객체를 사용할 수 있도록 생성, 초기화, 준비하여달라
		PrimeServiceV1 psV1 = new PrimeServiceV1();
		
		psV1.makeNums();
		psV1.printPrime();
		
		PrimeServiceV1 PSv11 = new PrimeServiceV1();
		psV1.makeNums();
		psV1.printPrime();
		
		int num1 = 30;
		int num2 = 40;
		
		num1 = 50;
		num1 = 60;
		num1 = 0;
		System.out.println(num2);
		
	}
}
