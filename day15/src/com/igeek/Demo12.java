package com.igeek;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import com.igeek.utils.MyBeanUtils;
import com.igeek.utils.MyBeanUtils02;
import com.igeek.utils.MyBeanUtils03;

/**
 * @author zx
 * @version 1.0
 * @description: BeanUtils类的populate(Object bean, Map<String,String[]>
 *               properties)： 将Map数据封装到指定Javabean中，一般用于将表单的所有数据封装到javabean。
 */
public class Demo12 {

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		/*Map<String, String[]> map = new HashMap<String, String[]>();
		map.put("uid", new String[] { "1001" });
		map.put("userName", new String[] { "Jack", "Rose" });
		map.put("password", new String[] { "123456" });

		User user = new User();
		BeanUtils.populate(user, map);

		System.out.println(user);*/

		// 1.模拟数据，创建一个Map，填充需要的数据
		Map<String, String[]> map = new HashMap<String, String[]>();
		map.put("uid", new String[] { "u001" });
		map.put("userName", new String[] { "jack", "rose" });
		map.put("password", new String[] { "1234" });
		map.put("hobbies", new String[] { "敲代码", "早上敲代码", "晚上敲代码" });
		map.put("age", new String[] { "123" });

		// 2.将使用populate进行填充
		// 可以向指定的属性，填充一组数据。需要类型必须是[]
		// 如果属性不是数组，将使用map.value表示数组中的第一个。
		// BeanUtils支持类型：基本类型和基本类型对应的包装类，自动将字符串转换基本类型。
		User user = new User();
//		BeanUtils.populate(user, map);
//		MyBeanUtils.populate(user, map);
//		user = (User) MyBeanUtils02.populate(User.class, map);
		user = MyBeanUtils03.populate(User.class, map);
		
		System.out.println(user);

	}

}
