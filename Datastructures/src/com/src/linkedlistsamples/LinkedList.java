package com.src.linkedlistsamples;
import java.io.*;

import javax.swing.text.Position;


// Java program to implement 
// a Singly Linked List 
public class LinkedList<T>  { 

	static class Node<T>{
		private Node<T> next;
		private Node<T> prev;
		private T data;
		public Node<T> getNext() {
			return next;
		}
		public void setNext(Node<T> next) {
			this.next = next;
		}
		public Node<T> getPrev() {
			return prev;
		}
		public void setPrev(Node<T> prev) {
			this.prev = prev;
		}
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
	}
	
	private Node<T> first;
	private Node<T> last;
	public Node<T> getFirst() {
		return first;
	}
	public void setFirst(Node<T> first) {
		this.first = first;
	}
	public Node<T> getLast() {
		return last;
	}
	public void setLast(Node<T> last) {
		this.last = last;
	}
	public LinkedList() {
        first = last = null;
    }
	public boolean isEmpty() {
		return first == null;
	}
	
	
	public void add(T data) {
		Node<T> temp = new Node<T>();
		temp.setNext(null);
		temp.setData(data);
		if(first == null) {
			temp.setPrev(null);
			first=last=temp;
		}else {
			temp.setPrev(last);
			last.setNext(temp);
			last = temp;
		}
	} 
	public void remove(int position) {
		Node<T> temp = new Node<>();
		temp = first;
		if(first==null) {
			return;
		}
		else if(position==0) {
			first = temp.next;
			return;
		}
		for(int i=0; i<position-1; i++)
			temp = temp.next;//next of temp node is the node given to remove
		
		if(temp==null)
			return;
		
		Node<T> nextNode = new Node<>();
		nextNode = temp.next;
		temp.next = nextNode.next;
		if(temp.next == null)
			last = temp;
		
	}
	public int getCount() 
    { 
       /* Node<T> temp = first; 
        int count = 0; 
        while (temp != null) 
        { 
            count++; 
            temp = temp.next; 
        } 
        return count; */
		Node<T> temp = first;
		int count = 0;
		if(temp!=null) {
			count = 1;
			while(temp.next!=null) {
				temp = temp.next;
				count++;
			}
			return count;
		}
		return count;
    } 
} 
