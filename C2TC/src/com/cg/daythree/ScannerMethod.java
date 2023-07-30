package com.cg.daythree;

import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the student Id: ");
		int id = Sc.nextInt();
		Sc.nextLine();
		System.out.println("Enter the student Name: ");
		String name = Sc.nextLine();
		System.out.println("Student id:"+id);
		System.out.println("Student name:"+name);

	}

}
