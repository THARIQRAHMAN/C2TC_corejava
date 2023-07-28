package com.cg.encapsule;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentEntity s = new StudentEntity("10","Kathir","thariq","849383");
		System.out.println(s.toString());
		s.setEmail("samar@gmail.com");
		System.out.println(s.toString());
		s.setId("Id=24");
		System.out.println(s.getId());
		s.setName("name=Kathir");
		System.out.println(s.getName());
		s.setEmail("Email=samar@gmail.com");
		System.out.println(s.getEmail());
		s.setMobile("Mobile=849383");
		System.out.println(s.getMobile());
	}

}
