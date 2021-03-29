package com.callor.apps;

import com.callor.apps.service.ScoreServiceV1A;

public class Score_01A {

	public static void main(String[] args) {
		
		// ScoreServiceV1A 클래스를 사용하여 객체를 생성할 때
		// 정수 5를 전달해주고 5만큼의 배열을 생성하도록 코드를 변경
		ScoreServiceV1A ssV1 = new ScoreServiceV1A(5);
		
		/*
		 * 
		 */
		ssV1.makeScores();
		
		ssV1.addNum();
		
		/*
		 * inputScore() method는 private로 선언되어 있기 때문에 객체.inputScore() 형식으로 사용할 수 없다.
		 */
	}
}
