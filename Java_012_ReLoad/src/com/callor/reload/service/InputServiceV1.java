package com.callor.reload.service;

import java.util.List;
import java.util.Scanner;

public class InputServiceV1 {

	List<Integer> intList;
	Scanner scan = new Scanner(System.in);
	
	public void inputNum() {
		int num;

		System.out.println("정수를 입력하세요 >> ");
		num = scan.nextInt();
		
		intList.add(num);
		
	}
	
	public void printNum() {
		this.inputNum();
		
	}
	
	
}
