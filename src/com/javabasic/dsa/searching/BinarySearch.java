package com.javabasic.dsa.searching;

public class BinarySearch {
	public static void main(String [] args) {
		int arr[] = {3,4,5,7,29,55,533,535};
		
		System.out.println(binarySearching(arr, 4));
	}
	
	
	public static int binarySearching(int arr[],int x) {
		int result=-1;
		int start=0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = start+ (end-start)/2;
			
			if(arr[mid]==x) {
				return mid;
			}
			
			if(arr[mid]<x) {
				start=mid+1;
			}else {
				end=mid-1;
			}
			
		}
		
		return result;
		
	}
}
	