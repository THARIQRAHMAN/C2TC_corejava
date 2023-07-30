package com.cg.dayfour.accessmethod;

public class AccessMethod1 {
	public String name = "Samar";
	private int id = 20;
	protected String mail = "Samar@gmail.com";
	long mobile = 975047419;
	
	void display1() {
		System.out.println("default");
	}
	public void display2() {
		System.out.println("public");
	}
	private void display3() {
		System.out.println("private");
	}
	protected void display4() {
		System.out.println("Protected");
	}
	
}

	
