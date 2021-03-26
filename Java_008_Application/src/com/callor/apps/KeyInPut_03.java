package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.Service.LinesService;

public class KeyInPut_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int lineLength = 30;
		System.out.println(LinesService.dLines(lineLength));
		
		System.out.println("두 수의 사칙연산");
		
		System.out.println(LinesService.dLines(lineLength));
		
		System.out.println("두 개의 정수를 입력합니다");
		System.out.print("정수 1 >> ");
		int num1 = scan.nextInt();
		System.out.print("정수 2 >> ");
		int num2 = scan.nextInt();
		
		System.out.println(LinesService.sLines(lineLength));
		
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d x %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %f\n", num1, num2, (float)num1 / num2);
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
		
		System.out.println(LinesService.dLines(lineLength));
	}
}
