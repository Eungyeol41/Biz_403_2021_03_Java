package com.callor.app;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV1A;

public class ScoreEx_04 {

	public static void main(String[] args) {
		
		ScoreService sService = new ScoreServiceImplV1A();
		
		sService.selectMenu();
	}
}
