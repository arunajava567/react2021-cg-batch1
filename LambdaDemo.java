package com.cg.java8;

import java.util.Arrays;
import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("node", "java", "python", "ruby");
		list.forEach(str -> System.out.println(str));
		
		
		
		
		List<Integer> l1=Arrays.asList(23,12,45,67,45,21,31);
		
		System.out.println("using lambda");
		
		l1.forEach(n->System.out.println(n)); //lambda
		
		System.out.println(" method sreference operator");
		l1.forEach(System.out::println); // method reference 
	}

}
