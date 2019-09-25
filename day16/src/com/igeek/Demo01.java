package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:
 * 需求：
 * 编写一个BeanFactroy类来读取XML配置文件中配置的JavaBean信息，
 * 将读取都的信息使用BeanUtils封装进JavaBean对象，将对象存储在Map集合，
 * 并在BeanFactory中提供通过id查找JavaBean的方法。
 * 
 *  1.BeanFactory首先加载(解析) xml配置文件
 *	2.将每一个<bean>标签配置内容，封装到BeanConfig对象中
 *	3.最后将整个xml所有配置内容都封装一个容器，且此容器可以快速查询。将采用Map进行数据存储。
 */
public class Demo01 {
	
	public static void main(String[] args) {
		Object user = BeanFactory.getBean("userId01");
		Object book = BeanFactory.getBean("bookId02");
		Object person = BeanFactory.getBean("personId03");
		System.out.println(user);
		System.out.println(book);
		System.out.println(person);
	}

}
