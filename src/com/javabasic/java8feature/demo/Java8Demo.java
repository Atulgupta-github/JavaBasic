package com.javabasic.java8feature.demo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Java8Demo {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(1,3,4,5,10,6,7,8);
		
		
		Iterator<Integer> it = list.iterator();
		
		/*while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for (int i : list) {
			System.out.println(i);
		}*/
		
		
		//list.forEach(i-> System.out.println(i));
		
		//list.forEach(System.out::println);
		
		//list.forEach(i-> System.out.println(doubleit(i)));
		
		//list.forEach(Java8Demo:: doubleit1); /// (classname :: methodName)  method refrence
		
		
		
		// jAVA Stream
		
		//Stream<Integer> s = list.stream();
		
		//s.forEach(System.out:: println);
		
		//s.forEach(i-> System.out.print(i*2));  stream can not use at 2nd time it will give the runtime exception 
		
		
		System.out.println(list.stream().map(i-> i*2).reduce(0, (a,b)->a+b));	
		
		System.out.println(list.stream().filter(i->i%5==0).reduce(0,(a,b)-> Integer.sum(a, b)));
		
		System.out.println(list.stream().map(i->i*2).findFirst().orElse(0));
		
		System.out.println(list.stream().filter(i->i%5==0).findFirst().orElse(0));
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
	
	public static  int doubleit(int i) {
		return i*2;
	}
	
	public static  void doubleit1(int i) {
		System.out.println(i*2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
