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
		
		//부호연산자
		int x = -100;
		
		System.out.println("x : "+x);
		System.out.println("-x : "+(-x));
		
		byte b = 100;
		int result = -b;//연산자를 사용할때마다 int로 변환되어 나와진다.
		
		//논리 부정 연산자(!, not)
		boolean flag = false;
		
		if(!flag){//구문이 1개라면{}빼도 가능 하지만 구문이 2개가 넘는다면 {}
			//의외로 가독성도 떨어지고 조건문이 늘어날때 실수할 가능성도 있어 사용x
			System.out.println("false");
		}
		else {
			System.out.println("true");
		}
		
		//이항 연산자(사칙연산)
		int v1 = 10;
		int v2 = 4;
		System.out.println(v1+v2);
		System.out.println(v1-v2);
		System.out.println(v1*v2);
		
		//나누기 2개 존재
		// / :몫, %:나머지
		System.out.println("/ : "+(v1/v2));
		System.out.println("% : "+(v1%v2));
		
		//비교 연산자
		
		int num1 = 10;
		int num2 = 10;
		
		System.out.println(num1 == num2);// T
		System.out.println(num1 != num2);// F 
		System.out.println(num1 >= num2);// T
		
		//기본 타입의 값을 비교(==)
		//문자열 비교 equals(비교대상)
		
		String str = "test";
		if(str.equals("test")) {
			System.out.println("test입니다.");
		}
		
		//대문자, 숫자 비교하는 연산자
		
		//대문자 확인
		
		int charCode = 'A';//65... //Z = 90
		if(charCode>=65 && charCode<=90) {
			System.out.println("대문자.");
		}
		
		//논리부정연산자+비교연산자
		//'0' ->48; '9' ->57
		//if문 을 활용해 숫자를 표현하려면 charCode>=48 && charCode<=57 문자로 표현된 숫자를 구하는 방법
		if(!(charCode<48)&&!(charCode>57)) {
			System.out.println("0~9 숫자.");
		}
		
		
		
		
		
		
		
	}

}
