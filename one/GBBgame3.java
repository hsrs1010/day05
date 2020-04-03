package com.java.one;

import java.util.Scanner;

public class GBBgame3 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("<<RockPaperSissorsGame>>");
		System.out.println("°¡À§ : 1, ¹ÙÀ§ : 2, º¸ : 3");
		System.out.println("Ã¶¼ö ÀÔ·Â");
		int cnum=sc.nextInt();
		
		System.out.println("¿µÈñ ÀÔ·Â");
		int ynum=sc.nextInt();
		boolean cFlag=(cnum==1 && ynum==3) || (cnum==2 && ynum==1) 
				|| (cnum==3 && ynum==2);
		
		
		//Ã¶¼ö ½Â¸®
		if(cFlag) {
			System.out.println("Ã¶¼ö ½Â¸®");
			}
		
		//¿µÈñ ½Â¸®
		else if(cnum==3 && ynum==1 || cnum==1 && ynum==2 
				|| cnum==2 && ynum==3) {
			System.out.println("¿µÈñ ½Â¸®");
			}
		else {
		System.out.println("¹«½ÂºÎ");
	}
}
}