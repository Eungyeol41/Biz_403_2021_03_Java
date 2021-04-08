package com.callor.app.service;

import com.Eungyeol41.standard.InputService;
import com.Eungyeol41.standard.impl.InputServiceImplV1;

public class ScoreServiceV1 {

	public static void main(String[] args) {
		
		InputService isV1 = new InputServiceImplV1();
		
		Integer kor = isV1.inputValue("국어", 0, 100);
		Integer eng = isV1.inputValue("영어", 0, 100);
		Integer math = isV1.inputValue("수학", 0, 100);
		
		int sum = kor + eng + math;
		float avg = (float)sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}
}