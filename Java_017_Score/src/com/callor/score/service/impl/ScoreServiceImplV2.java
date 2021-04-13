package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Eungyeol41.standard.InputService;
import com.Eungyeol41.standard.impl.InputServiceImplV1;
import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreServiceImplV1;

public class ScoreServiceImplV2 extends ScoreServiceImplV1{
	
	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	InputService inService = new InputServiceImplV1();
	
	public ScoreServiceImplV2() {
		scoreList = new ArrayList<ScoreVO>();
	}
	
	public void InputScore() {
		
		
		while (true) {
			
			Integer num = inService.inputValue("학번", 1);
			if(num == null) {
				return;
			}
			String strNum = String.format("%03d", num); // end num
			
			System.out.println(num + " 학생의 이름 ( QUIT : 입력 중단 )");
			System.out.print(" >> ");
			String name = scan.nextLine();
			if(name.equals("QUIT")) {
				break;
			} // end name
			
			
			Integer kor = inService.inputValue("국어", 0, 100);
			if (kor == null) {
				return;
			} // end kor
			Integer eng = inService.inputValue("영어", 0, 100);
			if (eng == null) {
				return;
			} // end eng
			Integer math = inService.inputValue("수학", 0, 100);
			if (math == null) {
				return;
			} // end math 
			
			ScoreVO vo = new ScoreVO();
			vo.setNum(strNum);
			vo.setName(name);
			vo.setKor(kor);
			vo.setEng(eng);
			vo.setMath(math);
			scoreList.add(vo);
			
		}
	}
	
	
}
