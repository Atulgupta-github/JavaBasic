package com.javabasic.problemSolving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class problemSolving {

	public static void main(String[] args) {
		Integer arr[]= {3,5,7,8,0,2,3,4,4,4,4,45,5,7,8,91,1};
		
		 List<Integer> list= Arrays.asList(arr);
		 
		 
		 Map<Integer,Integer> d=list.stream().collect(Collectors.groupingBy(i->i, Collectors.summingInt(i->1)));
		 System.out.println(d);
		 
		 System.out.println(getFrequency(list));

	}
	
	public static Map<Integer,Integer> getFrequency(List<Integer> list){
		Map<Integer,Integer> freq= new HashMap<Integer, Integer>();
		String str= "gsfdjhgkfgdh3jsfdfds";
		Map<Character , Integer> Map= new HashMap<>();
		for(int i : list) {
			freq.put(i, freq.getOrDefault(i, 0)+1);
		}
		for(char ch : str.toCharArray()) {
			Map.put(ch, Map.getOrDefault(ch, 0)+1);
		}
		String s = str.chars().distinct().mapToObj(e-> String.valueOf(e)).collect(Collectors.joining());
		
		int a[] = new int[5];
		return freq;
		
		
		
		
		
//		for(Map.Entry<Integer,Integer> entry : freq.entrySet()) {
//		//	entry.getKey() + entry.getValue();
//		}
	}

}
