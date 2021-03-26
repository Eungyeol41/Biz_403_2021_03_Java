package com.callor.apps;

import com.callor.apps.Service.ScoreServiceV1;

public class App_02 {

	public static void main(String[] args) {
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		
		ssV1.makeNums();
		ssV1.printEven();
		ssV1.sumPrint();
	}
}
