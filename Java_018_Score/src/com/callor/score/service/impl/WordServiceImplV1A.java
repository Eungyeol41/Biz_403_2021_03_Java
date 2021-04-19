package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.callor.score.model.WordVO;
import com.callor.score.service.WordService;

public class WordServiceImplV1A implements WordService{

	protected final int 영어 = 0;
	protected final int 한글 = 1;
	protected Scanner scan;
	protected List<WordVO> wordList;
	
	public WordServiceImplV1A() {
		wordList = new ArrayList<WordVO>();
		scan = new Scanner(System.in);
		
		// word.text 파일을 읽어서 wordList 데이터를 생성하는 method를 생성자에서 호출하여 이 클래스(wordService...V1)를 생성하면 자동으로 실행되어 wordList 데이터를 준비하도록 하자
		this.loadWord();
	}
	
	@Override
	public void loadWord() {
		// TODO word.txt 파일을 읽어서 wordList 만들기
		String wordFile = "src/com/callor/score/word.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(wordFile);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String reader = buffer.readLine();
				if(reader == null) break;
				String words[] = reader.split(":");

				WordVO wordVO = new WordVO();
				wordVO.setEnglish(words[0]);
				wordVO.setKorea(words[1]);
				wordList.add(wordVO);
			} // end while
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일을 여는 동안 문제 발생");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일에서 데이터 읽는 중 문제 발생");
		}
		
	}

	@Override
	public void printWord() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewWord() {
		
		int nWinCount = 0;
		int nLossCount = 0;
		
		while (true) {
			WordVO vo = this.getWord();
			System.out.println(vo.toString());
			System.out.println("=".repeat(50));
			System.out.println("다음 뜻과 같은 영어 단어는? ( Quit : 그만하기 )");
			System.out.println(vo.getKorea());
			System.out.println("-".repeat(50));
			System.out.print(" >> ");
			String strKor = scan.nextLine();
			if(strKor.equals("Quit")) break;
			if (strKor.equalsIgnoreCase(vo.getEnglish())) {
				System.out.println("참 잘했어요!!");
				nWinCount++;
			} else {
				System.out.println("좀 더 열심히 공부합시다 ○ ▽ ○");
				nLossCount++;
			} 
			System.out.println("=".repeat(50));
			System.out.println("지금까지 성공한 개수 : " + nWinCount);
		}
		System.out.println("Game Over!!");
	}
	
	
	public WordVO getWord() {
		
		// TODO wordList에 담긴 데이터 중 임의의 데이터 1개를 추출
				Random rnd = new Random();
				rnd.nextInt( 100 ); // 0 ~ 99 中 정수 1개 생성
				
				int nSize = wordList.size();
				int num = rnd.nextInt(nSize); // 0 ~ nSize -1 中 정수 1개 생성
				
				WordVO wordVO = wordList.get(num);
				// System.out.println(wordVO.toString());
				
				return wordVO;
				
	}
	

}
