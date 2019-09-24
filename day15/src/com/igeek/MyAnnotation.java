package com.igeek;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author zx
 * @version 1.0
 * @description:自定义一个注解
 * 
 * 元注解:负责注解其他的注解
 * 1.@Target：描述注解的使用范围
 *  TYPE；FIELD；METHOD；PARAMETER；CONSTRUCTOR；LOCAL_VARIABLE；ANNOTATION_TYPE；PACKAGE.......
 * 2.@Retention:表示什么样的级别来保存注解，用于描述注解的生命周期
 */
@Target(value= {ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	
	String[] value();
	
	String setName() default "";
	
	int age() ;

	
}
