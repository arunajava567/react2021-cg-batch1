package com.cg.oops;
//reusability
//abse , super, parent
//non sub class


//derived, sub, child     -- inheritance - is a 

public class Inheritancedemo {
	public static void main(String[] args) {
		Loan l=new Loan(101,80000.00);
		l.getLoanDetails();
		PersonalLoan pl=new PersonalLoan("ram","salaried");
		pl.getLoanDetails();
		pl.getPersonalLoandetails();

	}

}
