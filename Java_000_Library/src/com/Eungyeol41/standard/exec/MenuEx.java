package com.Eungyeol41.standard.exec;

import java.util.ArrayList;
import java.util.List;

import com.Eungyeol41.standard.MenuService;
import com.Eungyeol41.standard.impl.MenuServiceImplV1;

public class MenuEx {

	public static void main(String[] args) {
		
		List<String> menuList = new ArrayList<String>();
		menuList.add("성적 입력");
		menuList.add("성적 리스트 출력");
		menuList.add("성적 저장");
		menuList.add("성적 정보 이메일 보내기");
		menuList.add("기타 여러가지");
		menuList.add("학생 정보 입력");
		
		// new MenuServiceImplV1()처럼 호출할 수 없다
		// WHY? : 생성자에 매개변수를 선언했기 때문에
		MenuService menuService = new MenuServiceImplV1("빛고을 고교 성적처리", menuList);
		
		Integer menu = menuService.selectMenu();
		System.out.println(menu);
	}
}
