package com.cg.oops;

public class Mload {
	//static, compiletime  
	void area(int s) {
		System.out.println("square:"+s*s);
	}
	
	void area(int l,int b) {
		System.out.println("recatnagle:"+l*b);
	}
	void area(double b) {
		System.out.println("circle:"+3.142*b*b);
	}

	public static void main(String[] args) {
		Mload m=new Mload();
		m.area(5);
		m.area(6,3);
		m.area(5.89);

	}

}
