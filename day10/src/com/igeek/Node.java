package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:链表的结点
 */
public class Node {
	
	Object element;
	Node previous;
	Node next;
	
	public Node(Object element) {
		super();
		this.element = element;
	}

	public Node(Object element, Node previous, Node next) {
		super();
		this.element = element;
		this.previous = previous;
		this.next = next;
	}
	
	

}
