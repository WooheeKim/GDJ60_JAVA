package com.woo.s3.array;

public class Array3 {

	public static void main(String[] args) {
		// 변수에는 하나의 변수만 넣을 수 있고, 같은 데이터 타입만 대입 가능
		int num = 1; // primitive type, 지역변수
		String name = "IU"; // String = primitive type (X), reference type (O), 지역변수
		int [] ar1 = {1,2,3}; // reference type, 지역변수, 참조타입
		int [] ar2 = {5,6,7,8};
		// 배열은 한 번 만들어진 크기는 줄이거나 늘릴 수 없음
		
		// 얕은 복사
		ar1=ar2;
		
		ar2=ar1;
		
		System.out.println(ar1.length);
		System.out.println(ar2.length);
		
		System.out.println("=======================");
		for(int i=0;i<ar1.length;i++) {
			System.out.println(ar1[i]);
		}
		System.out.println("=======================");
		for(int i=0;i<ar2.length;i++) {
			System.out.println(ar2[i]);
		}
	}
}
