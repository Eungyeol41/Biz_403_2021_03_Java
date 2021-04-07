package com.callor.method.service;

public class ScoreServiceV4 {

	String subject[] = { "국어", "영어", "수학" };
	Integer score[] = new Integer[3];
	
	int sum;
	float avg;

	public void inputScore() {
		InputServiceV2 inService = new InputServiceV2();
		
		for(int i = 0; i < 3; i++) {
			score[i] = inService.inputValue(subject[i], 0, 100);
			
			sum = score[0] + score[1] + score[2];
			avg = (float)sum / 3;
			
			if(score[i] == null) {
				System.out.println("종료");
				return;
			}	
				
		}
		
			
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}
}
