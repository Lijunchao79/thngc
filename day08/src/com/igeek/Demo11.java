package com.igeek;

import java.io.IOException;

/**
 * @author zx
 * @version 1.0
 * @descroption:
 * 父类方法没有抛出异常，子类覆盖父类该方法时也不可抛出异常。此时子类产生该异常，只能捕获处理，不能声明抛出
 */
public class Demo11 {
	
	class Fu {
		public void method() {
		}
	}
	
	class Zi extends Fu{
		
		@Override
		public void method(){
			try {
			} catch (Exception e) {
			}
		}
	}

}
