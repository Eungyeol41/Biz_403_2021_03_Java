package com.callor.method.service;

public class ScoreServiceV4 {

	String subject[] = {"국어", "영어", "수학"};
	
	public void inputScore() {
		InputServiceV2 inService = new InputServiceV2();
		
		Integer intKor = inService.inputValue(subject[0], 0, 100);
		if(intKor == null) {
			System.out.println("종료");
			return;
		}
		
		Integer intEng = inService.inputValue(subject[1], 0, 100);
		if(intKor == null) {
			System.out.println("종료");
			return;
		}
		
		Integer intMath = inService.inputValue(subject[2], 0, 100);
		if(intKor == null) {
			System.out.println("종료");
			return;
		}
		
		int sum = intKor + intEng + intMath;
		float avg = (float)sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}
}
