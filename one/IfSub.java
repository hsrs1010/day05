package com.java.one;

import java.util.Scanner;

public class IfSub {
//4�г��� ����70�� �̻��̸� �հ�
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻÿ�.(0~100)");
		int score=sc.nextInt();//�����Է�
		System.out.println("�г��� �Է��Ͻÿ� 1~4");
		int year=sc.nextInt();//�г��Է�
		
		if(score>=60) {
				if (year!=4) { // score�� 60���̻��̰�, 4�г��� �ƴ� ���
				System.out.println("�հ�");
			}else if (score>=70) { //score�� 70�� �̻��̰�, 4�г��� ���
				System.out.println("�հ�");
			}else {//score�� 70�̸��̰� 4�г��� ���
				System.out.println("���հ�");
			}
		}else {
			System.out.println("���հ�");
		}

	}

}
