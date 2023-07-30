package com.cg.daythree;

public class constructor {
	String name;
	int id;
	int age;
	long mobile;
	constructor(){
		name = "Kathirvel";
		id = 101;
		age = 20;
		mobile = 887058986;
	}
	constructor(String name,int id,int age,long mobile){
		this.name=name;
		this.id=id;
		this.age=age;
		this.mobile=mobile;
	}
	void display() {
		System.out.println("Student name:"+name);
		System.out.println("Student id:"+id);
		System.out.println("Student age:"+age);
		System.out.println("Student mobile:"+mobile);
	}

}
