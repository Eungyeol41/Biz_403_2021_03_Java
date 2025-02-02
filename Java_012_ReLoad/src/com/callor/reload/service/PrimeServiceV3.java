package com.callor.reload.service;

public class PrimeServiceV3 extends PrimeServiceV1A{

	public void primeNum() {
		
		int rndNum = rnd.nextInt(51) + 50;
		// for() 반복문이 중단되었느냐(break)
		// 		아니면 모두 수행했느냐
		int index = 0;
		for(index = 2; index < rndNum; index++) {
			if(rndNum % index == 0) {
				break;
			}
		}
		//for() 끝났을 때
		//		break되었을 때와 항상 index < rndNum 그렇지 않은 경우를 확인하여 코드진행
		//		index == rndNum가 된다
		if(index < rndNum) {
			System.out.println(rndNum + "는 소수가 아니다");
		} else {
			System.out.println(rndNum + "는 소수");
		}
	}
}
