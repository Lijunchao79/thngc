package com.igeek;

import java.util.LinkedList;

/**
 * @author zx
 * @version 1.0
 * @description:
 * queue队列结构:先进先出
* 
* 	LinkedList是支持队列结构的
* 
* 	对应的方法
* 		offer加入队列
* 		poll离开队列
* 		peek查询出即将要离开队列的是哪个元素,检查有没有要离开队列的元素
 */
public class Demo05 {

	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<>();
		
		//入队
		queue.offer("jack");
		queue.offer("rose");
		
		System.out.println(queue);
		
		//出队
		//Retrieves and removes the head (first element) of this list.
		queue.poll();
		System.out.println(queue);
		
		//返回队首元素
		System.out.println(queue.peek());
		System.out.println(queue.peek());

	}

}
