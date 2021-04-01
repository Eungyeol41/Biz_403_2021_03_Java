package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV2 {

	Scanner scan = new Scanner(System.in);
	List<Integer> intList = new ArrayList<Integer>();

	public void inputNum() {
		int num;

		System.out.println("키보드로 정수를 입력하세요 ( 50 ~ 100 )");
		System.out.print("정수 >> ");
		num = scan.nextInt();
		while (num < 50 || num > 100) {
			System.out.println("범위를 벗어났습니다. 다시 입력해주세요");
			System.out.print("정수 >> ");
			num = scan.nextInt();
		}

		intList.add(num);

	}

}
