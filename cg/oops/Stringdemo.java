package com.cg.oops;

public class Stringdemo {
//string is immutabe,creates duplicate objects on various operations like substr,concat
	public static void main(String[] args) {
		String name=new String("Capgemini");  //strig object
		String name1="CGTechnolgies"; //literal
		System.out.println(name.length());
		System.out.println(name.toLowerCase()); //creates new object
		System.out.println(name.toUpperCase());//"
		System.out.println(name.concat("Technologies"));//
		System.out.println(name.substring(3));
		System.out.println(name.indexOf("e"));
		System.out.println(name1.contains("o"));
		System.out.println(name1.compareTo(name));
		System.out.println(name1.startsWith("C"));
		System.out.println(name1.endsWith("s"));
		System.out.println(name1.isEmpty());
		
		String ss="Capgemini";   //string to stringbuffer
		StringBuffer sb=new StringBuffer(ss);// stringbuffer is mutable,will not create duplicates
	  System.out.println(sb.length());                 // synchronized ,slow
	  System.out.println(sb.insert(3,"XXXXX"));
	  System.out.println(sb.delete(2, 4));
	  System.out.println(sb.append("PVt Ltd"));
	  System.out.println(sb.capacity());
	  sb.ensureCapacity(100);
	  System.out.println(sb.capacity());
	  System.out.println(sb.reverse());
	  String sss=sb.toString();  //sb to string 
	  
	  String ss1="Capgemini";   
		StringBuilder sb1=new StringBuilder(ss1);// stringbuilder is mutable,will not create duplicates
	  System.out.println(sb1.length());                 // not synchronized ,fast
	  System.out.println(sb1.insert(3,"XXXXX"));
	  System.out.println(sb1.delete(2, 4));
	  System.out.println(sb1.append("PVt Ltd"));
	  System.out.println(sb1.capacity());
	  sb1.ensureCapacity(100);
	  System.out.println(sb1.capacity());
	  System.out.println(sb1.reverse());
	  String sss1=sb.toString();  //sb to string 
		
	}

}
