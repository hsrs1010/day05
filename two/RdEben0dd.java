package com.java.two;

import java.util.Random;

public class RdEben0dd {
	public static void main(String[] args) {
		//1. �������� �����Ͽ� ¦������ Ȧ�� ���� ǥ��
	
		Random ran=new Random();
		int ranval=ran.nextInt(300)+1;
		
		if (ranval%2==0){
		System.out.println("�������� : "  + ranval);
		System.out.println("�������� :¦��");
		}else { 
		System.out.println("�������� : " + ranval);
		System.out.println("�������� : Ȧ��");
		}
}
}