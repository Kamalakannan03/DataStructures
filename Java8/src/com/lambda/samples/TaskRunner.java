package com.lambda.samples;

import java.util.Arrays;

public class TaskRunner {

	public static void main(String[] args) {
		Task t1 = new Task("Java1", 4);
		Task t2 = new Task("Java2", 5);
		Task t3 = new Task("Java3", 6);
		Task t4 = new Task("Java4", 7);
		ArrayTaskList list = new ArrayTaskList();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		System.out.println(list.toString());
	}

}
