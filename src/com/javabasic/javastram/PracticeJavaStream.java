package com.javabasic.javastram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeJavaStream {
	
	
	public static void main(String [] args) {
		//int arr[] = new int[5];
		Integer arr[] = {3,4,5,6,6,7,43,4,5,6,6,77,55,21,45};
		
		List<Integer> list=Arrays.asList(arr);	
		System.out.println(list);
		
		int max= list.stream().mapToInt(e->e).max().getAsInt();
		System.out.println(max);
		int sMax=list.stream().mapToInt(e->e).filter(e->e<max).max().getAsInt();
		System.out.println(sMax);
		
		List<String> sList= list.stream().map(String :: valueOf).collect(Collectors.toList());
		System.out.println(sList);
		
		Map<Integer, Integer> fMap = list.stream().collect(Collectors.groupingBy(e->e, Collectors.summingInt(e->1)));
		List<Integer> value =fMap.entrySet().stream().filter(e-> e.getValue()==1).map(e-> e.getKey()).collect(Collectors.toList());
				
		System.out.println(fMap);
	}
}
