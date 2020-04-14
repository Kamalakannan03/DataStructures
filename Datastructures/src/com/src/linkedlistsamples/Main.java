package com.src.linkedlistsamples;

import com.src.linkedlistsamples.LinkedList.Node;

public class Main {

	public Node<Integer> findMiddleNode(Node<Integer> first)
	{
		Node<Integer> slowPointer, fastPointer; 
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int node1=1;
		int node2=2;
		int node3=3;
		int node4=4;
		LinkedList<Integer> obj = new LinkedList<Integer>();
		obj.add(node1);
		obj.add(node2);
		obj.add(node3);
		obj.add(node4);
		obj.add(5);
		obj.add(6);
		obj.add(7);
		obj.add(8);
		obj.add(9);
		obj.add(10);
		//System.out.println(obj.getLast().getData());
		//System.out.println("count===>"+obj.getCount());
		//obj.remove(3);
		//System.out.println(obj.getLast().getData());
		System.out.println("count===>"+obj.getCount());
		Node<Integer> middle = new Main().findMiddleNode(obj.getFirst());
		System.out.println("middle===>"+middle.getData());
		System.out.println("third from last===>"+new Operations().findThirdNodeFromLast(obj).getData());
	}
}
