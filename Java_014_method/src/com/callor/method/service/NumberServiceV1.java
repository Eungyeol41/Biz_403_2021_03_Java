package com.callor.method.service;

/*
 * 함수형 프로그래밍 언어(또는 구조적 프로그래밍 언어)에서는
 * 한 개의 모듈(파일) 또는 한 프로젝트에서 같은 이름의 함수를 선언할 수 없다
 * 
 * 객체지향 프로그램언어(java에서는)
 * 한 개의 클래스(파일) 내에서 같은 이름의 함수(method)를 중복하여 선언할 수 있다
 * 		한 개의 클래스에서 method를 중복선언 할 수 있다.
 * 
 * 단, 조건 -> 매개변수가 달라야 한다
 * 		매개변수의 type, 개수, 순서가 다르면 같은 이름의 method를 중복선언할 수 있다
 */

public class NumberServiceV1 {
	/*
	 * method 이름은 addNum() 두 개의 정수를 매개변수로 받는다 누구나 어디선가 addNum()을 호출할 때는 객체.addNum()
	 * 2개의 정수를 전달하게 하겠다라는 선언 객체.addNum(100, 200)
	 * 
	 * 2개의 정수를 전달받기 위해서는 method가 준비를 해야 한다 method의 ( ) 안에 변수를 선언한다 2개의 변수를 선언하자
	 * 
	 * 두 수의 합을 계산하여 결과가 짝수이면 그 합을 return return 합; 형식의 명령이 있어야 한다 그렇지 않으면 null을
	 * return하라 return null; 형식의 명령이 있어야 한다
	 * 
	 * return 값 형식의 명령이 있으려면 void가 아닌 return type을 지정해 주어야 한다
	 * 
	 * 단순히 정수만 return을 하는 경우에는 int type으로 하면 되는데 여기에서는 어떤 조건에 따라 null값을 return 해야 하는
	 * 경우도 있기 때문에 int type이 아닌 Integer type으로 설정해야 한다
	 */

	public Integer addNum(int num1, int num2) {
		// No.1
		// 어떤 연산을 수행하고 연산결과에 따라 return 등을 수행해야 하는 경우 연산된 결과를 변수에 담아놓고 이후 코드를 진행하자
		// Integer sum = num1 + num2;
		int sum = num1 + num2;
		if (sum % 2 == 0) {
			return sum;
		} // else {
		return null;

		// No.2
		// C 언어와 같은 함수형 언어에서는 함수를 끝내는 return문은 한 번만 쓰자라는 전통적인 패턴이 있다
		// -> 전통적인 패턴을 지키는 코드 예
		// 짝수일 때의 sum에는 num1 + num2의 값이 들어가면서 합계가 return되지만,
		// 홀수일 때는 if()를 그냥 지나가게 되니까 null이 return된다
		// Integer sum = null;
		// if( (num1 + num2) % 2 == 0 ) {
		// sum = num1 + num2;
		// }
		// return sum;

		// No.3
		// if( ( num1 + num2 ) % 2 == 0) {
		// return num1 + num2;
		// }
		// return null;

	} // end addNum(int num1, int num2)
	
	/*
	 * Java의 method는 매개변수에 따라 호출하는 방식이 달라진다
	 * 
	 * 만약 addNum(정수, 정수) 방식으로 호출하려면 addNum(int num1, int num2) 형식으로 method를 선언해야한다
	 * 만약 addNum(실수, 실수) 방식으로 호출하려면 addNum(float num1, float num2) 형식으로 method를 선언해야한다
	 * 
	 * method를 호출할 때 전달하는 데이터의 type에 맞도록 method가 미리 만들어져 있어야 한다
	 */
	public Float addNum(float num1, float num2) {
		//TODO 두 실수를 전달받아 짝수인가 판별하는 코드
		float sum = num1 + num2;
		if(sum % 2 == 0) {
			return sum;
		}
		//method 코드가 아직 작성되지 않았을 때 문법오류가 나는 것을 방지하는 임시코드
		return null;
	}
	
	public Float addNum(int num1, float num2) {
		return null;
	}
	
	public Float addNum(float num1, int num2) {
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}