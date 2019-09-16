package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @descroption:
 * public interface 接口名 {
		抽象方法1;
		抽象方法2;
		抽象方法3;
	}
 */
public interface Demo04 {
	
	//The blank final field a may not have been initialized
	final double PI = 3.14;
	double abc = 3.14;
	
	//Abstract methods do not specify a body
	public abstract void name();
	public void name1();

}
