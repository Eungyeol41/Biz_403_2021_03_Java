package com.callor.fine.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.callor.fine.ScoreServiceImplV1;
import com.callor.fine.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	public ScoreServiceImplV2() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	
	// ScoreServiceImplV1의 scoreList와 scan을 protected로 선언

}
