package com.Practic.Dsa.StackUsingArray;

import java.util.ArrayList;
import java.util.List;

public class FindSubset {

	public static void main(String[] args) {
		System.out.println(1<<4);
		
		int arr[] = {3,4,5,6,35,34,87,65};
		
		System.out.println(findSubsets(arr));
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
	
	

}
