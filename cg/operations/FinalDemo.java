package com.cg.operations;
//final variable cannot be modified
//final method cannot be overriden
//final class canot be inherited  public , private,protected, default 
//final , static , volatile, transcient, sunchronized, strictfp, abstract 
class Scholar {
	//final
	void dispdetails() {
		System.out.println("in Scholar");
	}	
}
class ScienceScholar extends Scholar {
	//final 
	int x=10;
   void dispdetails() {
	   System.out.println("in Science Scholar");
	   System.out.println(x++);
	}
}
public class FinalDemo {
	public static void main(String[] args) {
	}
}
