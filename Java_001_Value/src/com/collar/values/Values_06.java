package com.collar.values;

public class Values_06 {
	
	public static void main(String[] args) {
		
		System.out.println(33 % 2);
		
		// 33을 2로 나눈 나머지가 1인가? == true
		System.out.println((33 % 2) == 1);
		
		// 33을 2로 나눈 나머지가 0인가? == false
		System.out.println((33 % 2) == 0);
		
		// 어떤 수를 2로 나누어서 나머지가 0이면 그 어떤 수는 짝수이고
		// 그렇지 않으면 그 수는 홀수이다
		
		System.out.println((33 % 2) == 0 
				? "짝수" : "홀수");
		
		System.out.println(33 % 2); // 결과 표시
		System.out.println((33 % 2) == 0); // 결과가 0?
		
		// 연산 ? true일 때 : false일 때
		System.out.println((33 % 2) == 0 ? "짝수" : "홀수");
		
		System.out.println( 33 > 10 
				? "33이 10보다 크다"
				: "33이 10보다 작다");
		
		// 삼항연산자
		// 비교 ? true :false와 같이 항목 3가지가 구분되어 있는 연산
		System.out.println(3 == 3 ?"맞다" : "아니다");
		System.out.println(3 == 3
							? "맞다" : "아니다");
			
	}

}
