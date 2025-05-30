package com.javabasic.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionImp {
	
	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(2,32,43,43,54,6);
		
		////iteratorImp(list);
		
		//collectionImp();
		
		List();
		
	}
	
	
	public static void iteratorImp(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		ListIterator<Integer> lit = list.listIterator();
		while(lit.hasNext()) {
			lit.add(23);
		}
		
		while(it.hasNext()) {
			int element =it.next();
			
			if(element>34) {
				
				System.out.println(element);
				
			}
			
		}
	}
	
	public static void collectionImp() {
		
		//By list
		Collection<Integer> bl = new ArrayList<>(3);
		Collection<Integer> al = new ArrayList<>(Arrays.asList(32,54,65,76));
		
		bl.add(1); // Adds the first element
		bl.add(2); // Adds the second element
		bl.add(3); // Adds the third element
		bl.add(4); // ArrayList resizes as the initial capacity of 3 is exceeded

		System.out.println(bl);
		
		al.addAll(bl);
		//System.out.println(al);
		//System.out.println(bl);
		bl=al.stream().filter(e->e>3).collect(Collectors.toList());
		//System.out.println(al);
		System.out.println(al.stream().collect(Collectors.toMap(Integer :: valueOf , Integer::valueOf)));
		
		Map<Integer,Integer> m= new HashMap<>();
		m=al.stream().collect(Collectors.toMap(Integer :: valueOf , Integer::valueOf));
		//System.out.println(m);
		
		
		
		
		// BY USING SET
		
		Set<Integer> s = new HashSet<>(al);
		System.out.println(s);
	//	s.clear(); s
		s.add(32);
		System.out.println(s);
		
		int x=s.stream().mapToInt(e->e).max().getAsInt();
		System.out.println(x);
		s.remove(65);
		int y=s.stream().filter(e->e<x).mapToInt(e->e).max().getAsInt();
		
		System.out.println(y);
		
				
	}
	
	
	public static void  List() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		
		List<Integer> vc = new Vector<>();
		vc.add(12);
		vc.add(13);
		
		List<Integer> st = new Stack<>();
		st.add(1);
		st.add(2);
		st.add(3);
		
		
		
		List<Integer> linkList = new LinkedList<>();
		
		linkList.add(2);
		linkList.add(3);
		linkList.add(5);
		
		
		System.out.println(list);
		System.out.println(vc);
		System.out.println(st);
		
		st.remove(1);
		System.out.println(st);
		System.out.println(linkList);
		
	
	}
	
	
	
	public static void stackImplementation() {
		
		List<Integer> list = new ArrayList<>();
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<5;i++){
			st.push(i+1);
		}
		System.out.println(st);
		st.peek();
		st.pop();
		st.addAll(list);
		st.contains(5);
		st.isEmpty();
		
		
	}
	
	public static void MapImp() {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "sku");
		map.put(2, "bin");
		
		List<Integer> list = Arrays.asList(32,32,3,4,42,45,47,3);
		Map<Integer,Integer> m = list.stream().filter(e->e>44).collect(Collectors.toMap(Integer :: valueOf, Integer :: valueOf));
		int maxx = list.stream().mapToInt(e->e).max().getAsInt();
		int ndMx = list.stream().filter(e->e<maxx).mapToInt(e->e).max().getAsInt();
		for(Map.Entry<Integer, String> entry :map.entrySet()) {
			System.out.println(entry.getKey()+ " "+ entry.getValue());
		}
	}

	
}
