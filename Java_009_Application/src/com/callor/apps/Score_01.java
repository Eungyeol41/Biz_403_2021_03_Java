package com.callor.apps;

import com.callor.apps.service.ScoreServiceV1B;

public class Score_01 {

	public static void main(String[] args) {
		
		ScoreServiceV1B ssV1 = new ScoreServiceV1B();
		
		ssV1.inputNum();
		ssV1.printList();
	}
}
