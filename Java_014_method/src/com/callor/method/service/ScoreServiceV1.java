package com.callor.method.service;

public class ScoreServiceV1 {

	InputServiceV1 inService = new InputServiceV1();
	
	public Integer inputScore() {
		
		Integer retNum = inService.inputValue("국어", 0, 100); 
		
		if(retNum == null) {
			System.out.println("종료");
		} else if(retNum > 0 && retNum < 100) {
			System.out.println("점수 : " + retNum);
		}
		
		return null;
	}
}
 