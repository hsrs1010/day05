package com.java.one;

import java.util.Scanner;

public class GBBgame2 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("<<RockPaperSissorsGame>>");
		System.out.println("���� : 1, ���� : 2, �� : 3");
		System.out.println("ö�� �Է�");
		int cnum=sc.nextInt();
		
		System.out.println("���� �Է�");
		int ynum=sc.nextInt();
		
		//ö�� �¸�
		if(cnum==1 && ynum==3) {
			System.out.println("ö�� �¸�");
		}else if(cnum==2 && ynum==1){
			System.out.println("ö�� �¸�");
		}else if(cnum==3 && ynum==2) {
			System.out.println("ö�� �¸�");
	}
		//���� �¸�
		else if(cnum==3 && ynum==1) {
			System.out.println("���� �¸�");
		}else if(cnum==1 && ynum==2){
			System.out.println("���� �¸�");
		}else if(cnum==2 && ynum==3){
			System.out.println("���� �¸�");
			
	}else {
		System.out.println("���º�");
	}
}
}