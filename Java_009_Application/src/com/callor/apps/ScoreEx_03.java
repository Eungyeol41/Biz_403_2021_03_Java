package com.callor.apps;

import com.callor.apps.model.ScoreV0;

public class ScoreEx_03 {

	public static void main(String[] args) {
		
		ScoreV0 홍길동 = new ScoreV0();
		
		홍길동.kor = 90;
		홍길동.eng = 80;
		홍길동.math = 99;
		
		int total = 홍길동.getTotal();
		System.out.println("홍길동 총점 : " + total);
		
		// 정보의 은닉
		// 멤버변수를 private로 선언하는 것
		// 멤버변수의 값이 원치않게 변경되는 것을 방지하기 위함
		
		// private로 선언된 total 멤버변수는 연결연산자를 통해 total 멤버변수에 값을 직접 저장할 수 없다.
		// 홍길동.total = 900;
		
		// getter method
		// get으로 시작되는 method는 private으로 선언된 멤버변수의 값을 읽을 때 사용하는 method선언 접두사이다
		System.out.println("홍길동 평균 : " + 홍길동.getAvg());
		
		System.out.println(홍길동.getClass());
		
	}
}
