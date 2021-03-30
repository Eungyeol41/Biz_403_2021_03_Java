package com.callor.classes;

public class Value_04 {
	/*
	 * main() method에서 같은 클래스 내의 다른 method를 호출하여 코드를 실행하려면 반드시 호출되는 method도 static이어야 한다.
	 */

	public static void main(String[] args) {
		System.out.println(0 / 3);
		Integer result = divid(30,40);
		result = divid(30,0);
		if(result == null) {
			System.out.println("나눗셈을 수행할 수 없음");
		}
	}
	/*
	 * 0과 0을 나눗셈연산을 수행하면 문제가 발생한다
	 * divid() method에 2개의 정수를 매개변수로 전달하고 전달한 숫자가 0이 아니면 나눗셈연산을 하여 return하고 
	 * 전달한 숫자가 한 개라도 0이면 나눗셈 연산을 수행하지 않고 null값을 return하도록 한다 
	 */
	private static Integer divid(int num1, int num2) {
		if(num2 == 0) {
			return null;
		} else {
			return num1 / num2;
		}
	}
}
