package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.callor.score.model.ScoreVO;

public class ScoreServiceImplV3 extends ScoreServiceImplV2 {

	// V1, V2로부터 다음 method를 상속받은 상태
	// selectMenu(),
	// inputScore(),
	// printScore(),
	// saveScore()

	// readScore()

	/*
	 * sample_score.txt에서 성적데이터를 읽어서 
	 */
	@Override
	public void readScore() {
		
		String readFile = "src/com/callor/score/sample_score.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		/*
		 * list에 있는 removeAll method는 2개의 list에 중복된 데이터가 있으면 중복된 데이터를 삭제하는 method
		 */
		scoreList.removeAll(scoreList);
		
		try {
			fileReader = new FileReader(readFile);
			buffer = new BufferedReader(fileReader);
			while(true) {
				String reader = buffer.readLine();
				// if 조건문에 대하여 실행할 명령문이 한 줄만 있을 경우 {	} 생략하고 명령문을 사용할 수 있다
				if(reader == null) break;
				
				String[] scores = reader.split(":");
				Integer intKor = Integer.valueOf(scores[1]);
				Integer intEng = Integer.valueOf(scores[2]);
				Integer intMath = Integer.valueOf(scores[3]);
				
				ScoreVO scoreVO = new ScoreVO();
				scoreVO.setNum(scores[0]);
				scoreVO.setKor(intKor);
				scoreVO.setEng(intEng);
				scoreVO.setMath(intMath);
				scoreList.add(scoreVO);
			}
			buffer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
