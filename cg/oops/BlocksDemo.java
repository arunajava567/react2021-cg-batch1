package com.cg.oops;

public class BlocksDemo {
   static{  //ananymous blocks
		System.out.println("sttaic block");  //once 
		disp();
	}
   BlocksDemo() {
	   System.out.println("in constructor");
   }
   {   //executes before constructor 
	   System.out.println("instance block");
	   show() ;
   }
   void show() {
	   
   }
   static void disp() {
	   
   }

	public static void main(String[] args) {
		
		System.out.println("start main");
		BlocksDemo b=new BlocksDemo();
		BlocksDemo b1=new BlocksDemo();
		

	}

}
