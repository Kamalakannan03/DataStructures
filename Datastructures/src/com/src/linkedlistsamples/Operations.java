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
 public <T> Node<T> findMiddleNode(Node<T> first)
	{
		Node<T> slowPointer, fastPointer; 
		slowPointer = fastPointer = first; 

		while(fastPointer !=null) { 
			fastPointer = fastPointer.getNext(); 
			if(fastPointer != null && fastPointer.getNext() != null) { 
				slowPointer = slowPointer.getNext(); 
				fastPointer = fastPointer.getNext(); 
			} 
		} 

		return slowPointer; 

	}
 public <T> LinkedList<T> removeMiddleElement(LinkedList<T> obj){
	 Node<T> middleNode = findMiddleNode(obj.getFirst());
	 Node<T> temp = middleNode;
	 Node<T> prev = middleNode.getPrev();
	 Node<T> next = middleNode.getNext();
	 prev.setNext(temp.getNext());
	 next.setPrev(temp.getPrev());
	 return obj;
 }
}
