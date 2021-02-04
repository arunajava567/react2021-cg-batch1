package com.cg.oops;
class PersonalLoan  extends Loan {
	int id;
	String customerName;
	String typeOfEmployement;
	public PersonalLoan(String customerName, String typeOfEmployement) {
		super(102,87000.00);
		this.customerName = customerName;
		this.typeOfEmployement = typeOfEmployement;
	}
	public void getPersonalLoandetails() {
	//	getLoanDetails();
		//this , super    -> variable
		System.out.println(this.id+"" + super.id+"  "+amount);
		System.out.println(customerName+"  "+typeOfEmployement);
		this.show();
		super.show();
		
	}
	void show() {
		System.out.println("in sub class show" );
	}
}