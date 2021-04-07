package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.model.ScoreVO;

public class ScoreServiceV6 {

	List<ScoreVO> scoreList;
	String[] subject;

	InputServiceV2 inService = new InputServiceV2(); // InputServiceV2의 inputValue() method 사용

	public ScoreServiceV6() {
		scoreList = new ArrayList<ScoreVO>();
	}

	public void inputScore() {

		subject = new String[] { "국어", "영어", "수학" };
		for (int st = 0; st < 5; st++) {
			Integer[] scores = new Integer[subject.length];
			
			for (int i = 0; i < subject.length; i++) {
				scores[i] = inService.inputValue(subject[i], 0, 100); 
			}// end for(i)

			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setKor(scores[0]);
			scoreVO.setEng(scores[1]);
			scoreVO.setMath(scores[2]);
			scoreList.add(scoreVO);
			
		}// end for(st)

	}// end inputScore

}
