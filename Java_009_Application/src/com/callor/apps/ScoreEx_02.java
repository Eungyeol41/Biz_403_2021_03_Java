package com.callor.apps;

import com.callor.apps.model.ScoreV0;

public class ScoreEx_02 {

	
		
		/*
		 * ScoreV0 클래스를 디자인하고 클래스를 사용하여 객체를 생성한 후 사용하기
		 */
	public static void main(String[] args) {
		
		// 객체이름을 "홍길동"으로 하여 "객체 생성"
		ScoreV0 홍길동 = new ScoreV0();
		
		// 객체.멤버변수 : 점(DOT . ) 연결연산자
		//				객체 연결연산자
		//				클래스(객체) 선언된 변수나, method에 접근하기 위한 연산자
		홍길동.name = "홍길동";
		홍길동.kor = 90;
		홍길동.eng = 88;
		홍길동.math = 77;
		
		// 객체.method()
		//		객체 연결연산자를 통해서 getTotal() method를 호출(실행)하고 return된 결과를 total 변수에 담아라
		int total = 홍길동.getTotal();
		float avg = 홍길동.getAvg();
		
		ScoreV0 이몽룡 = new ScoreV0();
		이몽룡.kor = 88;
		이몽룡.eng = 77;
		이몽룡.math = 99;
		
		total = 이몽룡.getTotal();
		avg = 이몽룡.getAvg();
		
		// 객체 연결연산자를 통하여 멤버변수나 method에 접근을 하면 오타 등으로 발생하는 오류를 최소화 할 수 있다.
		// 코딩의 자동완성 기능을 충분히 활용할 수 있다.
		이몽룡.kor = 100;
		
		
		
	}
}
