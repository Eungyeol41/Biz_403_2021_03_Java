package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import com.Eungyeol41.standard.MenuService;
import com.Eungyeol41.standard.impl.MenuServiceImplV1;
import com.callor.score.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {
	
	protected MenuService menuService;
	
	@Override
	public void selectMenu() {

		List<String> menu = new ArrayList<String>();
		menu.add("학생 정보 등록");
		menu.add("성적 등록");
		menu.add("성적 정보 열기");
		menu.add("성적 정보 저장");
		menu.add("성적 정보 출력");
		
		menuService = new MenuServiceImplV1("대한 고등학교 성적처리 시스템 2021", menu);
		
		while(true) {
			Integer menuNum = menuService.selectMenu();
			if(menuNum == null) {
				System.out.println("업무 종료!!");
				break;
			}
			if(menuNum == 1) {
				this.inputScore();
			} else if(menuNum == 2) {
				this.inputScore();
			} else if(menuNum == 3) {
				this.readScore();
			} else if(menuNum == 4) {
				this.saveScore();
			} else {
				this.printScore();
			}
		}
		
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
