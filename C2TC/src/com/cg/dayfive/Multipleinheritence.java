package com.cg.dayfive;

public class Multipleinheritence {
	private int reg;
	void setreg(int r) {
		this.reg = r;
	}
	int getreg() {
		return reg;
	}

}
class Multiple extends Multipleinheritence{
	private int marks;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	
}
