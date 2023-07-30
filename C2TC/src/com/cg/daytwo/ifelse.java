package com.cg.daytwo;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter your value:");
		int a=Sc.nextInt();
		if(a%2==0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}
		

	}

}
