package com.lambda.samples;


import com.lambda.samples.Task;

public abstract class AbstractTaskList {
	public abstract void add(Task task);
	public abstract void remove(Task task);
	public abstract int size();
	public abstract Task getTask(int index);
}

