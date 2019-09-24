package com.igeek;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author zx
 * @version 1.0
 * @description:注解：对程序作出的解释；1.5的新特性Annotation
 * 内置注解
 * 1.@Override：重写
 * 
 * 2.@Deprecated：过时的，不建议开发人员使用或者有替代的
 * 
 * 3.@SuppressWarnings:抑制编译时的警告信息
 * 
 * @Target(ElementType.METHOD)
 * public @interface Override {
 *	
 * }
 * 
 * 
 */
//The annotation @Override is disallowed for this location
//@Override
//@Deprecated
@SuppressWarnings("all")
@MyAnnotation(value={ "jack","rose" },age=10)
public class Demo07 /*extends Object*/{
	
//	@Override
	private String name;
	
	ArrayList arr = new ArrayList();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	Date date = new Date();
	
	public static void main(String[] args) {
		System.out.println("demo07....");
	}
	

}
