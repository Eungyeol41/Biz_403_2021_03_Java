package com.callor.apps.model;

/*
 * 주소록 관리를 위한 프로젝트를 수행하기 위해 주소록 데이터를 저장할 클래스를 설계하기
 * 
 * 이름, 전화번호, 주소, e-mail, 관계, 나이, 카카오톡, 인스타그램.....
 * 
 * 이름, 휴대전화, e-mail, 나와의 관계
 * 
 */

/*
 * V0 클래스
 * Value Object : 데이터를 저장하는 용도의 객체
 * Dto (Data Transfer Object)
 */
public class AddressV0 {
	
	/*
	 * 추상화 과정을 거쳐 간추려진 데이터를 저장할 변수 선언
	 */
	
	public String name;
	public String cellPhone;
	public String email;
	public String chain;
	public String address;

	
}
