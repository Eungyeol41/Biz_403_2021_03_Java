package com.callor.var;

public class Varriable_10 {
	
	public static void main(String[] args) {
		
		int intNum = 1; // 시작하는 값
		
		// 명령이 실행될 때마다 1씩 증가하는 값으로 설정
		intNum ++ ; // 시작하는 값 + 1
		intNum ++ ; // 시작하는 값 + 2
		
		int intNum1 = 100;
		intNum1++; // 101
		intNum1++; // 102
		
		intNum1 = 99;
		intNum1 ++; // 100
		
		intNum1 = 0;
		intNum1 ++; //1
		
		intNum1 = 1;
		intNum1 += 2; // 1 + 2
		intNum1 += 2; // 1 + 2 + 2
		intNum1 += 2; // 1 + 2 + 2 + 2
		
		intNum1 = 0;
		int intSum = 0;
		
		// intSum = intSum + intNum1
		//			0 		+	0
		intSum += intNum1 ; // intSum == ?? == 0
		
		//intNum1을 1 증가하고 == 1이 된다
		//intNum1에 저장된 1을 intSum에 저장하라
		intSum += ( ++intNum1 ); // 0 + 1
		
		// intNum을 1 증가 == 2
		// intNum에 저장된 2를 intSum에 저장하라
		// intSum = intSum + intNum1;
		// intSUm =  	1	+	2
		intSum += ++intNum1; // intSum == 3
		
		// intNum1을 1 증가 ==> intNum1 == 3
		// intSum에 intNum1에 저장된 3을 더하라
		// intSum = intSum + intNum1 == 3 + 3
		intSum += ++intNum1;
		
		intNum = 0;
		intSum = 0;
		
		// 1씩 증가(변화)되는 intNum 변수의 값을 intSum 변수에 누적한다(쌓는다)
		
		intSum += ++intNum; // 0 + 1을 intSum에 저장하라
		intSum += ++intNum; // 1 + 2를 intSum에 저장하라
		intSum += ++intNum; // 3 + 3을 intSum에 저장하라
		intSum += ++intNum; // 6 + 4를 intSum에 저장하라
		
		intNum = 1;
		intSum = 0;
		
		
		//처음에 만들어진 intNum값(1)을 intSum 변수에 누적하고 다음 올 코드를 위하여 intNum에 1을 증가시켜라
		intSum += intNum++; // 0 + 1
		intSum += intNum++; // 1 + 2
		intSum += intNum++; // 3 + 3
		intSum += intNum++; // 6 + 4
		
	}

}
