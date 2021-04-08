package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Eungyeol41.standard.InputService;
import com.Eungyeol41.standard.impl.InputServiceImplV1;
import com.callor.app.model.ScoreVO;

public class ScoreServiceImplV1 implements ScoreService {

	InputService inService;
	protected Scanner scan;
	List<ScoreVO> scoreList;
	int line = 70;

	String num;
	int kor;
	int eng;
	int math;

	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		inService = new InputServiceImplV1();
	}

	@Override
	public void selectMenu() {
		while (true) {
			System.out.println("=".repeat(line));
			System.out.println("메뉴를 선택하세요");
			System.out.println("-".repeat(line));
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적리스트 출력");
			System.out.println("QUIT. 업무 종료");
			System.out.println("-".repeat(line));
			System.out.println("업무 선택");
			System.out.print(" >> ");
			String strMenu = scan.nextLine();
			
			if(strMenu.equals("QUIT")) {
				break;
			}

			Integer num;
			try {
				num = Integer.valueOf(strMenu);
			} catch (NumberFormatException e) {
				System.out.println("메뉴 선택 오류!");
				System.out.println("메뉴는 1, 2, QUIT만 입력 가능합니다");
				continue;
			} // end try-catch
			
			if (num == 1) {
				this.inputScore();
			} else if (num == 2) {
				this.printScore();
			} else if (num == 0) {
				System.out.println("업무 종료");
				return;
			}
		} // end while

	} // end selectMenu

	@Override
	public void inputScore() {

		String name = this.inputName();

		String num = this.inputNum();

		System.out.println(name + " 학생의 점수를 입력해주세요");
		System.out.println("점수는 0 ~ 100까지!");
		System.out.println("=".repeat(line));

		kor = inService.inputValue("국어", 0, 100);
		eng = inService.inputValue("영어", 0, 100);
		math = inService.inputValue("수학", 0, 100);

		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(num);
		scoreVO.setName(name);
		scoreVO.setKor(kor);
		scoreVO.setEng(eng);
		scoreVO.setMath(math);
		scoreList.add(scoreVO);

	}

	@Override
	public String inputName() {
		System.out.println("학생의 이름을 입력하세요");
		System.out.print(" >> ");
		String name = scan.nextLine();

		return name;
	}

	private String inputNum() {

		Integer intNum = inService.inputValue("학번", 0);
		String strNum = Integer.toString(intNum);
		
		return strNum;
	}

	@Override
	public void printScore() {

		System.out.println("=".repeat(line));
		System.out.println("성적 리스트 출력");
		System.out.println("=".repeat(line));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("-".repeat(line));

		for (int i = 0; i < scoreList.size(); i++) {
			ScoreVO scoreVO = scoreList.get(i);

			System.out.printf("%s\t", scoreVO.getNum());
			System.out.printf("%s\t", scoreVO.getName());
			System.out.printf("%d\t", scoreVO.getKor());
			System.out.printf("%d\t", scoreVO.getEng());
			System.out.printf("%d\t", scoreVO.getMath());
			System.out.printf("%d\t", scoreVO.getTotal());
			System.out.printf("%3.2f\n", scoreVO.getAvg());
			System.out.println("=".repeat(line));
		}

	}

}
