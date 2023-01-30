package com.yedam.loop;

public class ControlExample {

	public static void main(String[] args) {
		//break; continue;
		//랜덤값 중에서 6이 나오면 반복문 멈추는 것
		while(true) {
			int num=(int)(Math.random()*6)+1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}

		//두 수의 합이 4인 수를 찾으시오.
		//1~10 사이
		
		for(int i=0;i<=10;i++) {
			for(int j=0;j<=10;j++) {
				if(i+j==4) {
					System.out.println("i: "+i+" j: "+j+" = "+(i+j));
					break;
				}
			}
		}
		
		//label을 활용한 break
		
		Outter : for(char upper='A'; upper<='z';upper++) {
			for(char lower='a';lower<='z';lower++) {
				System.out.println(upper+" - "+lower);
				if(lower =='g') {
					break Outter;
				}
			}
		}
		
		//continue ; continue 아래 내용을 실행하지 않고 반복문 실행
		//짝수 일때 sysout하지 않으니 홀수만 출력하게 된다.
		for(int i = 0;i<=10;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		
		
	}

}
