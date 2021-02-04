package com.cg.oops;


//java.lang
/*class Person {
	
}

class Employee extends Person {
	
}*/
public class WrapperDemo {

	public static void main(String[] args) {
		
		//Person p=new Employee();  //implicit
		
		//Employee e=(Employee)new Person(); //explicit
		
		

		
		//int,shor,byte.....
		//java.lang
		//Integer, Byte, Short,Long,Float,Double, Character,Boolean
		int a=10;  //value
		Integer aobj=new Integer(10); //objewrapper classesct ....
		
		String age="30";
		int age1=Integer.parseInt(age);
		
		String Salary="8978675.878";
		double sal=Double.parseDouble(Salary);
		
		int x=90;
		double x1=435435.234;
		int y1=(int)x1;// explicit, narrowing , downcasting
		double y=x;  // integer to double    upcasting , widen,implicit
	   System.out.println(x	+"  "+y);
		
		System.out.println(System.currentTimeMillis());
		System.gc();
		System.exit(0);
	}

}
