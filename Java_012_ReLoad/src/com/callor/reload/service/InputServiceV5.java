package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV5 {

	Scanner scan;
	List<NumberVO> numList;
	
	public InputServiceV5() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}
	
	public void inputNum() {
		Integer intNum1;
		Integer intNum2;
		
		while(true) {
			System.out.println("정수를 입력하세요");
			System.out.println("정수 1 >> ");
			String strNum1 = scan.nextLine();
			intNum1 = Integer.valueOf(strNum1);
			
			System.out.println("정수를 입력하세요");
			System.out.println("정수 2 >> ");
			String strNum2 = scan.nextLine();
			intNum2 = Integer.valueOf(strNum2);
			
			if(intNum1 > intNum2) {
				break;
			} else {
				System.out.println("정수 1은 정수 2보다 커야합니다");
				
				
			}
			
		}
		
		NumberVO vo = new NumberVO();
		vo.setNum1(intNum1);
		vo.setNum2(intNum2);
		
		numList.add(vo);
		
		this.printNum();
		
		System.out.print("두 정수의 차 : ");
		System.out.printf("%d - %d = %d", vo.getNum1(), vo.getNum2(), vo.getNum1() - vo.getNum2());
		
	}
	
	public void printNum() {
		for(int i = 0; i < numList.size(); i++) {
			NumberVO vo = numList.get(i);
			
			System.out.print(vo.getNum1() + "\t");
			System.out.println(vo.getNum2());
		}
	}
	
	
}
