package com.java.one;

import java.util.Scanner;

public class GBBgame3 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("<<RockPaperSissorsGame>>");
		System.out.println("���� : 1, ���� : 2, �� : 3");
		System.out.println("ö�� �Է�");
		int cnum=sc.nextInt();
		
		System.out.println("���� �Է�");
		int ynum=sc.nextInt();
		boolean cFlag=(cnum==1 && ynum==3) || (cnum==2 && ynum==1) 
				|| (cnum==3 && ynum==2);
		
		
		//ö�� �¸�
		if(cFlag) {
			System.out.println("ö�� �¸�");
			}
		
		//���� �¸�
		else if(cnum==3 && ynum==1 || cnum==1 && ynum==2 
				|| cnum==2 && ynum==3) {
			System.out.println("���� �¸�");
			}
		else {
		System.out.println("���º�");
	}
}
}