package com.java.two;

import java.util.Random;
import java.util.Scanner;

public class GBBgameRandom {

	public static void main(String[] args) {
		//철수 VS 컴퓨터 가위바위보 대결
		
		Scanner sc=new Scanner(System.in);
		Random ranval=new Random();
		final int 가위=0;
		final int 바위=1;
		final int 보 =2;
		
		System.out.println("가위 : 0, 바위 : 1, 보 : 2");
		System.out.println("철수 입력");
		int cnum=sc.nextInt();
		
		int com=ranval.nextInt(3);
		System.out.println("컴퓨터 입력 : " +com);
		
		boolean cFlag=(cnum==가위 && com==보) || (cnum==바위 && com==가위) 
				|| (cnum==보 && com==바위);
		
		boolean bFlag=(cnum==보 && com==가위) || (cnum==가위 && com==바위) 
				|| (cnum==바위 && com==보);
		
		if(cFlag) {
			System.out.println("철수 승리");
			}
		
		else if(bFlag) {
			System.out.println("컴퓨터 승리");
			}
		else {
		System.out.println("무승부");
}
}
}