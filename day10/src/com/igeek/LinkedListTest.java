package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:
 */
public class LinkedListTest {
	
	private Node first; //链表的第一个结点
	private Node last; //链表的最后一个结点
	
	private int size;
	
	//添加元素
	public void add(Object obj) {
		//新建Node结点
		Node node = new Node(obj);
		//空链表
		if(first==null) {
			first = node;
			last = node;
		}else {
			node.previous = last;
			node.next = null;
			last.next = node;
			last = node;
		}
		size++;
	}
	
	//指定位置插入元素
	public void add(int index,Object element) {
		checkElementIndex(index);
		Node newNode = new Node(element);
		Node temp = getNode(index);
		if(temp != null) {
			//拿到指定位置结点的前驱
			Node preNode = temp.previous;
			//preNode后继指向新的结点
			preNode.next = newNode;
			//newNode的前驱指向preNode
			newNode.previous = preNode;
			//newNode的后继指向要插入的位置的结点
			newNode.next = temp;
			//temp的前驱指向newNode
			temp.previous = newNode;
		}
		size++;
	}
	
	//删除
	public void remove(int index) {
		checkElementIndex(index);
		Node temp = getNode(index);
		
		if(temp != null) {
			Node preNode = temp.previous;
			Node nextNode = temp.next;
			
			if(preNode != null) {
				preNode.next = nextNode;
			}
			
			if(nextNode != null) {
				nextNode.previous = preNode;
			}
			
			if(index == 0) {
				first = nextNode;
			}
			
			if(index == size-1) {
				last = preNode;
			}
			size--;
		}
		
	}
	
	
	public Node getNode(int index) {
		checkElementIndex(index);
		Node temp = first;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	//检查索引
	public void checkElementIndex(int index){
		if(index < 0 || index > size-1) {
			throw new RuntimeException("index非法！！！");
		}
	}
	
	//[aa,bb,cc]
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		Node temp = first;
		while(temp != null) {
			sb.append(temp.element+",");
			temp = temp.next;
		}
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
	}
	
	public static void main(String[] args) {
		LinkedListTest listTest = new LinkedListTest();
		listTest.add("aa");
		listTest.add("bb");
		listTest.add("cc");
		listTest.add("dd");
		listTest.add("ee");
		listTest.add("ff");
		
		System.out.println(listTest);
		
		Node temp = listTest.getNode(0);
		System.out.println(temp.element);
		
//		listTest.add(1, "ee");
//		System.out.println(listTest);
		listTest.remove(5);
		System.out.println(listTest);
	}

}
