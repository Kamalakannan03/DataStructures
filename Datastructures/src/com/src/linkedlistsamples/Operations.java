package com.src.linkedlistsamples;

import com.src.linkedlistsamples.LinkedList.Node;

public class Operations {
 public <T> Node<T> findThirdNodeFromLast(LinkedList<T> list){
	 Node<T> firstPointer = list.getFirst();
	 Node<T> secondPointer = null;
	 
	 int counter = 1;
	 while(firstPointer !=null && firstPointer.getNext() !=null) {
		 if(firstPointer.getNext() !=null) {
			 firstPointer = firstPointer.getNext();
			 counter ++;
		 }
		 if(counter >=4 && firstPointer.getPrev() !=null ) {
			 if(counter == 4) {
				secondPointer = list.getFirst(); 
			 }else {
				 secondPointer = secondPointer.getNext();
			 }
		 }
	 }
	 return secondPointer;
 }
}
