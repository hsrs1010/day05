package com.java.one;

import java.util.Scanner;

public class IfSub {
//4학년의 경우는70점 이상이면 합격
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("점수를 입력하시오.(0~100)");
		int score=sc.nextInt();//점수입력
		System.out.println("학년을 입력하시오 1~4");
		int year=sc.nextInt();//학년입력
		
		if(score>=60) {
				if (year!=4) { // score가 60점이상이고, 4학년이 아닌 경우
				System.out.println("합격");
			}else if (score>=70) { //score가 70점 이상이고, 4학년인 경우
				System.out.println("합격");
			}else {//score가 70미만이고 4학년인 경우
				System.out.println("불합격");
			}
		}else {
			System.out.println("불합격");
		}

	}

}
