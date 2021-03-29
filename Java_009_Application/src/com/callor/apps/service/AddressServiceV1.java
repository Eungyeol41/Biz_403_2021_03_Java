package com.callor.apps.service;

import com.callor.apps.model.AddressV0;

public class AddressServiceV1 {

	/*
	 * name, email, phone 3개의 매개변수를 통해 문자열을 전달 받고 전달받은 문자열을 Console에 출력하기
	 */
	public void printAddress(String name, String email, String phone) {

		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
	}

	public void printAddress(AddressV0 adV0) {
	
	System.out.println(adV0.name);
	System.out.println(adV0.email);
	System.out.println(adV0.chain);
	System.out.println(adV0.address);
	System.out.println(adV0.cellPhone);
	}
}
