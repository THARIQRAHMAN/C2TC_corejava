package com.cg.daytwo;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int a = Sc.nextInt();
		do {
			System.out.println(a);
			a--;
			}while(a>0);

		

	}

}
