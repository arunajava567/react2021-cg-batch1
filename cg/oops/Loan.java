package com.cg.oops;
public class Loan {
	 int id;
	//private 
	protected double amount;
	
	public Loan() {		
	}
	public Loan(int id, double amount) {
		super();
		this.id = id;
		this.amount = amount;
	}
	public void getLoanDetails() {
		System.out.println(id+"  "+amount);
	}
	//private 	
	void show() {
		System.out.println("in show" );
	}
}