package com.Practic.Dsa.StackUsingArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindSubset {

	public static void main(String[] args) {
		System.out.println(1<<4);
		
		int arr[] = {3,4,5,6,35,34,87,65};
		
		//System.out.println(findSubsets(arr));
		
		String str ="tfghjklfdfgdds";
		System.out.println(findSubset(str));
		/*
		Map<Character, Long> charCount = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(charCount);*/
		//Map<Integer, Integer> frqMap = Arrays.stream(arr).map(e-> Integer :: valueOf)
		
		char[] arr1 = str.toCharArray();
		
		Map<Character,Integer> map1 = new HashMap<Character, Integer>();
		for(char c : arr1) {
			map1.put(Character.valueOf(c), map1.getOrDefault(Character.valueOf(c), 0)+1);
		}
		System.out.println(map1);
		
		
	}
	
	
	public static List<List<Integer>> findSubsets(int nums[]){
		
		
		List<List<Integer>> subsetList = new ArrayList<>();
		int n= nums.length;
		int totalSubset = 1<<n;// 2^n subset set
		
		
		for(int i=0;i<totalSubset;i++) {
			List<Integer> subset = new ArrayList<>();
			for(int j=0;j<n;j++) {
				if((i& (i<<j))!=0) {
					subset.add(nums[j]);
				}
			}
			subsetList.add(subset);
		}
		
		
		
		
		return subsetList;
	}
	
	
	public static List<List<Character>> findSubset(String str){
		List<List<Character>> subsetList = new ArrayList<>();
		
		char arr[] = str.toCharArray();
		
		int n = arr.length;
		int totelsubset = 1<<n;
		
		for(int i=0;i<totelsubset;i++) {
			List<Character> subset= new ArrayList<>();
			for(int j=0;j<n;j++) {
				if((i & (i<<j))!=0) {
					subset.add(arr[j]);
				}
			}
			subsetList.add(subset);
		}
		
		
		return subsetList;
	}
	
	

}
