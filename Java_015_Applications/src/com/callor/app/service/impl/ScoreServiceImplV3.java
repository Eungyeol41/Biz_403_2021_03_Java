package com.callor.app.service.impl;


/*
 * V2는 V1을 상속받고
 * V3는 V2를 상속받고
 * V3는 V1을 상속받고 V2의 재정의된 inputNum()을 상속받는 효과가 된다
 * 
 * 즉, V3는 V1에 구현된 객체, 변수, method를 모두 그대로 물려받으면서 V2에서 새롭게 작성한 inputNum()를 상속받아서 사용하고 있다
 * 
 */
public class ScoreServiceImplV3 extends ScoreServiceImplV2A{

	@Override
	public void selectMenu() {
		String strM = null;
		
		while(true) {
			System.out.println("빛나라 고교 성적처리 V3");
			System.out.println("=".repeat(50));
			System.out.println("1. 성적 등록");
			System.out.println("2. 성적 리스트 출력");
			System.out.println("3. 성적 파일에 저장");
			System.out.println("QUIT. 업무 종료");
			strM = scan.nextLine();
			if(strM.equals("QUIT")) {
				break;
			}
			
		} // end while
		Integer intM = null;
		try {
			intM = Integer.valueOf(strM);
		} catch (NumberFormatException e) {
			System.out.println("메뉴는 0 ~ 2까지 선택, 종료 : QUIT");
//			continue;
		}
		System.out.println();
	}
	
	
}
