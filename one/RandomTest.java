package com.java.one;

import java.util.Random;

public class RandomTest {
//임의 추출
	public static void main(String[] args) {
		Random ran=new Random();
		
		int ranval=ran.nextInt(5);// 임의 숫자 추출
		
		System.out.println("임의 추출 값 : " +ranval);
		
		double dval=ran.nextDouble();
		System.out.println("dav1 : " + dval);
		
	}

}
