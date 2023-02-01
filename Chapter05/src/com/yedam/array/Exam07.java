package com.yedam.array;

public class Exam07 {

	public static void main(String[] args) {
		//String배열 | 객체로써의 문자열과 배열로써의 문자열 구문
		String[] strArray = new String[3];
		strArray[0] = "yedam";
		strArray[1] = "yedam";
		strArray[2] = new String("yedam");
		//객체를 참조하는 배열 형태<-string으로 객체를 참조하여 하나로 묶어 저장함.//그냥 배열 특징아닌가..?
		System.out.println(strArray[0]==strArray[1]);//true
		System.out.println(strArray[1]==strArray[2]);//false
		System.out.println(strArray[0].equals(strArray[2]));//true
		
		
		//배열의 복사
		int[] oldArray = {1,2,3};
		int[] newArray = new int[5];
		
		for(int i=0;i<oldArray.length;i++) {
			newArray[i] = oldArray[i];
		}//옮길때 서로 0~2까지만 옮겨짐
		
		for(int i=0; i<newArray.length; i++) {
			System.out.println(newArray[i]);
		}
		for(int var :newArray) {
			System.out.println(var);
		}
		
		int[] oldArray2 = {1,2,3,4,5,6,7};
		int[] newArray2 = new int[10];
		System.arraycopy(oldArray2, 0, newArray2, 2, oldArray2.length);
		
		for(int i=0; i<newArray2.length;i++) {
			System.out.println("\n"+newArray2[i]);
		}
		
		for(int temp : newArray2) {
			System.out.print(temp+"\t");
		}
		
	}

}
