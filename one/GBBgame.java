package com.java.one;

import java.util.Scanner;

public class GBBgame {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("����(1), ����(2), ��(3)�߿� ����");
	int number1=sc.nextInt();
	
	System.out.println("����(1), ����(2), ��(3)�߿� ����");
	int number2=sc.nextInt();
	
	if(number1==number2) {
	 System.out.println("���º�");
		
	if(number1>2) {
	 System.out.println("�й�");
	
	if(number2<number1) {
	 System.out.println("�¸�");
		}	
}	
}
}
}	