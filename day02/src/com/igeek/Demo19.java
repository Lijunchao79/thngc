package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:用二维数组打印杨辉三角形
 * 
 *1.每一行的第一个元素1，最后一个元素为1
 *2
 */
public class Demo19 {

	public static void main(String[] args) {
		//1.声明二维数组
		int[][] yangHui = new int[10][];
		//2.初始化
		for(int i=0;i<yangHui.length;i++) {
			yangHui[i] = new int[i+1];
			//2.1首末元素赋值为1
			yangHui[i][0] = yangHui[i][i] = 1;
			//2.2除首末之外的元素赋值
			for(int j=1;j<yangHui[i].length-1;j++) {
				yangHui[i][j] = yangHui[i-1][j] +yangHui[i-1][j-1];
			}
			
		}
		
		for(int i=0;i<yangHui.length;i++) {
			for (int j = 0; j < yangHui[i].length; j++) {
				System.out.print(yangHui[i][j]+" ");
			}
			System.out.println();
		}

	}

}
