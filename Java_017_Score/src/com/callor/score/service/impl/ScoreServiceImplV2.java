package com.callor.score.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Eungyeol41.standard.InputService;
import com.Eungyeol41.standard.impl.InputServiceImplV1;
import com.callor.score.model.ScoreVO;

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
	
	@Override
	public void printScore() {
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("=".repeat(80));
		
		int nSize = scoreList.size();
		for(int i = 0; i < nSize; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
		}
	}
	
	@Override
	public void saveScore() {
		
		String fileName = null;
		while(true) {
			System.out.println("저장할 파일 이름을 입력하세요");
			System.out.print(" >> ");
			fileName = scan.nextLine();
			if(fileName.equals("")) {
				System.out.println("파일 이름은 반드시 입력해야합니다");
				continue;
			}
			break;
		}
		
		String strFileName = "src/com/callor/score/" + fileName;
		
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		try {
			fileWriter = new FileWriter(strFileName);
			out = new PrintWriter(fileWriter);
			
			int nSize = scoreList.size();
			for(int i = 0; i < nSize; i++) {
				ScoreVO vo = scoreList.get(i);
				
				out.print(vo.getNum() + "\t");
				out.print(vo.getName() + "\t");
				out.print(vo.getKor() + "\t");
				out.print(vo.getEng() + "\t");
				out.print(vo.getMath() + "\t");
				out.print(vo.getTotal() + "\t");
				out.printf("%3.2f\n", vo.getAvg());
			}
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일을 저장할 수 없습니다.");
		}
	
	}
}
