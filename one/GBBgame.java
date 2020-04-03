package com.java.one;

import java.util.Scanner;

public class GBBgame {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("가위(1), 바위(2), 보(3)중에 선택");
	int number1=sc.nextInt();
	
	System.out.println("가위(1), 바위(2), 보(3)중에 선택");
	int number2=sc.nextInt();
	
	if(number1==number2) {
	 System.out.println("무승부");
		
	if(number1>2) {
	 System.out.println("패배");
	
	if(number2<number1) {
	 System.out.println("승리");
		}	
}	
}
}
}	