package com.igeek.xmls;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @author zx
 * @version 1.0
 * @description:dom4j解析xml
 * 
 * 1.SaxReader对象
	a)read(…) 加载执行xml文档
	2.Document对象
	a)getRootElement() 获得根元素
	3.Element对象
	a)elements(…) 获得指定名称的所有子元素。可以不指定名称
	b)element(…) 获得指定名称第一个子元素。可以不指定名称
	c)getName() 获得当前元素的元素名
	d)attributeValue(…) 获得指定属性名的属性值
	e)elementText(…) 获得指定名称子元素的文本值
	f)getText() 获得当前元素的文本内容
 */
public class Dom4jDemoTest {

	public static void main(String[] args) throws DocumentException {
		//1.SAXReader
		SAXReader saxReader = new SAXReader();
		//2.文档对象
		Document document = saxReader.read("beans.xml");
		
//		System.out.println(document);
		//3.获得根元素 <beans>
		Element rootElement = document.getRootElement();
		//4.获得指定名称的所有子元素
		List<Element> elements = rootElement.elements();
		
		if(elements.size()>0 && elements != null) {
			for (Element element : elements) {
				//获取属性值attributeValue()
				String id = element.attributeValue("id");
				String className = element.attributeValue("className");
				System.out.println(id+";"+className);
				
				List<Element> subBean = element.elements();
				for (Element element2 : subBean) {
					//获取元素的元素名getName()
					System.out.println(element2.getName());
					String name = element2.attributeValue("name");
					String value = element2.attributeValue("value");
					System.out.println(name+";"+value);
					//获取元素的文本内容getText()
					System.out.println(element2.getText());
				}
				
			}
		}

	}

}
