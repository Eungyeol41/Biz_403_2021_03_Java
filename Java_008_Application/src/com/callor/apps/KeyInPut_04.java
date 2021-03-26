package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.Service.LinesService;

public class KeyInPut_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] intNum = new int[5];
		int intSum = 0;
		int lineLength = 50;
		
		System.out.println(LinesService.dLines(lineLength));
		System.out.println("5개의 정수를 입력합니다");
		System.out.println(LinesService.sLines(lineLength));
		System.out.println("정수값을 키보드로 입력하고 Enter를 눌러주세요");
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("정수 %d >> ", i + 1);
			intNum[i] = scan.nextInt();
		}
		System.out.println(LinesService.sLines(lineLength));
		System.out.print("정수 : ");
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d\t", intNum[i]);
		}
		System.out.println();
		System.out.println(LinesService.sLines(lineLength));
		
		for(int i = 0; i < 5; i++) {
			intSum += intNum[i];
		}
		System.out.println("정수들의 합 : " + intSum);
		System.out.println(LinesService.dLines(lineLength));
	}
}
