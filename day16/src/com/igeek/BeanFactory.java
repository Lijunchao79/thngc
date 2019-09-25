package com.igeek;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.beanutils.BeanUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class BeanFactory {

	private static Map<String, BeanConfig> map = new HashMap<String, BeanConfig>();

	static {
		// 解析xml
		try {
			SAXReader saxReader = new SAXReader();
			Document document = saxReader.read("src\\beans.xml");
			// 获得根元素
			Element rootElement = document.getRootElement();
			// 获得子元素
			List<Element> elements = rootElement.elements();
			// 遍历
			for (Element beanElement : elements) {
				String id = beanElement.attributeValue("id");
				String className = beanElement.attributeValue("className");

				BeanConfig beanConfig = new BeanConfig();
				beanConfig.setId(id);
				beanConfig.setClassName(className);

				// <property>子标签
				List<Element> proElement = beanElement.elements();
				for (Element element : proElement) {
					String name = element.attributeValue("name");
					String value = element.attributeValue("value");
					// name和value封装到BeanConfig.prop
					beanConfig.getProp().setProperty(name, value);
				}
				// 数据封装到Map
				map.put(id, beanConfig);
			}

		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Object user = getBean("userId01");
		Object book = getBean("bookId02");
		Object person = getBean("personId03");
		System.out.println(user);
		System.out.println(book);
		System.out.println(person);
	}
	
	/**
	 * @param beanId
	 * @return 返回对象
	 */
	public static Object getBean(String beanId) {
		BeanConfig beanConfig = map.get(beanId);
		Object object = null;
		try {
			//利用反射实例化对象
			String className = beanConfig.getClassName();
			Class cls = Class.forName(className);
			object = cls.newInstance();
			//获取Prop数据
			Properties prop = beanConfig.getProp();
			Set<String> names = prop.stringPropertyNames();
			for (String name : names) {
				String value = prop.getProperty(name);
				//利用BeanUtils工具封装数据
				BeanUtils.setProperty(object, name, value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return object;
	}

}
