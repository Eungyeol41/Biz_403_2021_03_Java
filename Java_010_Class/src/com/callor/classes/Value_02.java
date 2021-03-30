package com.callor.classes;

import java.util.Scanner;

/*
 * null 값
 * 프로그래밍, 정보처리에서는 어떤 항목의 데이터가 있는가 없는가를 판단해야하는 경우가 있다
 * 
 * 문자열의 경우는 값이 없는 경우를 ""으로 표현할 수 있다
 * 숫자형일 경우 일반적으로 0이라는 값을 없는 값으로 표현을 하기도 한다
 * 
 * if(변수 == 0) : 없다라는 표현을 사용할 수 있다
 * 실제로 어떤 값이 0인 값을 갖는지, 아니면 아무것도 없어서 0인지 구별을 못한다
 * null값을 사용하여 실제로 아무것도 없는 상태를 표현한다
 * 
 * java primitive type의 변수들은 null을 저장할 수 없다
 * wrapper class 사용하여 ...
 */

public class Value_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" >> ");
		Integer num = scan.nextInt();
		System.out.println(num);
		
		// 키보드에서 문자열을 입력하고 Enter를 누르면 값이 str변수에 저장되고 다음 코드가 실행
		// 그냥 Enter만 눌러도 입력을 종료하고 다음 코드가 실행됨
		System.out.println("숫자1 >> ");
		String str1 = scan.nextLine();
		if(str1 == null) { // ""문자열 변수의 null값과 유사한 성격을 갖는 값
			System.out.println("아무것도 없는 값 입력");
		}
		System.out.println("숫자2 >> ");
		String str2 = scan.nextLine();

		Integer num1 = Integer.valueOf(str1);
		Integer num2 = Integer.valueOf(str2);
		System.out.println(num1 + num2);
		
		if(num1 == 0) {
			System.out.println("num1 변수에 값이 없다");
		}
		if(num1 == null) {
			System.out.println("num1 변수에 값이 없다");
		}
		
		
	}
}
