package exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04 {

	public static void main(String[] args) {
		File src = new File("src");
		File dest = new File("dest");
		copyDir2Dir(src, dest);
	}
	
	/**
	 * 将源文件夹src复制到目标文件夹dest  
	 * @param src
	 * @param dest
	 */
	public static void copyDir2Dir(File src,File dest) {
		//1.在目标文件夹中创建源文件
		File destSrc = new File(dest, src.getName());
		destSrc.mkdirs();
		
		//2.获取文件夹下的所有文件对象
		File[] fileOrDirs = src.listFiles();
		
		//3.遍历
		for (File fileOrDir : fileOrDirs) {
			if(fileOrDir.isDirectory()) {
				//如果是文件夹
				File oldDir = fileOrDir;
				File newDir = destSrc;
				//递归
				copyDir2Dir(oldDir, newDir);
			}else if (fileOrDir.isFile()) {
				//如果是文件
				File oldFile = fileOrDir;
				File newFile = new File(destSrc, oldFile.getName());
				//拷贝
				copy(oldFile,newFile);
			}
		}
	}
	
	/**
	 * 拷贝
	 * @param oldFile
	 * @param newFile
	 */
	public static void copy(File oldFile, File newFile) {
		//选择流
		try(FileInputStream fis = new FileInputStream(oldFile);
				FileOutputStream fos = new FileOutputStream(newFile);){
			//读写操作
			byte[] buffers = new byte[1024];
			int len = -1;
			while((len = fis.read(buffers)) != -1) {
				fos.write(buffers, 0, len);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
