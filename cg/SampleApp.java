package com.cg;
import java.util.Scanner;
public class SampleApp {
	public static void main(String[] args) {
		//sysout cntl+spacebar    cntl+ + cntl+-
		System.out.println("welcome to Sample java program");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A value");
		// byte,short,int,float,long,double 
		//char ,boolean
		int a=sc.nextInt();
		byte b=sc.nextByte();
		System.out.println(b);
		//conditional 
		if(a>10) {
			System.out.println("within range");
		}
		else
		{  System.out.println("out of  range");
		}
		//looping , iterative   - while , do while , for 
		int y=1;
		while(y<=10)
		{
			System.out.println(y); 
		    y++;
		}
		for(int x=1;x<=5;x++)
			System.out.println(x);
		int marks[]= {56,78,56,78,89,98};
		
		/*for(int s=0;s<marks.length;s++)
			System.out.println(marks[s]);*/
		//enhanced for loop / for each loop
		for(int x: marks)
			System.out.println(x);
		
		
	}
}
