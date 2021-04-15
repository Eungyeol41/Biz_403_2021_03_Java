package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Eungyeol41.standard.InputService;
import com.Eungyeol41.standard.impl.InputServiceImplV1;
import com.callor.score.domain.ScoreVO;
import com.callor.score.domain.StudentVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.StudentService;

public class ScoreServiceImplV1 implements ScoreService{
	
	protected StudentService stService;
	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	protected InputService inService;
	
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		inService = new InputServiceImplV1();
		stService = new StudentServiceImplV1A();
		this.insertScore();
	}

	@Override
	public void insertScore() {
		// TODO Auto-generated method stub
		
		while (true) {
			Integer num = inService.inputValue("학번", 1);
			if (num == null) return;
			String strNum = String.format("%05d", num); // end 학번
			
			int i = 0;
			for(i = 0; i < scoreList.size(); i++) {
				ScoreVO vo = scoreList.get(i);
				if(vo.getNum().equals(strNum)) break;
			} // 학번 중복 검사
			if(i < scoreList.size()) {
				System.out.println(strNum + "학번은 이미 입력되어 있음");
				continue;
			}
			
			Integer kor = inService.inputValue("국어", 0, 100);
			if(kor == null) return; // end 국어
			Integer eng = inService.inputValue("영어", 0, 100);
			if(kor == null) return; // end 영어
			Integer math = inService.inputValue("수학", 0, 100);
			if(kor == null) return; // end 수학
			
			ScoreVO vo = new ScoreVO();
			vo.setNum(strNum);
			vo.setKor(kor);
			vo.setEng(eng);
			vo.setMath(math);
			scoreList.add(vo);
		}
		
		
	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t학과\t학년\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(80));
		
		for(int i = 0; i < scoreList.size(); i++) {
			
			ScoreVO vo = scoreList.get(i);
			StudentVO stVO = stService.getStudent(vo.getNum());
			
			System.out.print(vo.getNum() +"\t");
			System.out.print(stVO.getName() +"\t");
			System.out.printf("%5s\t", stVO.getDept());
			System.out.print(stVO.getGrade() +"\t");
			System.out.print(vo.getKor() +"\t");
			System.out.print(vo.getEng() +"\t");
			System.out.print(vo.getMath() +"\t");
			System.out.print(vo.getTotal() +"\t");
			System.out.printf("%3.2f\n", vo.getAvg());
		}
		System.out.println("=".repeat(80));
		
	}
	
}
