package com.java.two;

import java.util.Random;
import java.util.Scanner;

public class GBBgameRandom {

	public static void main(String[] args) {
		//ö�� VS ��ǻ�� ���������� ���
		
		Scanner sc=new Scanner(System.in);
		Random ranval=new Random();
		final int ����=0;
		final int ����=1;
		final int �� =2;
		
		System.out.println("���� : 0, ���� : 1, �� : 2");
		System.out.println("ö�� �Է�");
		int cnum=sc.nextInt();
		
		int com=ranval.nextInt(3);
		System.out.println("��ǻ�� �Է� : " +com);
		
		boolean cFlag=(cnum==���� && com==��) || (cnum==���� && com==����) 
				|| (cnum==�� && com==����);
		
		boolean bFlag=(cnum==�� && com==����) || (cnum==���� && com==����) 
				|| (cnum==���� && com==��);
		
		if(cFlag) {
			System.out.println("ö�� �¸�");
			}
		
		else if(bFlag) {
			System.out.println("��ǻ�� �¸�");
			}
		else {
		System.out.println("���º�");
}
}
}