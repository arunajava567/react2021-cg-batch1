package com.cg.java8;

public class SeedBagExpiry {
	public boolean lengthCheck(String str) {
		boolean result=false;
		if(str.length()==12)
			result= true;
		return result;
	}
	public boolean batchNumberCheck(String str) {
		boolean result=false;
		if(Character.isAlphabetic(str.charAt(0)) && Character.isAlphabetic(str.charAt(1)) &&
				Character.isAlphabetic(str.charAt(3)) && Character.isDigit(str.charAt(2)) )
			result= true;
		return result;
	}
	public boolean yearCheck(String str) {
		boolean result=false;
		int year=Integer.parseInt(str.substring(4, 8));
		if(year>=2015 && year<=2020)
			result= true;
		return result;
	}
	public boolean monthCheck(String str) {
		boolean result=false;
		int month=Integer.parseInt(str.substring(8,10));
		if(month>=1 && month<=12)
			result= true;
		return result;
	}
	public boolean dayCheck(String str) {
		boolean result=false;
		int day=Integer.parseInt(str.substring(10));
		if(day>=1 && day<=31)
			result= true;
		return result;
	}
	public String printBatchNumber(String str) {
		
		String batchnumber=str.substring(0,4);
		
		return batchnumber;
	}
public String printDate(String str) {
		
		String date1=str.substring(4);
		String year=date1.substring(0,4);
		String month=date1.substring(4,6);
		String day=date1.substring(6);
		return day+"/"+month+"/"+year;
	}
	public static void main(String[] args) {
		SeedBagExpiry s=new SeedBagExpiry();
		System.out.println(s.lengthCheck("AC4D20190908"));
		System.out.println(s.yearCheck("AC4D20190908"));
		System.out.println(s.monthCheck("AC4D20190908"));
		System.out.println(s.dayCheck("AC4D20190908"));
		System.out.println(s.batchNumberCheck("AC4D"));
		System.out.println(s.printBatchNumber("AC4D20190908"));
		System.out.println(s.printDate("AC4D20190908"));
	}

}
