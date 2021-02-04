package com.cg.oops;
//dynamic , poly, runtime 
public class HousingLoan extends Loan9{
	void getEmi(double amount) {
		System.out.println("Housing Loan EMI:"+(amount/12+1000));
	}
	public static void main(String[] args) {
		Loan9 l=new HousingLoan();
		l.getEmi(90000);

	}

}
