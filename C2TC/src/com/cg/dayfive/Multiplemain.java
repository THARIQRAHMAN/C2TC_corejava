package com.cg.dayfive;

public class Multiplemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple m = new Multiple();
		m.setreg(20); //parent class method
		System.out.println(m.getreg());
		m.setMarks(50); //intermediate sub class method
		System.out.println(m.getMarks());
	}

}
