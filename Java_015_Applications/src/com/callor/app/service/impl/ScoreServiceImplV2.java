package com.callor.app.service.impl;

import com.callor.app.model.ScoreVO;

// V1에는 ScoreService 인터페이스가 impl 되어있기 때문에
// V1을 상속받으면 자동으로 인터페이스도 상속받게 된다
public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	@Override
	public void inputScore() {
		// TODO 학번, 이름, 과목 점수를 입력받아 List에 추가

		String strNum;
		// 학번
		while (true) {

			int nCount= 0;
			
			strNum = this.inputNum();
			if (strNum == null) {
				return;
			}
			
			for (int i = 0; i < scoreList.size(); i++) {
				if (scoreList.get(i).getNum().equals(strNum)) {
					nCount++;
				}// end if
			} // end for
			
			if(nCount > 0) {
				System.out.println("이미 입력됨");
				continue;
			}
			break;
		} // end while

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
		 * if(intKor == null || intEng == null || intMath == null) { return; }
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

}
