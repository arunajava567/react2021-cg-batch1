package com.cg.oops;

// abstract, static ,final, this, super

class Loan9{
	
	void getEmi(double amount) {
		System.out.println("PersonalLoan EMI:"+amount/12);
	}
}
class SalariedPersonalLoan extends Loan9 {
	@Override
	void getEmi(double amount) {
		System.out.println("PersonalLoan EMI for salaried employees:"+(amount/12+500));
	}
}
public class Mride {

	public static void main(String[] args) {
		Loan9 l1=new Loan9();
		l1.getEmi(50000);
		Loan9 l2=new SalariedPersonalLoan();
		l2.getEmi(50000);
        
		
	}

}
