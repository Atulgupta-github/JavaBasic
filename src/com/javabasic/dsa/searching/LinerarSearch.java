package com.javabasic.dsa.searching;

import java.util.Arrays;
import java.util.List;

public class LinerarSearch {

	public static void main(String[] args) {
		Integer arr[] = {3,42,4,5,6,73,7,83,8,43};
		
		List<Integer> i = Arrays.asList(arr);
		System.out.println(i);
		
		System.out.println(search(i,42));
		
	}
	
	public static boolean search(List<Integer> x, int t) {
		boolean find= false;
		for(Integer a : x) {
			if(a==Integer.valueOf(t)) {
				find=true;
			}
		}

		return find;
	}

}
