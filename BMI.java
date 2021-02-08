package com.cg.java8;

import java.util.StringTokenizer;

public class BMI {

	float returnWeight(String str) {
		String s=str.substring(0,str.indexOf('@'));
		StringTokenizer st=new StringTokenizer(s,"-");
		String p1=st.nextToken();
		String p2=st.nextToken();
		String p3=p1+"."+p2;
		return Float.parseFloat(p3);  //weight
	}
   float returnHeight(String str) {
	   String s=str.substring(str.indexOf('@')+1);
		StringTokenizer st=new StringTokenizer(s,"-");
		String p1=st.nextToken();
		String p2=st.nextToken();
		String p3=p1+"."+p2;
		return Float.parseFloat(p3);//height
	}
  float  calculateBMI(float weight,float height){
	   return weight/(height*height);
   }
   String checkStatus(float bmi) {
	    String status=null;
	    if(bmi>=20 && bmi<=24)
	    	status="nourished";
	    else
	    	status="malnourished";
	    return status;
   }
	
   public static void main(String[] args) {
	BMI b=new BMI();
	float weight=b.returnWeight("34-56@78-56");
	System.out.println(b.returnWeight("34-56@78-56"));
	float height=b.returnHeight("34-56@78-56");
	System.out.println(b.returnHeight("34-56@78-56"));
	System.out.println(b.calculateBMI(weight, height));
	float bmi=b.calculateBMI(weight, height);
	System.out.println(b.checkStatus(bmi));
}
}
