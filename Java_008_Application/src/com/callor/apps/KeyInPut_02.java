package com.callor.apps;

import java.util.Scanner;

public class KeyInPut_02 {
	
	public static void main(String[] args) {
		// 키보드에서 데이터를 입력받기 위한 준비
		Scanner scan = new Scanner(System.in);
		
		/*
		 * 키보드 입력을 대기하는 명령이 실행되기 전에는 반드시 무엇을 해야하는지에 대한 안내 메시지를 먼저 출력해야 한다
		 */
		System.out.println("정수값을"
				+ " 키보드로 입력하고 Enter"
				+ "를 눌러주세요");
		System.out.println();
		
		System.out.print("정수1 >> ");
		int num1 = scan.nextInt();
		System.out.print("정수2 >> ");
		int num2 = scan.nextInt();
		
		System.out.println("입력된 두 정수의 합");
		System.out.println(num1 + num2);
		System.out.println();
		
	}

}