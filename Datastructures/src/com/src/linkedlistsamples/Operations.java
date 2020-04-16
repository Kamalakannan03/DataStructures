package com.src.linkedlistsamples;

import java.util.HashSet;

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
 
 public <T> LinkedList<T> removeDuplicatesFromList(LinkedList<T> obj){
	Node<T> current = obj.getFirst();
	Node<T> prev = null;
	HashSet<T> hs = new HashSet<T>();
    while (current != null)  
    { 
        T curval = current.getData();
          
         // If current value is seen before 
        if (hs.contains(curval)) { 
            prev.setNext(current.getNext());
        } else { 
            hs.add(curval); 
            prev = current; 
        } 
        current = current.getNext(); 
    } 
    System.out.println(hs);//LinkedList elements without duplicate
	return obj;
 }
}
