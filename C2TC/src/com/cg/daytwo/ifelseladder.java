package com.cg.daytwo;

import java.util.Scanner;

public class ifelseladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("To check validity Enter your age:");
		int n = Sc.nextInt();
		if(n>50) {
			System.out.println("Not Allowed");
			
		}
		else if(n>5 && n<12) {
			System.out.println("Allowed to go in Childerens Group");
		}
		else if(n>12 && n<=18) {
			System.out.println("Allowed to go in Adult Group");
		}
		else if(n>18) {
			System.out.println("Allowed to go in Mens group");
		}
		else {
			System.out.println("Not Allowed");
		}

	}

}
