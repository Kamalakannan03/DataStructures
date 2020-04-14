package com.lambda.samples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaSampleOne {
public static void main(String arg[]){
	// TODO Auto-generated method stub
	 List<String> list = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");

     
		List<String> sortedList = list.stream()
			.sorted((o1,o2)-> o1.compareTo(o2))
			.collect(Collectors.toList());
		
		
    /* List<String> sortedList = list.stream()
			.sorted(Comparator.naturalOrder())
			.collect(Collectors.toList());*/

     //sortedList.forEach(System.out::println);
     sortedList.forEach(a->System.out.println(a));
}
	
}
