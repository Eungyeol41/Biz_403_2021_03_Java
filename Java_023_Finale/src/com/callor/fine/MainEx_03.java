package com.callor.fine;

public class MainEx_03 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		AddInt addInt = new AddInt();
		int sum = addInt.add(num1, num2);
		System.out.println(sum);
		// 출력결과는 30
		// 빨간 줄 해결은..? -> 클래스 필요
		// 결과가 30이 되려면! 어떻게 해야하는가
		// 어떤 클래스와 메소드를 만들어야 하는가
		
	}
}
