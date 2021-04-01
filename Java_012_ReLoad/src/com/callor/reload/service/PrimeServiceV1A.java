package com.callor.reload.service;

import java.util.Random;

public class PrimeServiceV1A {

	protected Random rnd;
	public PrimeServiceV1A() {
		rnd = new Random();
	}
	
	public void printNum() {
		int rndNum = rnd.nextInt(51) +50;
		/*
		 * for() 반복문이 실행되거나 끝나는 경우
		 * 비교문 "i < rndNum" true인 동안 반복하라
		 * 	만약 rndNum이 10이다.
		 * 		i값은 2부터 9까지 반복하라
		 * for() 반복문이 종료되면 i값은 얼마일까?
		 * 	i값이 rndNum보다 작으면 { } 내의 코드 실행
		 * 	{ } 실행 후 i++ 실행
		 * 	i == 9가 되었을 때 { } 실행 후 다시 한 번 i++ 실행
		 * 	때문에 for() 반복문이 중단되지 않고 모두 정상 수행이 되면 i값은 rndNum값과 같아진다
		 * 	i == rndNum인데 i < rndNum냐고 묻는 것 // false;
		 * 	가 되면서 for() 중단
		 * 	만약 for() 반복문이 중간에 break를 만났다
		 * 		"i값은 항상 rndNum보다 작다"
		 */
		// rndNum가 6이라고 가정
		// 6 % 2, 6 % 3, 6 % 4, 6 % 5 연산 수행
		// rndNum이 100이라고 가정
		boolean notPrime = false;
		for(int i = 2; i < rndNum; i++) {
			if(rndNum % i == 0) {
				// 소수가 아닌 경우
				// rndNum을 i값들로 나머지 연산을 했을 때 한 번이라도 나머지가 0이면 그 수는 소수가 아닌 경우이다
				// 그렇다면 그 이후에는 더 이상 연산을 할 필요가 없다
				notPrime = true;
				break;
				
			} // for() end
			// 여기에서 for() 반복문이 break 되었냐?
			// 		소수가 아니다
			// 아니면 모두 완료되었냐?
			//		소수이다
			if(notPrime == true) {
				System.out.println("소수가 아님");
			} else {
				System.out.println("소수");
			}
		}
	}
	
}
