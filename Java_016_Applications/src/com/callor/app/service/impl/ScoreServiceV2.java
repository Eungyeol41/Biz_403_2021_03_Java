package com.callor.app.service.impl;

import java.util.Scanner;

import com.callor.app.service.ScoreService;

public class ScoreServiceV2 implements ScoreService {

	protected Scanner scan;
	int line = 70;

	public ScoreServiceV2() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
	}

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		
		Integer menu;
		
		while (true) {
			System.out.println("=".repeat(line));
			System.out.println("빛고을 고교 성적처리 2021");
			System.out.println("=".repeat(line));
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적리스트 출력");
			System.out.println("3. 성적 저장");
			System.out.println("QUIT. 종료");
			System.out.println("-".repeat(line));
			System.out.print("업무 선택 >> ");
			String strMenu = scan.nextLine();

			if (strMenu.equals("QUIT")) {
				break;
			} // end if(QUIT)

			try {
				menu = Integer.valueOf(strMenu);
			} catch (NumberFormatException e) {
				System.out.println("메뉴 선택 오류!");
				System.out.println("메뉴는 1, 2, QUIT만 입력 가능합니다");
				continue;
			} // end try-catch

			if (menu == 1) {
				this.inputScore();
			} else if (menu == 2) {
				this.printScore();
			} else if (menu == 3) {
				this.saveScore();
			} else {
				System.out.println("1 ~ 3, QUIT만 입력 가능합니다");
			} // end if - else
		} // end while

	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}

}
