package com.tnsif.staticexample;

public class Employe{ 
	int eid;
	String name;
	static String company="tns";
	
	Employe(int r ,String n) {
		eid=r;
		name=n;
	}
	public void Employe1(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	void display() {
		System.out.println(eid+""+name+""+company);
	}

}
