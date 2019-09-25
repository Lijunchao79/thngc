package com.igeek;

import java.util.Properties;

/**
 * 
 * @author zx
 * @version 1.0
 * @description:解析xml文件，封装数据
 */
public class BeanConfig {
	
	//成员变量
	private String id;
	private String className;
	Properties prop = new Properties();
	
	public BeanConfig() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	@Override
	public String toString() {
		return "BeanConfig [id=" + id + ", className=" + className + ", prop=" + prop + "]";
	}
	
	

}
