package com.java.two;

import java.util.Random;
import java.util.Scanner;

public class GBBgameRandom2{

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		
		System.out.println("<<RockPaperSissorsGame>>");
		System.out.println("°¡À§ : 1, ¹ÙÀ§ : 2, º¸ : 3");
		System.out.println("Ã¶¼ö ÀÔ·Â");
		int cnum=sc.nextInt();
		
		System.out.println("ÄÄ ÀÔ·Â");
		int ynum=ran.nextInt(3)+1;
		
		System.out.println("ÄÄ ¼ıÀÚ" + ynum);
		
		//Ã¶¼ö ½Â¸®
		if(cnum==1 && ynum==3) {
			System.out.println("Ã¶¼ö ½Â¸®");
		}else if(cnum==2 && ynum==1){
			System.out.println("Ã¶¼ö ½Â¸®");
		}else if(cnum==3 && ynum==2) {
			System.out.println("Ã¶¼ö ½Â¸®");
	}
		//¿µÈñ ½Â¸®
		else if(cnum==3 && ynum==1) {
			System.out.println("ÄÄ ½Â¸®");
		}else if(cnum==1 && ynum==2){
			System.out.println("ÄÄ ½Â¸®");
		}else if(cnum==2 && ynum==3){
			System.out.println("ÄÄ ½Â¸®");
			
	}else {
		System.out.println("¹«½ÂºÎ");
	}
}
}