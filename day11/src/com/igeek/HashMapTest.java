package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:
 * 1.HashMap hashMap = new HashMap(),底层没有初始化一个长度为16的Node[]数组;
 * 2.第一次put的时候，初始化一个长度为16的Node[]数组;
 * 3.计算元素的哈希值
 * 4.通过hash(h & length -1)确定索引的位置
 * 5.该位置上没有元素直接添加
 * 6.该位置上有多个元素(链表的形式)
 * 	 比较hash值：
 *     1.hash值不相同，元素添加成功
 *     2.hash值相同，就需要进一步调用equals()来判断；返回true，替换;false,添加。
 */
public class HashMapTest {

	Node[] table;
	
	static final int DEFAULT_INITIAL_CAPACITY = 16;

	public HashMapTest() {
		table = new Node[DEFAULT_INITIAL_CAPACITY];
	}
	
	public void put(Object key,Object value) {
		
		Node node = new Node();
		node.hash = myHash(key,table.length);
		node.key = key;
		node.value = value;
		node.next = null;
		Node temp = table[node.hash];
		Node last = null;//指向最后一个节点
		boolean flag = false;
		if(temp == null) {
			//数据元素为空，新节点直接添加
			table[node.hash] = node;
		}else {
			//遍历链表
			while(temp != null) {
				//key相同的
				if(key.equals(temp.key)) {
					//替换
					temp.value = value;
					flag = true;
					break;
				}else {
					last = temp;
					temp = temp.next;
				}
			}
			if(!flag) {
				last.next = node;
			}
		}
	}
	
	//根据键获取值
	public Object get(Object key) {
		
		int hash = myHash(key, table.length);
		
		Object value = null;
		
		if(table[hash] != null) {
			Node node = table[hash];
			//遍历链表
			while(node != null) {
				//key相等
				if(node.key.equals(key)) {
					value = node.value;
					break;
				}else {
					node = node.next;
				}
			}
		}
		return value;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		
		for (int i = 0; i < table.length; i++) {
			Node node = table[i];
			while(node != null) {
				sb.append(node.key+"="+node.value+",");
				node = node.next;
			}
		}
		sb.setCharAt(sb.length()-1, '}');
		return sb.toString();
	}

	public static int myHash(Object key, int length) {
//		return ((key.hashCode()) % 16);
		return ( (key.hashCode()) & (length-1));
	}
	
	public static void main(String[] args) {
//		for (int i = 0; i <=100; i++) {
//			System.out.println(i+"==>"+myHash(i, 16));
//		}
		HashMapTest hashMapTest = new HashMapTest();
		hashMapTest.put(3, "java");
		hashMapTest.put(8, "c");
		hashMapTest.put(19, "android");
		hashMapTest.put(25, "ios");
		System.out.println(hashMapTest);
		
		System.out.println(hashMapTest.get(19));
		
	}
	

}
