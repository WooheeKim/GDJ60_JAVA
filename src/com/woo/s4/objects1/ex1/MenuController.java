package com.woo.s4.objects1.ex1;

import java.util.Scanner;

public class MenuController {
	// start
	// 1. 등록
	// 2. 수정
	// 3. 삭제
	// 4. 종료
	public void start() {
	Scanner sc = new Scanner(System.in);
	boolean check = true;
	StudentInput si = new StudentInput();
	StudentView sv = new StudentView();
	
	System.out.println("학생수를 입력하세요 : ");
	int count = sc.nextInt();
	Student [] students = new Student[count];

	while(check) {
		System.out.println("1.학생 정보 입력  2.학생 검색 정보 출력  3.학생의 전체 정보 출력  4.학생추가  5.종료");
		int select = sc.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("학생 정보 입력");
			si.setAllStudents(students);
			break;
		case 2:
			System.out.println("학생 검색 정보 출력");
			Student student = si.findStudent(students);
			if(student != null) {
				sv.view(student);
			} else {
				System.out.println("검색한 정보가 없습니다.");
			}
			break;
		case 3:
			System.out.println("학생의 전체 정보 출력");
			sv.view(students);
			break;
		case 4:
			System.out.println("학생 추가");
			students  = si.setStudent(students);
			break;
		default:
			System.out.println("종료되었습니다.");
			check = false;
			break;
		}
	}
    }
}
