package com.igeek;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.SuffixFileFilter;

public class Demo02 {

	public static void main(String[] args) {
		Collection<File> files = FileUtils.listFiles(
				new File("D:\\testtt-workspace\\day13"), 
				EmptyFileFilter.NOT_EMPTY, DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		
		System.out.println("************************************************");
		Collection<File> files2 = FileUtils.listFiles(
				new File("D:\\testtt-workspace\\day13"), 
				new SuffixFileFilter("txt"), DirectoryFileFilter.INSTANCE);
		for (File file : files2) {
			System.out.println(file.getAbsolutePath());
		}
		
		System.out.println("************************************************");
		Collection<File> files3 = FileUtils.listFiles(
				new File("D:\\testtt-workspace\\day13"), 
				FileFilterUtils.or(new SuffixFileFilter("class"),new SuffixFileFilter("txt")), DirectoryFileFilter.INSTANCE);
		for (File file : files3) {
			System.out.println(file.getAbsolutePath());
		}
		
		System.out.println("************************************************");
		Collection<File> files4 = FileUtils.listFiles(
				new File("D:\\testtt-workspace\\day13"), 
				FileFilterUtils.and(new SuffixFileFilter("txt"),EmptyFileFilter.EMPTY), DirectoryFileFilter.INSTANCE);
		for (File file : files4) {
			System.out.println(file.getAbsolutePath());
		}
		

	}

}
