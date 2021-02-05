package com.cg.exceptions;
public class Ex1 {
	public static void main(String[] args) {
		try {
			try {
				int a=10/0;
				System.out.println(a);
			} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int a1[]= {4,5,6};
			System.out.println(a1[4]);
		} 

		
		catch (ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.out.println(e);
			//System.out.println(e.getMessage());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Thank you");
		}
}
