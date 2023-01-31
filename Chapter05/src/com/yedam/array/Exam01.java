package com.yedam.array;

public class Exam01 {

	public static void main(String[] args) {
		int[] intAry = {1,2,3,4,5,6};
		System.out.println(intAry);
		//int[] intAry = new int[6];
		//intAry[0] = 1;
		//intAry[1] = 2;...
		//intAry[5] = 6;
		//인덱스는 길이 - 1 의 값이 최대 why? 시작이 0이라서
		
		String[] strAry = new String[10];
		int[] intAry2;
		
		intAry = new int[5];
		System.out.println(intAry.length);
		strAry = new String[]{"1","2","3"};		
		
		int[] scores = {83,90,87};
		System.out.println("scores 첫번째 값 : " + scores[0]);
		System.out.println("scores 마지막 값 : " + scores[2]);
		scores[2] = 100;
		System.out.println("scores 변경된 마지막 값 : "+scores[2]);
		
		//반복문과 배열
		//총 합계
		int sum = 0;
		
		for(int i=0; i<3;i++) {
			sum += scores[i];
			System.out.println(scores[i]);
		}
		System.out.println("총 합계 : "+sum);
		System.out.println("평균 점수 : "+(sum/3));
		
		//new 연산자를 활용해서 배열 만들기
		//1)
		int[] point;
		point = new int[] {83,90,87};
		sum=0;
		for(int i=0; i<3; i++) {
			sum = sum + point[i];
		}
		System.out.println("총 합계 : "+sum);
		
		
		//2)
		int[] arr1 = new int[3];
		
		for(int i=0;i<3; i++) {
			System.out.println("arr1["+i+"] : " + arr1[i]);
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		//arr1 = new int[] {10,20,30};
		for(int i=0;i<3; i++) {
			System.out.println("arr1["+i+"] : " + arr1[i]);
		}
		
		//실수형 배열(double)
		//3)
		double[] arr2 = new double[3];

		
		for(int i=0;i<3; i++) {
			System.out.println("arr2["+i+"] : " + arr2[i]);
		}
		
//		arr2 = new double[] {0.1,0.2,0.3};
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;		
		for(int i=0;i<3; i++) {
			System.out.println("arr2["+i+"] : " + arr2[i]);
		}
		
		//문자열 배열 생성
		String[] arr3 = new String[3];
		
		for(int i=0;i<3; i++) {
			System.out.println("arr3["+i+"] : " + arr3[i]);
		}
//		arr3 = new String[] {"1월", "2월","3월"};
		arr3[0]="1월";
		arr3[1]="2월";
		arr3[2]="3월";
		for(int i=0;i<3; i++) {
			System.out.println("arr3["+i+"] : " + arr3[i]);
		}
		
		
		
		
		
	}

}
