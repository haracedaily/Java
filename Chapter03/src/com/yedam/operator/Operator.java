package com.yedam.operator;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//증감연산자
		int a = 0;
		System.out.println(a++);
		//실행문이 종료되고 1이 증가, 즉 명령문 돌고나서 1증가해서 돈다
		//시작값을 줄 경우 1씩 증가해야하기 때문에
		System.out.println(++a);
		//실행문이 시작되기 전에 1을 증가, 명령문을 1증가 시키고나서 돈다
	}

}
