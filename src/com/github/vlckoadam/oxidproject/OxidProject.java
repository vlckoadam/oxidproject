/*
MIT License

Copyright (c) 2019 Adam Vlčko

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package com.github.vlckoadam.oxidproject;

import java.util.Scanner;

public class OxidProject {

	static String elementX = "%", elementY = "§";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadajte 1. prvok zluceniny");
		elementX = sc.nextLine();
		System.out.println("Zadajte 2. prvok zluceniny");
		elementY = sc.nextLine();
		System.out.println("Ma prvok " + elementY + " oxidacne cislo -2? [ano=a;nie=n]");
		String s0 = sc.nextLine();
		sc.close();
		int on;
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
		if (i >= 1 && i <= 8) {
			int i1 = Math.abs(OON), i2 = i;
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
			
			System.out.println(i + " : " + elementX + (i1 != 1? i1 : "")+ elementY + (i2 != 1? i2 : ""));
		}
	}
	
	private static void a(int i) {
		if (i >= 1 && i <= 8) {
			System.out.println(i + " : " + elementX + elementY + (i != 1? i : ""));
		}
	}
}
