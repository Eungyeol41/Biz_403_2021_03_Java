package com.callor.controller;

public class Cont_01A {
	
	public static void main(String[] args) {
		
		
		// 같은 코드를 복붙하지 않고 명령문을 이용하여 반복하도록 수행
		// main() 메서드의 코드는 Topdown으로 진행이 된다.
		// 코드가 정상 진행되는 과정에 for() 명령문을 만나면 조건을 검사하고 조건에 따라 반복하는 코드가 실행된다
		// 이처럼 Topdown으로 진행되는 코드의 흐름을 바꾸는 명령을 "제어명령", "Control 명령"이라 한다
		int intNum = 0;
		
		// 1. intNum 변수를 0으로 초기화하여 생성한 후 intNum 변수를 활용하여 다음과 같은 결과를 출력합니다.
		
		System.out.println("========================");
		for( ; intNum < 10 ; ) {
			System.out.printf("%d . 우리나라 대한민국\n", ++intNum);
			//System.out.println(++intNum + " .우리나라 만세"); 가능
		}
		System.out.println("========================");
		
		intNum = 0;
		for( ; intNum < 10 ; intNum++ ) {
			System.out.println(intNum + ". 우리나라 만세");
		}
		
		/*
		 *  for()명령을 만나면 intNum = 0을 실행한다
		 *  	이 명령은 반복횟수와 관계없이 최초에 딱 한 번만 실행된다
		 *  
		 *  intNum < 10 을 실행하여 조건을 검사
		 *  	결과 true이면 {}의 명령을 실행
		 *  
		 *  명령 실행이 끝나면 다시 for() 명령문 시작으로 되돌아 온다
		 *   증가 : intNum++ 명령을 실행
		 *   조건검사 : intNum < 10
		 *  
		 *  증가, 조건 검사를 반복하면서 조건검사 결과가 false가 될 때까지 반복하여 {} 명령을 실행
		 */
		for( intNum= 0; intNum < 10 ; intNum++) {
			System.out.println(intNum);
		}

	
	}

}