package com.lambda.samples;


import java.util.Arrays;

import com.lambda.samples.Task;
import com.lambda.samples.AbstractTaskList;
public class ArrayTaskList extends AbstractTaskList {
	Task [] tasklistarr= new Task[1];
	Task[] newtasklistarr=new Task[5];
	int arraylength= tasklistarr.length;
	int newlength=0;
	     int actsize=0;
	     
	  //method to add Task  
	   @Override
	   public void add(Task task) {
		if(actsize<arraylength) {
			 tasklistarr[actsize]=task;
		     actsize++;
		     System.out.println("Task added:" + task);
		     }
	   else {
		   
		   for(int i=0;i<tasklistarr.length; i++) {
			   newtasklistarr[i]=tasklistarr[i];
			   }
		   newtasklistarr[actsize++]=task;
		   newlength=newtasklistarr.length;
		   System.out.println("Task added:" + task);
		     }
	   }
		
	   //method to get the size of Array
	   @Override
	   public int size(){
	        return actsize;
	    }
	     
	@Override 
	public void remove(Task task) {
		// TODO Auto-generated method stub
		int i;
		for(i = 0; i <newlength; i++){
			if(task.equals(newtasklistarr[i]))
			break;
		}
		
		for(int k=i; k < newlength-1; k++) {
			newtasklistarr[k]=newtasklistarr[k+1];
			
		}
		actsize--;
		System.out.println(task+ ": has been removed from array");
         
	}
	@Override
	public Task getTask(int index) {
		// TODO Auto-generated method stub
		Task task=null;
		try {
			if(index<actsize) {
             task = tasklistarr[index];
			}
		}
			catch(Exception e) {
         
           System.out.println("invalid index"+ index);
			}
			return task;
     
		
    }
	}

