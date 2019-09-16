package com.igeek;

public class ArrayListDemo2<E> {

	Object[] elementData;

	int size;

	private static final int DEFAULT_CAPACITY = 10;

	public ArrayListDemo2() {
		this.elementData = new Object[DEFAULT_CAPACITY];
	}

	public ArrayListDemo2(int initialCapacity) {
		this.elementData = new Object[initialCapacity];
	}

	public void add(E obj) {
		// À©ÈÝ
		if (size == elementData.length) {
			Object[] newElementData = new Object[elementData.length + (elementData.length >> 1)];
			System.arraycopy(elementData, 0, newElementData, 0, elementData.length);
			elementData = newElementData;
		}
		elementData[size++] = obj;
	}

	public E get(int index) {
		rangeCheck(index);
		return (E) elementData[index];
	}

	public void set(int index, E object) {
		rangeCheck(index);
		elementData[index] = object;
	}

	// [hello, world]
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < elementData.length; i++) {
			if (i == elementData.length - 1) {
				sb.append(elementData[i]);
			} else {
				sb.append(elementData[i] + ",");
			}
		}
		sb.append("]");
		return sb.toString();
	}

	public void rangeCheck(int index) {
		if (index < 0 || index > size - 1) {
			throw new RuntimeException("·Ç·¨µÄindex");
		}
	}

	public static void main(String[] args) {
		ArrayListDemo2<String> arrayListDemo = new ArrayListDemo2<>();
		// arrayListDemo.add("hello");
		// arrayListDemo.add("world");
		// java.lang.ArrayIndexOutOfBoundsException
		for (int i = 0; i < 20; i++) {
			arrayListDemo.add("a" + i);
		}
		System.out.println(arrayListDemo);
		System.out.println(arrayListDemo.get(2));

	}

}
