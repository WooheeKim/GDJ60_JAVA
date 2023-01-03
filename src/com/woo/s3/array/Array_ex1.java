package com.woo.s3.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 학생 수 입력 받음
		// 2. 학생의 수 만큼 이름을 입력
		// 3. 학생의 수 만큼 학생의 번호, 국어, 영어, 수학 입력받음
		// ex) 학생의 번호 :
		//	   학생의 국어 :
		//	   학생의 영어 :
		//     학생의 수학 :
		// 	총점 평균 계산
		
		// 모든 학생의 정보 출력
		// 이름 번호 국어 영어 수학 총점 평균
// ex)	// IU   6  97  98 99  ??  ??
		
		System.out.println("학생의 수를 입력해주세요 : ");
		int count = sc.nextInt();
		String [] names = new String[count];
		int [] nums = new int [names.length];
		int [] kors = new int [names.length];
		int [] engs = new int [names.length];
		int [] maths = new int [names.length];
		int [] totals = new int [names.length];		
		double [] avgs = new double[names.length];
			
		for(int i=0;i<names.length;i++) {
			System.out.println(i+1+" 번째 이름을 입력해주세요 : ");
			names[i] = sc.next();
		}
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+"학생의 번호 : ");
			nums[i] = sc.nextInt();
			System.out.println(names[i]+"학생의 국어 : ");
			kors[i] = sc.nextInt();
			System.out.println(names[i]+"학생의 영어 : ");
			engs[i] = sc.nextInt();
			System.out.println(names[i]+"학생의 수학 : ");
			maths[i] = sc.nextInt();
			totals[i] = kors[i]+engs[i]+maths[i];
			avgs[i] = totals[i]/3.0;
		}
		
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+"\t");
			System.out.print(nums[i]+"\t");
			System.out.print(kors[i]+"\t");
			System.out.print(engs[i]+"\t");
			System.out.print(maths[i]+"\t");
			System.out.print(totals[i]+"\t");
			System.out.println(avgs[i]+"\t");
		}
		

	}

}
