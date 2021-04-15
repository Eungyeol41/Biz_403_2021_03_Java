package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.domain.StudentVO;
import com.callor.score.service.StudentService;

public class StudentServiceImplV1 implements StudentService{
	
	protected List<StudentVO> studentList;
	
	protected final int 학번 = 0;
	protected final int 이름 = 1;
	protected final int 학년 = 2;
	protected final int 반 = 3;
	protected final int 학과 = 4;
	protected final int 주소 = 5;
	
	public StudentServiceImplV1() {
		studentList = new ArrayList<StudentVO>();
		this.loadStudent();
		
	}

	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadStudent() {
		// TODO Auto-generated method stub
		
		String studentFile = "src/com/callor/score/student.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);
			
			while (true) {
				String reader = buffer.readLine();
				if (reader == null) break;
				String students[] = reader.split(":");
				
				StudentVO vo = new StudentVO();
				vo.setNum(students[학번]);
				vo.setName(students[이름]);
				vo.setGrade(students[학년]);
				vo.setDept(students[학과]);
				vo.setAddress(students[주소]);
				studentList.add(vo);
			} // end while
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // end try - catch
	} // end loadStudent

	@Override
	public StudentVO getStudent(String num) {
		// TODO 학번으로 학생 조회하여 학생정보 return
		
		StudentVO student = this.getStudent(num);
		
		for(int i = 0; i < studentList.size(); i++) {
			String strNum = student.getNum();
			if(strNum.equals(studentList.add(student))) {
				return student;
			} // end if
		} // end for
		return null;
	} // end getStudent

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		
	}

	
}
