package com.github.vlckoadam.oxidproject;

import java.util.Scanner;

public class OxidProject {

	static String elementX = "C", elementY = "O";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadajte 1. prvok zluceniny");
		elementX = sc.nextLine();
		System.out.println("Zadajte 2. prvok zluceniny");
		elementY = sc.nextLine();
		System.out.println("Ma prvok " + elementY + " oxidacne cislo -2? [ano=a;nie=n]");
		String s0 = sc.nextLine();
		sc.close();
		int on = 0;
		if (s0.equalsIgnoreCase("a") || s0.equalsIgnoreCase("ano"))
			on = -2;
		else on = -1;
		for (int i = 1; i <= 8; i++) {
			calc(on, i);
		}	
	}
	
	public static void calc(int on, int i) {
		if (on == -1) a(i); else b(i);
	}
	private static void b(int i) {
		final int OON = -2;
		int oxidnum = i;
		if (oxidnum >= 1 && oxidnum <= 8) {
			int i1 = Math.abs(OON), i2 = oxidnum;
			int max = 0;
			int toI1 = i1, toI2 = i2;
			if (i1 > i2) max = i1; else max = i2;
			for (; max > 0; max--) {
				if (toI1 % max == 0 && toI2 % max == 0) {
					toI1 /= max; 
					toI2 /= max;
				}
			}
			i1 = toI1;
			i2 = toI2;
			
			System.out.println(oxidnum + " : " + elementX + (i1 != 1? i1 : "")+ elementY + (i2 != 1? i2 : ""));
		}
	}
	
	private static void a(int i) {
		int oxidnum = i;
		if (oxidnum >= 1 && oxidnum <= 8) {
			System.out.println(oxidnum + " : " + elementX + elementY + (oxidnum != 1? oxidnum : ""));
		}
	}
}
