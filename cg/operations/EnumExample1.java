package com.cg.operations;
import java.util.*;

enum OperatingSystems 
{
    windows, unix, linux, macintosh
}

enum DaysOfWeek {
	Monday,Tuesday,Wednesday,thursday,Friday,Saturday,Sunday
}

public class EnumExample1 
{   public static void main(String args[])
    {
        OperatingSystems os;
        os = OperatingSystems.unix;

		switch(os) 
		{
            case windows:	System.out.println("You chose Windows!");
							break;
            case unix:		System.out.println("You chose Unix!");
							break;
			case linux:		System.out.println("You chose Linux!");
							break;
			case macintosh:	System.out.println("You chose Macintosh!");
							break;
			default:		System.out.println("I don't know your OS.");
        }
		
		
		DaysOfWeek days;
		days=DaysOfWeek.Sunday;
		
		
		
		switch (days) {
		case Sunday : System.out.println("Holiday"); break;
		default : System.out.println("wrong data");
		}
    }
}