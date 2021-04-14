package com.callor.score;

import com.callor.score.service.WordService;
import com.callor.score.service.impl.WordServiceImplV2;

public class WordEx_02 {

	public static void main(String[] args) {
		
		WordService wService = new WordServiceImplV2();
		wService.viewWord();
	}
}
