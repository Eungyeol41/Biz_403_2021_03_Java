package com.callor.method;

public class ReQu_ {

	public static void main(String[] args) {

		String strNum = "100";
		Integer intNum = 0;
		
		/*
		 * 무조건 intNum은 0인 상태에서 strNum 값을 정수로 변환하고 변환된 값을 출력
		 * 
		 * if (intNum >= 0 && intNum <= 100) {
				try {
					intNum = Integer.valueOf(strNum);
				} catch (Exception e) {
					// TODO : handle exception
				}
			}
			System.out.println(intNum); 
		 */
		
		
		
		
		// 내가 비교하고자 하는 값을 먼저 만들고
		try {
			intNum = Integer.valueOf(strNum);
			if(intNum < 0 && intNum > 100) {
				System.out.println("범위 초과");
				// return null
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
