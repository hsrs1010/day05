package com.java.one;

import java.util.Scanner;

public class GBBgame4 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		//���� ���� �� ���ڸ� ���ڷ� �ν��ϱ����� ����
		final int ����=1;
		final int ����=2;
		final int �� =3;
		
		System.out.println("<<RockPaperSissorsGame>>");
		System.out.println("���� : 1, ���� : 2, �� : 3");
		System.out.println("ö�� �Է�");
		int cnum=sc.nextInt();
		
		System.out.println("���� �Է�");
		int ynum=sc.nextInt();
		
		boolean cFlag=(cnum==���� && ynum==��) || (cnum==���� && ynum==����) 
				|| (cnum==�� && ynum==����);
		
		boolean yFlag=(cnum==���� && ynum==��) || (cnum==���� && ynum==����) 
				|| (cnum==�� && ynum==����);
		
		
		//ö�� �¸�
		if(cFlag) {
			System.out.println("ö�� �¸�");
			}
		
		//���� �¸�
		else if(yFlag) {
			System.out.println("���� �¸�");
			}
		else {
		System.out.println("���º�");
	}
}
}