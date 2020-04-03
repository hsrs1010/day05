package com.java.two;

import java.util.Random;

public class RdScore {

	public static void main(String[] args) {
		// 2. 점수를 랜덤으로 입력 받고 (50~100)
		//A, B, 두사람 입력 받고 ABCDF등급을 매겨라, 등급의 점수는 작성자 임으로
		//상식선에서 정하시오
		Random ran=new Random();
		int ranval1=ran.nextInt(51)+50;
		int ranval2=ran.nextInt(51)+50;
		System.out.println("A 학생 점수 : " + ranval1 );
		System.out.println("B 학생 점수 : " + ranval2);
		
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
			
		System.out.println("A학생의 학점은 : "+grade);
		
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
			
		System.out.println("B학생의 학점은 : "+grade);
		
		
	}

}
