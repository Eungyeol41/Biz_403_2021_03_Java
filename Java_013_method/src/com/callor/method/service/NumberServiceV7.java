package com.callor.method.service;

public class NumberServiceV7 {

	protected InputService inService;

	String sub[] = { "국어", " 영어", "수학", "과학", "역사" };
	Integer retNum = null;

	public NumberServiceV7() {
		inService = new InputService();

	}

	public Integer inputScore() {
		for (int i = 0; i < 5; i++) {
			while (true) {
				retNum = inService.inputValue(sub[i] + "(0 ~ 100)");
				if (retNum == null) {
					return null; // QUIT 입력
					
				} else if (retNum < 0 || retNum > 100) {
					System.out.println("정수는 0 ~ 100까지 입력");
					continue;
				} else {
					System.out.println(sub[i] + " 점수 : " + retNum);
					break;
				}
			} // end while
			
		} // end for
		return null;
	}// end inputScore

}

