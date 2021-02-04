package com.cg.oops;
class A
{ int a;
	A() {
		a=10;
	}
	A(int a) {
		this.a=a;
	}
}

class B extends A {
	int b;
	B()
	{  super();
      b=20;
	}
	B(int a,int b)
	{  super(a);
		this.b=b;
	}
	void show() {
		System.out.println(a+"  "+ b);
	}
	
}
public class ThisSuperDemo {

	public static void main(String[] args) {
		B b=new B();
		b.show();
		B b1=new B(200,300);
		b1.show();

	}

}
