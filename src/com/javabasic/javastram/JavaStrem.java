package com.javabasic.javastram;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import java.util.stream.Collectors;



public class JavaStrem {

	public static void main(String[] args) {
		stram();
		List<Integer> list = Arrays.asList(2,54,56,76,87,98,90,4);
		Map<Integer,String> map  = new HashMap<Integer, String>();
		
		map = list.stream().collect(Collectors.toMap(Integer::valueOf, String::valueOf));
		
		map= map.entrySet().stream().filter(e->e.getKey()<56).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		
			/*for(Map.Entry<Integer, String> entry : map.entrySet()) {
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
				
			}*/
		map.entrySet().stream()
		   .forEach(entry -> {
		       System.out.println(entry.getKey());
		       System.out.println(entry.getValue());
		   });
		
		
		//System.out.println(map);
		
		
		
		System.out.println(sumOfList(list));
			System.out.println(squareList(list));
			System.out.println(secondMaxelement(list));
	}
	
	
	public static Integer sumOfList(List<Integer> list) {
		
		Optional<Integer> sum =list.stream().reduce((a,b) -> a+b);
		return sum.get();
	}
	
	public static double averageOfList(List<Integer> list) {
		
		double average =list.stream().mapToInt(e->e).average().getAsDouble();
		return average;
	}
	
	public static List<Integer> squareList(List<Integer> list) {
		
		List<Integer> out= list.stream().map(e->e*e).filter(e->e<100).collect(Collectors.toList());
		double avg=list.stream().map(e->e*e).filter(e->e<100).mapToInt(e->e).average().getAsDouble();
		System.out.println(avg);
		return out;
	}
	
	public static int secondMaxelement(List<Integer> list) {
		int Max= list.stream().mapToInt(e->e).max().getAsInt();
		
		int dMax = list.stream().filter(e->e<Max).mapToInt(e->e).max().getAsInt();
		
		return dMax;
		
	}
	
	
	public static int min(List<Integer> list) {
		int min = list.stream().mapToInt(e->e).min().getAsInt();
		
		int mintwo = list.stream().filter(e->e<min).mapToInt(e->e).min().getAsInt();
		
		
		
		
		int max= list.stream().mapToInt(e->e).max().getAsInt();
		
		int secondMax = list.stream().filter(e->e<max).mapToInt(e->e).max().getAsInt();
		
		return min;
		
	}
/*	List<Integer> l = updatedExportProfilelist.stream().filter(e->e.getProfileId()>100).map(ProfileExportDTO :: getProfileId).collect(Collectors.toList());
	Map<Integer,String> map = updatedExportProfilelist.stream().collect(Collectors.toMap(ProfileExportDTO :: getProfileId, ProfileExportDTO :: getProfileName));
	
	List<String> listname = updatedExportProfilelist.stream().map(e->e.getProfileName()).collect(Collectors.toList());
	Set<String> set = updatedExportProfilelist.stream().filter(e->e.getProfileName().length()>5).map(e->e.getProfileName()).collect(Collectors.toSet());
	
	List<String> l1= l.stream().map(String :: valueOf).collect(Collectors.toList());
	List<Double> l2 = l.stream().map(Double :: valueOf).collect(Collectors.toList());*/
	
	
	
	
	
	
	public static void stram() {
		Integer arr[] = {2,4,5,6,7,8,9,443,43,55,776};
		
		List<Integer> list = Arrays.asList(arr);
		
		int max = list.stream().mapToInt(e->e).max().getAsInt();
		double avg = list.stream().filter(e->e<10).mapToInt(e->e).average().getAsDouble();
		
		Map<Integer,Integer> map = list.stream().collect(Collectors.toMap(Integer:: valueOf, Integer :: valueOf));
		
		List<Integer> newList= map.entrySet().stream().filter(e->e.getKey()<10).map(e->e.getValue()).collect(Collectors.toList());
		
		int max1 = newList.stream().mapToInt(e->e).max().getAsInt();
		int ndMax = newList.stream().filter(e->e<max1).mapToInt(e->e).max().getAsInt();
		
		
		System.out.println(list);
		System.out.println(max);
		System.out.println(avg);
		System.out.println(map);
		System.out.println(max1);
		System.out.println(list);
		System.out.println(ndMax);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
