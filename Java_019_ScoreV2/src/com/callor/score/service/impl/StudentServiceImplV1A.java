package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.domain.StudentVO;
import com.callor.score.service.StudentService;

public class StudentServiceImplV1A implements StudentService {

	protected List<StudentVO> studentList;
	protected String studentFile;
	
	protected final int 학번 = 0;
	protected final int 이름 = 1;
	protected final int 학년 = 2;
	protected final int 반 = 3;
	protected final int 학과 = 4;
	protected final int 주소 = 5;
	
	/*
	 * new StudentServiceImplV1() 생성자를 호출하여 객체를 생성하려고 하면 
	 * 	고정된 파일이름("src/com/callor/score/student.txt")을 사용하여 파일을 읽을 수 있도록 할 예정이다
	 * 
	 * 생성자에서는 new StudentServiceImplV1("파일명")의 생성자 method를 다시 호출하는 구조가 된다
	 */
	public StudentServiceImplV1A() {
		
		// 여기에서 다음의 생성자 method를 또 한 번 호출한다
		// new StudentServiceImplV1A("src/com/callor/score/student.txt");
		this("src/com/callor/score/student.txt");
	}
	
	public StudentServiceImplV1A(String fileName) {
		this.studentFile = fileName;
		studentList = new ArrayList<StudentVO>();
		// 클래스를 객체로 생성할 때 method를 호출하여 데이터를 사용하도록 준비해 달라
		this.loadStudent();
	}
	
	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub
		
	}

	/*
	 * student.txt 파일에서 학생정보를 읽어 studentList에 데이터 준비하기
	 */
	@Override
	public void loadStudent() {
		// TODO Auto-generated method stub

		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(this.studentFile);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String reader = buffer.readLine();
				// 파일로부터 읽은 값이 null
				//  EOF
				if(reader == null) break;
				
				String[] sts = reader.split(":");
				StudentVO vo = new StudentVO();
				vo.setNum(sts[학번]);
				vo.setName(sts[이름]);
				vo.setGrade(sts[학년]);
				vo.setDept(sts[학과]);
				vo.setAddress(sts[주소]);
				
				// Debugin code
				System.out.println(vo.toString());
				studentList.add(vo);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(this.studentFile +" 파일이 없습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일을 읽는 동안 문제 발생!");
		}
	}

	@Override
	public StudentVO getStudent(String num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub

		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t학과\t학년\t주소");

		/*
		 * 배열을 사용하여 for() 반복문을 구현할 때는 배열.length 속성을 직접 반복문의 조건으로 설정한다 
		 * 		i < 배열.length
		 * 
		 * List 객체는 특성 상 수시로 데이터의 개수가 변경된다
		 * List에 담긴 개수를 알려주는 size() method는 호출될 때마다 List에 담긴 데이터 개수를 다시 헤아리는 코드가 실행된다
		 * 
		 * for() 반복문 내에서 i < List.size() 코드를 사용하면 for() 반목문이 반복되는 동안 계속해서 개수를 헤아리게 된다
		 * 데이터의 개수가 몇 개 안 될 때는 큰 문제가 없지만 데이터 개수가 많아지면 그만큼 성능이 떨어지게 된다
		 * 
		 * list 전체를 for() 반복문을 사용하여 순회할 때는 먼저 size() 값을 int 형 변수에 담아놓고 시작하자
		 */
		int nSize = studentList.size();
		for(int i = 0; i < nSize; i++) {
			StudentVO vo = studentList.get(i);
			
			System.out.print(vo.getNum() +"\t");
			System.out.print(vo.getName() +"\t");
			System.out.print(vo.getGrade() +"\t");
			System.out.print(vo.getDept() +"\t");
			System.out.print(vo.getAddress() +"\n");
		}// end for
		System.out.println("=".repeat(80));
		
	} // end printStudent

}
