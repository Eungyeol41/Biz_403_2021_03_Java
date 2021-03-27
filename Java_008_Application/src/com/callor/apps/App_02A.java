package com.callor.apps;

import com.callor.apps.Service.ScoreServiceV1A;

public class App_02A {

	public static void main(String[] args) {
		
		ScoreServiceV1A ssV1 = new ScoreServiceV1A();
		
		ssV1.makeNums();
		ssV1.printHeader();
		ssV1.printList();
		
	}
}
