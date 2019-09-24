package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:枚举类
 * 有限个的对象
 */
public enum Season2 {
	
	SPRING("春天"),
	SUMMER("夏天"),
	AUTUMN("秋日"),
	WINTER("冬日");
	
	//自己添加额外的需求
	private final String name;
	
	private Season2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Season [name=" + name + "]";
	}

}
