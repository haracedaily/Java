package com.yedam.array;

import java.util.Arrays;

public class Exam06 {

	public static void main(String[] args) {
		//2차원 배열 선언
		int[][] score = new int[2][3];
		//배열 안에 2개의 배열이 있고,
		//그 2개의 배열은 각 배열마다 데이터배열이 3개씩 있다.
		//데이터를 넣는다면 {{1,2,3},{1,2,3}}이런 형태로 만들어진다
		
		//첫번째 배열에 접근하는 반복문
		for(int i=0; i<score.length;i++) {
			//두번째 배열에 접근하는 반복문 score[][]는 오류남
			for(int j=0; j<score[i].length;j++) {
				System.out.println("score["+i+"]["+j+"]="+score[i][j]);
			}
		}
		
		int[][] array = new int[8][9];
		
		for(int i = 2; i<10; i++) {
			for(int j=1; j<10; j++) {
				//2단의 경우
				//2*1 = 2
				//2*2 = 4 ..
				//array[0][0]..~..[0][9]
				//얘네를   2*1.. ~ ..2*9
				array[i-2][j-1]=i*j;
			}
		}
		//배열에 저장된 내용을 출력
		for(int i=0; i<array.length; i++) {
			System.out.print((i+2)+"단 : ");
			System.out.print(Arrays.toString(array[i]));
			//참조타입의 가진 데이터를 한번에 보여주려고 할때 사용(≒배열이 가진 데이터를 출력하는 하나의 방식)
			System.out.println();
		}
		
		
		
	}

}
