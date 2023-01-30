package com.yedam.loop;

import java.util.Scanner;

public class whileExample {

	public static void main(String[] args) {
		//while문
		int i = 1;
		int sum = 0;
		 //i가 5보다 작을때까지의 합 구하기
		//ex>
//		int sum = 0;
//		for (int i = 0; i < 6; ++i) {
////			sum = sum+i;
//			sum +=i;
//		}
//		System.out.println(sum);
		
		//while문으로 1~5까지의 합 구하기
		while(i<=5) {
			sum= sum+i;
			i++;
		}System.out.println(sum);
		
		//짝수 구하기
		i=0;
		while(i<=100) {
			if(i%2==0) {
				System.out.println(i);
			}i++;
		}
		//무한루프 -반복문을 탈출 못하고 계속 실행되는 상황
//		while(true) {
//			System.out.println("실행중");
//		}
//		System.out.println("end of prog");
		
		//계산기 프로그램
//		
		boolean flag = true;
//		i=0;
//		while(flag) {
//			if(i==50) {
//				flag=false;
//			}
//			i++;
//		}
		
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
			//메뉴 출력
			System.out.println("1. 더하기 | 4.종료");
			System.out.println("입력>");
			//메뉴를 선
			int no = Integer.parseInt(sc.nextLine());
			
			
			switch(no) {
			case 1:
				System.out.println("더하고자 하는 두개의 수 입력>");
				System.out.println("1>");
				int num=Integer.parseInt(sc.nextLine());
				System.out.println("2>");
				int num2=Integer.parseInt(sc.nextLine());
				System.out.println(num+" + "+num2+"의 결과 : "+(num+num2));
				break;
			case 4:
				flag = false;
				System.out.println("종료");
				break;
			default:
				System.out.println("메뉴를 잘못 입력하였습니다.");
				break;
			}
		}
		
		//up & down(1~100) -> 랜덤값 -> 사용자가 맞추는 게임
		//사용자가 입력한 값에 대해서 비교함.
		//사용자가 입력한 값보다 크면 up
		//사용자가 입력한 값보다 작으면 ,down
		//사용자가 몇번만에 값을 맞췄는지 pg 구현
		
		//1. 스캐너
		//2. 랜덤값
		int randomNo=(int)(Math.random()*100)+1;
		int count=0;
		System.out.println("UP & DOWN");
//		boolean test=true;
//		while(test) {
//			System.out.println("숫자>");
//			
//			int inputNo=Integer.parseInt(sc.nextLine());
//			//구현 할 부분(if문)
//		
//			if(inputNo==randomNo) {
//				count++;
//				test=false;
//				System.out.println("정답입니다");
//				break;
//			}
//			else if(inputNo>randomNo) {
//				System.out.println("DOWN");
//				count++;
//			}else {
//				System.out.println("UP");
//				count++;
//			} 
//		}
//		
//		System.out.println(count+"번만에 맞추셨습니다.");
		
		
		flag=true;
		while(flag){
		 System.out.println("숫자>");
			int inputNo=Integer.parseInt(sc.nextLine());
		 System.out.println(randomNo);
		 count++;
		 if(randomNo>inputNo) {
			 System.out.println("up");
		 }else if(randomNo<inputNo) {
			 System.out.println("down");
		 }else if(randomNo==inputNo){System.out.println("정답입니다");
		 break;}
		}
		
		//내가 입력한 문자 출력
		//단, q라는 문자를 입력하면 반복문을 종료하고
		//입력했던 문자를 모두 출력하시오.
		
		//입력 받을 문자열
		//출력용으로 사용할 문자열
		
		String word ="";
		String addWord="";
		flag=true;
		while(flag) {
			System.out.println("문자입력>");
			//내가 입력한 문자열 저장
			addWord=sc.nextLine();
			//q외에 데이터를 입력.. 데이터를 저장
			//문자열 + 연산
			//입력한 데이터가 q가 아니라면...
			if(!addWord.equals("q")) {
				word += addWord;
			} else {
				flag = false;
				System.out.println("종료");
			}
			//q를 입력한다면... 종료
			
		}
		System.out.println("입력한 문자>"+word);
		
		
		//최대값, 최소값
		
		//1) 최대값
		//최대값을 출력할 수 있는 변수를 지정
		int max =0;
		
		while(true) {
			System.out.println("숫자 입력(종료 99)>");
			int number = Integer.parseInt(sc.nextLine());
			
			if(number ==99) {
				System.out.println("프로그램 종료");
				break;
			}
			//최대값 구하는 로직
			//비교하고자하는 값 > 최대값 =
			if(number>max) {
				max = number;
			}
		}
		System.out.println("최대값 : "+max);
		
		//2) 최소값
		//최소값을 출력할 수 있는 변수를 지정
		int min = 0;
		
		while(true) {
			System.out.println("숫자입력(종료 0)>");
			int number = Integer.parseInt(sc.nextLine());
			
			if(number ==0) {
				System.out.println("프로그램 종료");
				break;
			}
			//최소값을 구하는 로직
			//비교하고자 하는 값<최소값 =
			if(number<min) {
				min = number;
			}
		}
		System.out.println("최소값 : "+min);
		
		
		max = 0;
		min = 0;
		i = 0;
		while(true) {
			System.out.println("숫자입력(종료 99)>");
			int number = Integer.parseInt(sc.nextLine());
			//반복문이 처음 한바퀴를 돌때 시점 가져오기 위해서.
			if(i==0) {
				//내가 처음으로 넣은 데이터가 최대값이며 최소값이라는 가정.
				//10 30 20 5 4 100
				max=number;
				min=number;
		}
			//반복문이 몇번 돌았는지 확인하기 위한 구문
		i++;
		if(number ==99) {
			System.out.println("프로그램 종료");
			break;
		}
		//최대값 구하는 로직
		//비교하고자하는 값 > 최대값 =
		if(number>max) {
			max = number;
		}
		//최소값 구하는 로직
		//비교하고자 하는 값(입력값) < 최소값
		if(number<min) {
			min = number;
		}
		}
		
		
	}

}
