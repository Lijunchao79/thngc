package com.igeek;

import java.io.File;

/**
 * @author Administrator
 * 统计文件的大小
 */
public class DirCount {
	
	private long len;
	private String path;
	private File file;
	//文件的个数
	private int fileSize;
	//文件夹的个数
	private int dirSize;
	
	public DirCount(String path) {
		super();
		this.path = path;
		this.file = new File(path);
		count(file);
	}

	public long getLen() {
		return len;
	}

	public void setLen(long len) {
		this.len = len;
	}

	public int getFileSize() {
		return fileSize;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}

	public int getDirSize() {
		return dirSize;
	}

	public void setDirSize(int dirSize) {
		this.dirSize = dirSize;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	//统计文件的大小
	public void count(File src) {
		if((src.exists()) && (src != null)) {
			if(src.isFile()) {
				len += file.length();
				fileSize++;
			}else {
				dirSize++;
				for (File file : src.listFiles()) {
					count(file);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		DirCount dirCount = new DirCount("D:\\thngc-workspace\\day05");
		System.out.println(dirCount.len);
		System.out.println("文件数:"+dirCount.getFileSize());
		System.out.println("目录数:"+dirCount.getDirSize());
	}
	

}
