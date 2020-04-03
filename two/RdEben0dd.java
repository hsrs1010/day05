package com.java.two;

import java.util.Random;

public class RdEben0dd {
	public static void main(String[] args) {
		//1. ·£´ı°ªÀ» ÃßÃâÇÏ¿© Â¦¼öÀÎÁö È¦¼ö ÀÎÁö Ç¥Çö
	
		Random ran=new Random();
		int ranval=ran.nextInt(300)+1;
		
		if (ranval%2==0){
		System.out.println("·£´ı°ªÀº : "  + ranval);
		System.out.println("·£´ı°ªÀº :Â¦¼ö");
		}else { 
		System.out.println("·£´ı°ªÀº : " + ranval);
		System.out.println("·£´ı°ªÀº : È¦¼ö");
		}
}
}