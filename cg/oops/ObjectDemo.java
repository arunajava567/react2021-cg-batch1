package com.cg.oops;
// equals(), hashcode(), toString(), finalize(),getClass(), wait(),notify(),notifyAll()
// clone() -> Object 
class Person implements Cloneable {
	int id;
	String name;
	Person() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person details are " + id + ", name=" + name;
	}
	/*public void finalize() {
		id=0;
		name=null;
	}*/
	
	public Object clone()  throws CloneNotSupportedException{
		   return super.clone();
	}
}
public class ObjectDemo {
	public static void main(String[] args) throws CloneNotSupportedException{
		ObjectDemo  o1=new ObjectDemo ();
		ObjectDemo  o2=new ObjectDemo ();
		ObjectDemo  o3=o1;
		System.out.println(o1.equals(o3));
		System.out.println(o1.hashCode() +"  "+o2.hashCode()+"  "+o3.hashCode());
		Person p=new Person(101,"Ram");
		System.out.println(p.id+"  "+p.name);
		System.out.println(p.getId()+"  "+p.getName());
		System.out.println(p);//implicitly calling toString()
		System.out.println(p.getClass());
		Person p1=new Person();
		Person p2=(Person)p1.clone();
		System.out.println(p1.hashCode()+  "  "+p2.hashCode());
		
	}

}
