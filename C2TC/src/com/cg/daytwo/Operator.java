package com.cg.daytwo;
import java.util.*;
public class Operator {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the 1st value:");
		int a = Sc.nextInt();
		System.out.print("Enter the 2nd value:");
		int b = Sc.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a<<b);
		System.out.println(a>>b);
		System.out.println(a++);
		System.out.println(b++);
		System.out.println(++a);
		System.out.println(++b);
	}

}
