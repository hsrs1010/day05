package com.java.two;

import java.util.Random;

public class RdScore {

	public static void main(String[] args) {
		// 2. ������ �������� �Է� �ް� (50~100)
		//A, B, �λ�� �Է� �ް� ABCDF����� �Űܶ�, ����� ������ �ۼ��� ������
		//��ļ����� ���Ͻÿ�
		Random ran=new Random();
		int ranval1=ran.nextInt(51)+50;
		int ranval2=ran.nextInt(51)+50;
		System.out.println("A �л� ���� : " + ranval1 );
		System.out.println("B �л� ���� : " + ranval2);
		
		char grade='F';
		
		if(ranval1>=90 && ranval1<=100) {
			grade='A';
			
		}if (ranval1>=80 && ranval1<=89) {
			grade='B';
			
		}if (ranval1>=70 && ranval1<=79) {
			grade='C';
			
		}if (ranval1>=60 && ranval1<=69) {
			grade='D';
			
		}else if (ranval1<60) {
			grade='F';
		}
			
		System.out.println("A�л��� ������ : "+grade);
		
		if(ranval2>=90 && ranval2<=100) {
			grade='A';
			
		}if (ranval2>=80 && ranval2<=89) {
			grade='B';
			
		}if (ranval2>=70 && ranval2<=79) {
			grade='C';
			
		}if (ranval2>=60 && ranval2<=69) {
			grade='D';
			
		}else if (ranval2<60) {
			grade='F';
		}
			
		System.out.println("B�л��� ������ : "+grade);
		
		
	}

}
