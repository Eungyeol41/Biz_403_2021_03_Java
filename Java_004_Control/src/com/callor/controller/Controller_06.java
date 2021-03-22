package com.callor.controller;

import java.util.Random;

/*
 *  JDK에는 수없이 많은 도구들이 포함되어 있다
 *  Lego 블럭을 이용해서 작품 만드는 것처럼 JDK에 있는 도구들을 사용하여 프로젝트를 만들 수 있다
 *  JDK에 있는 도구는 워낙 종류가 다양해서 한꺼번에 프로젝트에 포함하면 프로젝트가 너무 거대해지게된다
 *  Java에서는 가장 기본적인 도구 외에는 모두 파일로 제공하고 필요에 따라 import하여 사용할 수 있도록 하고 있다
 *  
 *  import java.util.Random;
 *  '지금부터 Controller_06 클래스에서 java.util 패키지의 Random클래스라는 도구를 사용하여 코딩을 하겠다'라는 선언
 *  
 *  eclipse에서 도구를 사용하기 위해서 import 하고자 할 때는 Ctrl + Shift + O
 *  
 *  코드의 모양을 정렬하는 것
 *  Ctrl + Shift + F
 */

public class Controller_06 {

	public static void main(String[] args) {
		
		/*
		 * 프로젝트에서 JDK의 클래스(도구)를 사용하는 방법
		 * 변수를 선언하고 초기화하는 것과 유사
		 * 
		 * int 키워드는 정수형 변수를 선언
		 * Integer 키워드는 정수형 변수 선언
		 * 	실체는 키워드가 아니고 class이다
		 * 
		 * 키워드는 java가 처음 탄생될 때부터 만들어진 명령어
		 * class 키워드처럼 사용이 되지만 java가 탄생하고 이후에 필요에 따라 추가, 확장된 명령
		 */
		Random rnd = null; // 선언
		rnd = new Random(); // 초기화
		
		Random rnd1 = new Random();
		
		int num1 = 0;
		Integer num2 = 0;
		Integer num3 = new Integer(0);
		
		String str1 = "";
		str1 = "홍길동";
		
		String str2 = null;
		String str3 = new String();
		
		/*
		 * wrapper 클래스
		 *  = 클래스이지만 변수 선언처럼 사용할 수 있는 도구들
		 * Integer, Long, Float, Double, Boolean, Charactor는
		 * int, long, float, double, boolean char 키워드에 확장된 기능을 할 수 있도록 만들어진 class이다
		 * 기본 기능은 값을 저장하는 변수를 선언한다
		 * 기본기능에 별도로 확장된 추가명령들을 수행할 수 있도록 만들어진 변수들
		 */
		
	}
}
