package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceV5 {

	protected String[] subject;

	// 과목별 list 선언
	List<Integer> kors;
	List<Integer> engs;
	List<Integer> maths;

	int stdNum = 5; // 학생 5명
	int line = 50;
	
	public ScoreServiceV5() {

		subject = new String[] { "국어", "영어", "수학" }; // 과목명 배열에 선언

		kors = new ArrayList<Integer>(); 
		engs = new ArrayList<Integer>(); 
		maths = new ArrayList<Integer>();

	}

	public void inputScore() {
		
		InputServiceV2 inService = new InputServiceV2(); // InputService의 코드를 가져온다

		for (int i = 0; i < stdNum; i++) {
			System.out.printf("%d번 학생\n", i + 1); // 학생 번호
			
			for (int j = 0; j < subject.length; j++) { 
				
				Integer score = inService.inputValue(subject[j], 0, 100); // score에 각 과목의 점수 입력
				
				if (score == null) {
					System.out.println("종료");
					return;
				} // end if - QUIT를 입력 시 종료
				
				if(j == 0) {
					kors.add(score); // 국어 점수 list 추가
				} else if(j == 1) {
					engs.add(score); // 영어 점수 list 추가
				} else {
					maths.add(score); // 수학 점수 list 추가
				}
			} // end 안 쪽 for()
		}// end 바깥 쪽 for()
		
		this.printScore(); // 성적 리스트
	}
	
	public void printScore() {
		System.out.println("=".repeat(line));
		System.out.printf("순번\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("-".repeat(line));
		
		int sum = 0;
		float avg = 0.0f;
		
		for(int i = 0; i < stdNum; i++) {
			sum = kors.get(i) + engs.get(i) + maths.get(i); // list에 저장된 각 과목을 가져와 학생의 총점
			avg = (float)sum / 3;
			
			System.out.printf("%d\t", i + 1);
			System.out.printf("%d\t", kors.get(i));
			System.out.printf("%d\t", engs.get(i));
			System.out.printf("%d\t", maths.get(i));
			System.out.printf("%d\t", sum);
			System.out.printf("%3.2f\n", avg);
		}
		
	}

}
