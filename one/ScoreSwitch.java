package com.java.one;

import java.util.Scanner;

public class ScoreSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char grade;
		System.out.println("점수입력(0~100)");
		int score=sc.nextInt();
		
		int jumsu=score/10;
//				System.out.println("jumsu : "+ jumsu);
		
		switch (jumsu) {
		case 10:
		case 9:
			grade='A';
			break;
			
		case 8:
			grade='B';
			break;
			
		case 7:
			grade='C';
			break;
			
		case 6:
			grade='D';
			break;
			
//		case 5:
//		case 4:
//		case 3:
//		case 2:
//		case 1:		
//		case 0:
//			grade='F';
//			break;50
			
		default:
			grade='F';
			break;
		}
		System.out.println("당신의 학점은 "+grade +"입니다.");
	}

}
