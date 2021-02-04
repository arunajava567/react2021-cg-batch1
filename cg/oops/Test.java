package com.cg.oops;
class Account{
	static String bname="ICICIBank";
	//attrbutes( state) 
	int accNumber;
	String customerName;
	double balance;
	//constructor initialization
	Account() {
		 accNumber=101;
		 customerName="user";
		 balance=1000.00;
	}
	//parameterized 
	 Account(int accNumber, String customerName, double balance) {
		this.accNumber = accNumber;
		this.customerName = customerName;
		this.balance = balance;
	}
	 Account(int accNumber) {
		//this("user5");
		this.accNumber = accNumber;
	}
	
	 Account(String customerName) {
	 //   this(); //courrent class empty constructor called 
		this.customerName = customerName;
	}
	 Account(int accNumber, String customerName) {
		this.accNumber = accNumber;
		this.customerName = customerName;
	}
	//method or function, behavior 
	public void deposit(int amount) {
		balance+=amount;
	}
     public void withdraw(int amount ) {
    	 balance-=amount;
  	}
    public double   getBalance() {
    	int interest=0;  //local variable, should be initialized
    	System.out.println(bname);
    	return balance+interest;
    }
   static public void getAddress() {
    	System.out.println(" ICICIBank,Madhapur,Hitechcity,Hyderabad");
    }
}
public class Test {
	public static void main(String[] args) {
		//realtime entity , to access members of class
		System.out.println(Account.bname);  //before object creation, class creation
		Account account=new Account(110); //refreence, object 
		Account account1=new Account(103,"User3",5000.00);
		Account account2=new Account("User4");
		//account2.balance=60000.00;
		int x=20;
		System.out.println(Account.bname+"  "+account.accNumber  +"  "+account.customerName   +"  "+account.balance);
		System.out.println(account1.bname+"  "+account1.accNumber  +"  "+account1.customerName   +"  "+account1.balance);
		System.out.println(account2.bname+"   "+account2.accNumber  +"  "+account2.customerName   +"  "+account2.balance);
		account.deposit(2500);
		System.out.println(account.getBalance());
		account.withdraw(1000);
		System.out.println(account.getBalance());		
		account1.deposit(300);
		Account.getAddress();
		account.getAddress();
		System.gc(); //trigger gc
	}
}
