package com.java.one;

import java.util.Scanner;

public class GBBgame4 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		//가위 바위 보 숫자를 문자로 인식하기위해 고정
		final int 가위=1;
		final int 바위=2;
		final int 보 =3;
		
		System.out.println("<<RockPaperSissorsGame>>");
		System.out.println("가위 : 1, 바위 : 2, 보 : 3");
		System.out.println("철수 입력");
		int cnum=sc.nextInt();
		
		System.out.println("영희 입력");
		int ynum=sc.nextInt();
		
		boolean cFlag=(cnum==가위 && ynum==보) || (cnum==바위 && ynum==가위) 
				|| (cnum==보 && ynum==바위);
		
		boolean yFlag=(cnum==가위 && ynum==보) || (cnum==바위 && ynum==가위) 
				|| (cnum==보 && ynum==바위);
		
		
		//철수 승리
		if(cFlag) {
			System.out.println("철수 승리");
			}
		
		//영희 승리
		else if(yFlag) {
			System.out.println("영희 승리");
			}
		else {
		System.out.println("무승부");
	}
}
}