package com.igeek;

import java.util.LinkedList;

/**
 * @author zx
 * @version 1.0
 * @description:
 *  stack栈结构:先进后出
*  
*  LinkedList是支持栈结构的.
*  	对应的方法
*  		push压栈
*  		pop弹栈
*  		peek查询出即将要弹出的是哪个元素,检查有没有要弹出的元素
 */
public class Demo04 {

	public static void main(String[] args) {
		LinkedList<Integer> stack = new LinkedList<>();
		//入栈
		stack.push(12);
		stack.push(34);
		stack.push(56);
		
		System.out.println(stack);
		
		//出栈
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		//返回栈顶元素
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());

	}

}
