package com.cg.java8;
interface TestInterface 
{   
    void square(int a);   // by default public , abstract 
    // default method  introduced in java8
    default void show() 
    { 
      System.out.println("Default Method Executed"); 
    } 
    // static  method  introduced in java8
    static void disp() {
    	System.out.println("static Method Executed"); 
    }
} 
public class Interfacedemo implements TestInterface {
		   public void square(int a) 
		    {         System.out.println(a*a); 
		    } 
		    public static void main(String args[]) 
		    { Interfacedemo d = new Interfacedemo(); 
		        d.square(4); 
		        d.show(); 
		        TestInterface.disp();
		    } 
}
