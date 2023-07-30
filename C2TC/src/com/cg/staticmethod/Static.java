package com.cg.staticmethod;

public class Static {
	static int a =3;
	Static(){
		a = 9;
		System.out.println("The value change as "+a);
		
	}
	static {
		System.out.println("Static Block");
		System.out.println("The value change as "+a);
	}
	static void Display() {
		a=6;
		System.out.println("Display method");
		System.out.println(a);
	}

}
