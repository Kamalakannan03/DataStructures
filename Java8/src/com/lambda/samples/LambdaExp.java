package com.lambda.samples;
import java.awt.image.SampleModel;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class LambdaExp implements FunctionalInt{
	List<int[]> list=null;
	
	public static void main(String[] args) {
		FunctionalInt obj = ()->System.out.println("testing");
		// TODO Auto-generated method stub
		obj.setUp();
		new LambdaExp().sampleFun();
		
	}
	public void sampleFun() {
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	System.out.println("a===>"+Arrays.toString(a));
	list = Arrays.asList(a);
	System.out.println("list===>"+Arrays.toString(list.toArray()));
	//list.stream().filter(x->x%2==0)
	 List<Integer> number = Arrays.asList(2,3,4,5); 
	  System.out.println(number);
	    // demonstration of map method 
	    List<Integer> square = number.stream().map(x -> x*x). 
	                           collect(Collectors.toList()); 
	    System.out.println(square); 
	    List<Integer> square1 = number.stream().filter(x -> x%2==0)
	    		.filter(x -> x*100==400)
                .collect(Collectors.toList()); 
System.out.println(square1); 
	  
List<Integer> list0 = Arrays.asList(1,2,3,4,5,6,7);
 list0.stream().forEach(System.out::println);
 List<String> list1 = Arrays.asList("GFG", "Geeks", 
         "for", "GeeksforGeeks");
 list1.stream().forEach(System.out::println);
	}
	
}