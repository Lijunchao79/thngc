package com.igeek;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * @author zx
 * @version 1.0
 * @description:ObjectOutputStream
 */
public class Demo17 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ByteArrayOutputStream bos =new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		//基本数据类型
		oos.writeInt(18);
		oos.writeBoolean(false);
		oos.writeUTF("java");
		oos.writeChar('a');
		//对象
		oos.writeObject(new Date());
		oos.writeObject("你好");
		Student student = new Student("jack", 20);
		//java.io.NotSerializableException
		oos.writeObject(student);
		oos.flush();
		//取数据
		byte[] datas = bos.toByteArray();
//		System.out.println(datas.length);
		
		ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(datas));
		int i = ois.readInt();
		boolean flag = ois.readBoolean();
		String str = ois.readUTF();
		char ch = ois.readChar();
		
		Date obj1 = (Date) ois.readObject();
		String obj2 = (String) ois.readObject();
		Student stu = (Student) ois.readObject();
//		System.out.println(i);
//		System.out.println(flag);
//		System.out.println(ch);
//		System.out.println(str);
//		System.out.println(obj1);
//		System.out.println(obj2);
		System.out.println(stu.getName()+"==>"+stu.getAge());
		
		

	}

}
