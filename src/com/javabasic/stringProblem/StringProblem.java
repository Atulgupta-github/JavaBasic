package com.javabasic.stringProblem;

public class StringProblem {
	public static void main(String [] args) {
		String s= "mt name is atul";
		
		reverseStrig(s);
		System.out.println(checkPalendrome("nitin"));
	}
	
	
	public static void reverseStrig(String s) {
		
		String arr[] =s.split(" ");
		
		StringBuilder sb = new StringBuilder();
		for(int i=arr.length-1;i>=0;i--) {
			sb.append(arr[i]+ " ");
		}
		System.out.println(sb.toString());
		
		
		
		
	}
	
	
	public static boolean checkPalendrome(String s) {
		int start =0;
		int end = s.length()-1;
		while(start<end) {
			if(s.charAt(start)!=s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		
		return true;
	}
	
	
	public static void printNumber() {
		
		int num= 20;
		
		switch(num) {
		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("20");
			
		default:
			System.out.println("not 10,20");
		}
		
		
		
		
	}

}
