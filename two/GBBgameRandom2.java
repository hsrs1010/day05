package com.java.two;

import java.util.Random;
import java.util.Scanner;

public class GBBgameRandom2{

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		
		System.out.println("<<RockPaperSissorsGame>>");
		System.out.println("���� : 1, ���� : 2, �� : 3");
		System.out.println("ö�� �Է�");
		int cnum=sc.nextInt();
		
		System.out.println("�� �Է�");
		int ynum=ran.nextInt(3)+1;
		
		System.out.println("�� ����" + ynum);
		
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
			System.out.println("�� �¸�");
		}else if(cnum==1 && ynum==2){
			System.out.println("�� �¸�");
		}else if(cnum==2 && ynum==3){
			System.out.println("�� �¸�");
			
	}else {
		System.out.println("���º�");
	}
}
}