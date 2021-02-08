package com.cg.java8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexapp1 {

	public static void main(String[] args) {
		 Pattern p = Pattern.compile("[A-Za-z][a-z]");
		 Matcher m = p.matcher("Capgemini");
		 
		 boolean b = m.matches();
		 System.out.println(b);
		 
		 Pattern pd = Pattern.compile("(\\d+)");
		 boolean valresult=pd.matcher("9878").matches();
		 
		 System.out.println(valresult);
			
		 
	}

}
