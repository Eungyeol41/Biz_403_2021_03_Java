package com.callor.classes;

import com.callor.classes.service.ValueService;

public class Value_05 {

	public static void main(String[] args) {
		
		ValueService vs = new ValueService();
		
		vs.nums();
		
		// retNum 멤버변수를 public으로 선언하면 아래와 같이 간편하게 값을 읽을 수 있다
		// Integer result = vs.retNum;
		
		// vs.retNum = 200;
		// retNum 변수는 ValueService의 멤버변수이다
		// 이 멤버변수를 외부에서 값을 변경하는 것은 코드를 매우 위험스럽게 만드는 것이다.
		
		// 좋은 방법은 멤버변수를 private으로 선정하고 getter() method를 통하여 읽기 전용으로 하는 것이 좋다
		Integer result1 = vs.retNum;
		
		Integer result2 = vs.numsRet();
		
		
		
	}
}
