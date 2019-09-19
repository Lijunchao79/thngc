package com.igeek;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Demo18 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//写出-->序列化
		/*ObjectOutputStream oos = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream("obj")));
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
		oos.close();*/
		
		//读取-->反序列化
		ObjectInputStream ois = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("obj")));
		int i = ois.readInt();
		boolean flag = ois.readBoolean();
		String str = ois.readUTF();
		char ch = ois.readChar();
		Date obj1 = (Date) ois.readObject();
		String obj2 = (String) ois.readObject();
		Student stu = (Student) ois.readObject();
		System.out.println(i);
		System.out.println(flag);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(stu.getName()+"==>"+stu.getAge());
		ois.close();

	}

}
