package com.callor.reload.service;

public class PrimeServiceV2 extends PrimeServiceV1A{
	
	// 자동으로 protected로 선언된 객체, 변수는 상속받은 곳에서 사용할 수 있다
	
	public void primeNum() {
		
		int rndNum = rnd.nextInt(51) + 50;
		
		// flag 변수 : 상태를 설정하여 사용할 변수
		boolean notPrime = false;
		for(int i = 2; i < rndNum; i++) {
			if(rndNum % i == 0) {
				notPrime = true;
				break;
			}
		}
		// flag 색깔에 따라 소수, 소수가 아님을 출력
		if(notPrime) {
			System.out.println(rndNum + "는 소수가 아님");
		} else {
			System.out.println(rndNum + "는 소수임");
		}
		
	}
	
}
