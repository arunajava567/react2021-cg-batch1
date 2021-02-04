package com.cg.oops;
// abstract class  
//interface
abstract class veh{
	

	
}
interface Vehicle1{
	 int id=9;
	
	  void speed() ;
	  int milage();  // method without implementation
	
}
interface Parking1 {
	void getslot();
	
}
//implementation class 
class Car implements  Vehicle1,Parking1{
	 public   void speed()  {
		   System.out.println(" 120KMPH");
	   }
	public  int milage() {
		return 15;
	 }
	public void getslot() {
		
	}
}
class Bus implements  Vehicle1,Parking1 {
	  public void speed()  {
		   System.out.println(" 80KMPH");
	   }
	 public int milage() {
		return 10;
	 }
	 public void getslot() {
			
		}
	
}
public class AbstractDemo {
	public static void main(String[] args) {
		Vehicle1 v;
		v= new Car();
		v.speed();
		System.out.println(v.milage());
		Parking1 p;
		p=new Car();
		p.getslot();
		v=new Bus();
		v.speed();
		System.out.println(v.milage());
		

	}

}
