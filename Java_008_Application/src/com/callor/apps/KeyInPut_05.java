package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.Service.LinesService;

public class KeyInPut_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int lineLength = 30;
		int num ;
		
		System.out.println(LinesService.dLines(lineLength));
		System.out.println("정수를 입력하세요");
		System.out.print("정수 >> ");
		num = scan.nextInt();
		System.out.println(LinesService.dLines(lineLength));
		
		if(num % 2 == 0) {
			System.out.println(num + "는 짝수이다");
		} else {
			System.out.println(num + "는 짝수가 아니다");
		}
		
		int i = 0;
		for(i = 2; i < num; i++) {
			if(num % i == 0) {
				break;
			}
		}
		if(i < num) {
			System.out.println(num + "는 소수가 아니다");
		} else {
			System.out.println(num + "는 소수이다");
		}
		System.out.println(LinesService.dLines(lineLength));
	}
}
