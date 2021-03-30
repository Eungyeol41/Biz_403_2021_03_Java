package com.callor.classes.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import com.callor.classes.model.ScoreVO;



public class ScoreServiceV2 extends ScoreServiceV1 {


	public ScoreServiceV2() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
	}

	public Integer inputScore() {

		// System.out.println("학번을 001형식으로 입력하세요");
		// System.out.println(" >> ");
		// String strNum = scan.next();

		/*
		 * scoreList의 데이터 개수를 계산하여 입력할 학번을 자동으로 생성하기
		 */
		int nSize = scoreList.size();
		String strNum = String.format("%03d", nSize + 1);

		int intKor = 0;
		while (true) {
			System.out.println(strNum + " 번의 국어점수를 입력하세요(중단 : -1)");
			System.out.println(" >> ");
			intKor = scan.nextInt();
			if (intKor == -1) {
				return -1;
			} else if (intKor < 0 || intKor > 100) {
				System.out.println("국어점수는 0 ~ 100까지!!");
				continue;
			}
			break;
		}

		System.out.println(strNum + " 번의 영어점수를 입력하세요");
		System.out.println(" >> ");
		int intEng = scan.nextInt();

		System.out.println(strNum + " 번의 수학점수를 입력하세요");
		System.out.println(" >> ");
		int intMath = scan.nextInt();

		ScoreVO scoreVO = new ScoreVO();
		scoreVO.num = strNum;
		scoreVO.kor = intKor;
		scoreVO.eng = intEng;
		scoreVO.math = intMath;
		scoreList.add(scoreVO);

		return 0;

	} // inputScore()

	

}
