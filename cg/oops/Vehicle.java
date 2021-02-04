package com.cg.oops;
public class Vehicle {
	void show() {
		Loan l=new Loan();    // has a relation, composition
		System.out.println(l.id+"  "+l.amount);
	//	l.show();
		l.getLoanDetails();
		
	}
}
