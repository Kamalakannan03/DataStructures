package com.lambda.samples;

public class Task {
	private String title;
	 private int time;
	 private boolean active;
	 private int start;
	 private int end;
	 private int repeat;
	 
	 
	//Constructor for one time task
	 public Task(String title, int time)
	 {
	 	setTitle(title);
	 	setTime(time);
	 	
	 }

	 //Constructor for repetitive time task
	 public Task(String title, int start, int end, int repeat)
	 {
	 	setTitle(title);
	 	setTime(start,end,repeat);

	 }
	 
//Method the set the Task title
   public void setTitle(String title) throws IllegalArgumentException {
	   try {
    if(title==null) {
    	throw new IllegalArgumentException();
    }   
    else {
   this.title=title;
    }   
	   }
    catch(IllegalArgumentException e) {
    	System.out.println("Please enter a valid title");
    	}
    }
	
   
  //Method to get the title name
   public String getTitle() { 
   	
		return title;
   	
   }
   //method to set the task status
   public void setActive(boolean active) {
   	this.active=active;
   }
   
   //Method to get the task status
   
   public boolean isActive() {
   	if(active) {
   		System.out.println("Task is in active status");
   		return true;
   	}
   	 System.out.println("Task is in inactive status");
		return false;
   	
   }
   //method to set the task notification time for one-time task
   public void setTime(int time )throws IllegalArgumentException {
	   try {
	   if(time<=0) {
		 	throw new IllegalArgumentException();
	   }
	   else {
		   this.time=time;
	   }
	   }
	   catch(IllegalArgumentException e)
	   {
		   System.out.println("Please enter a valid time format");
	   }
   	
   } 
   //method to set the task notification time for repetitive -time task
   public void setTime(int start, int end, int repeat) throws IllegalArgumentException {
	   try {
	   if(repeat<0) {
		 	throw new IllegalArgumentException();
		   }
	   else {
	   this.start=start;
	   this.end=end;
	   this.repeat= repeat;
	   }
  }
	   catch(IllegalArgumentException e) {
		   System.out.println("Please enter a valid start and end time format"); 
	   }
   }
  //method to get time  notification starts (for a repetitive task) or the time of the only notification (for one-time task)
  

   public int getTime() {
	   if(repeat>0) {
		   return start;
	   }
	return time;
	
	   
  }
  
   public int getStartTime() {
	   if(start>0) {
	return start;
	   }
	   return time;
  }
   public int getEndTime() {
	   if(end>0) {
			return end;
			   }
			   return time;
	   
  }
   public int getRepeatInterval() {
	   if( repeat > 0)
			return repeat;
		else
			return 0;
	   
  }
  
   public  boolean isRepeated()
	{
		if((repeat==0))
			
		{
			System.out.println("Task is not repetative");
			return false;
		}
		else
			System.out.println("Task is repetative");
			return true;
	}
	
  
	public int nextTimeAfter(int Itime)
	{
		int result = -1;
		  if(!(getRepeatInterval() == 0)) {
			  if(Itime<end){
				  result = start;
				  while(Itime > result) {
					  result = result+repeat; 
				  } 
			  }    
		  }
		  else {
			  if(Itime < time)
				  result =  time;
		  }
		  return result;
	  }
	
	
//Method to return the description of task
	
	public String toString()
	{
		String taskdesc = "";
		if(isActive()==true)
		{
			if(isRepeated() == true && repeat>0) {
				taskdesc = "Task" + getTitle() + " from "+getStartTime()+" to "+getEndTime()+" every "+getRepeatInterval()+" seconds";
			}
			else
			{
				taskdesc = "Task " + getTitle()+ " at "+getTime();
			}
		}
		
		else 
			taskdesc = "Task" + getTitle()+" is inactive";
		return taskdesc;
	}
}
	

