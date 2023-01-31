package com.yedam.array;

public class Exam05 {

	public static void main(String[] args) {
		//최대값 또는 최소값이 위치하는 인덱스 구하기
		int[] array= {20,50,70,80,30,10,90,100};
		int min=100;
		int max=0;

		//최소값의 인덱스 번호 //향상된 for문 활용시 ≒ JS에서 for( Of ){} 구문과 유사
		for(int var : array) {
			if(var<min) {
				min=var;
			}
		} //최소값 구하기
		for(int i=0;i<array.length;i++) {
			if(array[i]==min) {//인덱스번호가 들어간 배열이 위에서 구한 최소값과 같을 경우-> i의 값을 출력해주세요~하는 부분이에요
				System.out.println("최소값은 인덱스번호는 "+i+" 최소값은 "+min);
				break;
			}
			}
		/*
		 * int max = array[0];
		 * int maxIndex = 0;
		 * array[0] ->첫번째 데이터 출력
		 * for(int i =0; i<array.length; i++){
		 * if(array[i]>max){
		 * max=array[i];
		 * maxIndex =i;
		 * }
		 * }
		 * System.out.print("최대값의 인덱스 : "+maxIndex);
		 */
		//최대값의 인덱스 번호
		for(int var : array) {
			if(var>min) {
				max=var;
			}
			
		}for(int i=0;i<array.length;i++) {
			if(array[i]==max) {
				System.out.println("최대값은 인덱스번호는 "+i+" 최대값은 "+max);
				break;
			}
			}
		

	}

}
