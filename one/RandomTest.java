package com.java.one;

import java.util.Random;

public class RandomTest {
//���� ����
	public static void main(String[] args) {
		Random ran=new Random();
		
		int ranval=ran.nextInt(5);// ���� ���� ����
		
		System.out.println("���� ���� �� : " +ranval);
		
		double dval=ran.nextDouble();
		System.out.println("dav1 : " + dval);
		
	}

}
