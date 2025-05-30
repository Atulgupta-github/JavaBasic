package com.Practic.webee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		List<String> list= Arrays.asList("32","2","63");
		
		Object[] arr =list.toArray();
		
		List<Integer> intList = list.stream().map(Integer :: valueOf).collect(Collectors.toList());
		System.out.println(intList);
		
		List<Integer> l1= Arrays.asList(3,4,5,5,6,6,7,8,8,20,9,32,32,4,44,44,323,33,323,5,54);
		
		Map<Integer, Integer> fmap = l1.stream().collect(Collectors.groupingBy(e->e,Collectors.summingInt(e->1)));
		
		System.out.println(fmap);
		List<Integer> keyList= fmap.entrySet().stream().map(e->e.getKey()).collect(Collectors.toList());
		System.out.println(keyList);
		int max = keyList.stream().mapToInt(e->e).max().getAsInt();
		int secondMax= keyList.stream().mapToInt(e->e).filter(e->e<max).max().getAsInt();
		
		
		Map<Integer,Integer> fmap1 = l1.stream().collect(Collectors.groupingBy(e->e, Collectors.summingInt(e->1)));

	}

}
