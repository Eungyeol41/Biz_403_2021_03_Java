package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Eungyeol41.standard.InputService;
import com.Eungyeol41.standard.impl.InputServiceImplV1;
import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;

/*
 * 1. 메뉴를 보여주고
 * 2. 성적입력 : 학생 수의 제한이 없다
 * 		가. 학번
 * 		나. 학생 이름 : inputName()
 * 		다. 과목별 성적 : inputScore()
 * 
 * 		가. 학생성적입력 : inputScore() 시작
 * 			- 학번 입력
 * 			- 이름 입력
 * 			- 점수 입력
 * 
 * 		나. 학생의 이름을 입력하는 inputName() method는 return type String 형이기 때문에 학생 이름을 입력받고 입력받은 학생이름을 return한다
 * 			이 return 학생이름을 inputScore()에서 변수에 담아 처리를 할 수 있다
 */
public class ScoreServiceImplV1A implements ScoreService {

	// 저장소
	protected List<ScoreVO> scoreList;

	// 학번, 점수를 입력받을 때 사용할 객체
	protected InputService inService;

	// 학생의 이름을 입력받을 때 사용할 객체
	protected Scanner scan;

	public ScoreServiceImplV1A() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
		inService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
	}

	@Override
	public void selectMenu() {
		// TODO 성적처리 메뉴 선택
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적리스트 출력");
			System.out.println("QUIT. 업무 종료");
			System.out.println("-".repeat(50));
			System.out.println("업무 선택");
			System.out.print(" >> ");
			String strM = scan.nextLine();

			if (strM.equals("QUIT")) {
				break;
				// System.out.println("업무종료");
				// return;
			}
			Integer intM = null;
			try {
				intM = Integer.valueOf(strM);
			} catch (NumberFormatException e) {
				System.out.println("메뉴는 정수, QUIT만 입력");
			}// end try=catch
			
			if(intM == 1) {
				this.inputScore();
			} else if(intM == 2) {
				this.printScore();
			}
		}// end while

	}

	/*
	 * 현재 클래스 내부에서만 호출되는 method는 private로 선언한다
	 * 현재 클래스를 상속받아 확장하여 사용할 수 있도록 하려면
	 * private => protected로 변경해주는 것이 좋다
	 */
	protected String inputNum() {
		// 학번 입력 처리 : 001, 002 형식으로 입력받자
		// 정수 1 이상을 입력하면 정수값이 intNum에 담길 것이고
		// QUIT를 입력했으면 null값이 intNum에 담길 것이다
		Integer intNum = inService.inputValue("학번", 1);

		// intNum에 null값이 담겨있으면 종료하고 다시 메뉴로 돌아간다
		if (intNum == null) {
			return null;
		}

		// 정수를 입력했으면 입력받은 정수값을 학번의 문자열 형식(001, 002)으로 변환을 하자
		// String.format("%3d",intNum) : 전체 자릿수를 3개로 만들고 정수값을 오른쪽 정렬하는 문자열 만들기
		// " 1"
		// String.format(%03d, 1) : 전체 자릿수를 3개로 만들고 정수값을 오른쪽 정렬하고 왼쪽의 빈칸에 0을 채워라
		// "001"
		String strNum = String.format("2021%03d", intNum); // 2021001
		
		return strNum;
	}

	@Override
	public void inputScore() {
		// TODO 학번, 이름, 과목 점수를 입력받아 List에 추가

		String strNum = this.inputNum();
		if(strNum == null) {
			return;
		}
		
		// 학생의 이름 입력
		String strName = this.inputName();
		if (strName == null) {
			return;
		}
		
		Integer intKor = inService.inputValue("국어", 0, 100);
		if (intKor == null) {
			return;
		}

		Integer intEng = inService.inputValue("영어", 0, 100);
		if (intKor == null) {
			return;
		}

		Integer intMath = inService.inputValue("수학", 0, 100);
		if (intKor == null) {
			return;
		}

		/*
		 * 아래 비교문은 3과목을 모두 입력하는 Prompt가 나타난 후 한 과목이라도 QUIT하면 종료하는 코드이다 만약 국어 과목에서 QUIT를
		 * 하여도 영어, 수학 점수를 입력받은 Prompt가 나타나고 3과목을 모두 통과한 후 입력종료가 된다
		 * 
		 * if (intKor == null || intEng == null || intMath == null) { return; }
		 */

		// 입력을 모두 마쳤으면 VO에 담기
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);

		// vo에 담긴 데이터를 List 저장소에 추가
		scoreList.add(scoreVO);
	}

	
	@Override
	public String inputName() {
		// TODO 학번으로 보여주고 이름을 입력받는 method

		String strNum = null;

		while (true) {
			System.out.println(strNum + "학생의 이름 입력");
			System.out.print(" >> ");
			String strName = scan.nextLine();
			
			if (strName.equals("QUIT")) {
				// return null;
				break;
			} else if (strName.equals("")) { // 입력 없이 Enter만
				System.out.println("학생 이름은 반드시 입력해야 합니다.");
				continue;
			} // end if-else
			return strName;
		} // end while
		return null;
	}

	@Override
	public void printScore() {
		// TODO 리스트 출력하기
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("-".repeat(80));

		for (int index = 0; index < scoreList.size(); index++) {
			
			ScoreVO scoreVO = scoreList.get(index);
			// System.out.println(scoreList.get(index).getNum());
			System.out.printf("%s\t", scoreVO.getNum());
			System.out.printf("%s\t", scoreVO.getName());
			System.out.printf("%d\t", scoreVO.getKor());
			System.out.printf("%d\t", scoreVO.getEng());
			System.out.printf("%d\t", scoreVO.getMath());
			System.out.printf("%d\t", scoreVO.getTotal());
			System.out.printf("%3.2f\n", scoreVO.getAvg());
		}
		System.out.println("=".repeat(80));

	}

}
