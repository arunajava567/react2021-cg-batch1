package com.cg.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class A  {
	
	void show(int a ) throws  InterruptedException ,IOException
	{
          Thread.sleep(5000);  //compiled time , checked 
		
		//FileReader f1=new FileReader("e:\\abc.txt");//checked 
	}
	
}



public class Ex2  extends A{

	 void show(int a) throws  InterruptedException ,FileNotFoundException
	{
		Thread.sleep(5000);  //compiled time , checked 
		
		FileReader f1=new FileReader("e:\\abc.txt");//checked 
		
	}
	
	public static void main(String[] args) //throws  InterruptedException ,FileNotFoundException
	{  Ex2 e1=new Ex2();
		
		try {
			e1.show(5);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
