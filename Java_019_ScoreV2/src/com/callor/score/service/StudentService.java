package com.callor.score.service;

import com.callor.score.domain.StudentVO;

public interface StudentService {

	public void insertStudent();

	public void loadStudent();

	// 학번을 매개변수로 받고 StudentVO를 return
	// 학번으로 학생정보를 검색하여(조회하여) 학생정보가 담긴 VO를 return하는 method
	public StudentVO getStudent(String num); 

	public void printStudent();
}

