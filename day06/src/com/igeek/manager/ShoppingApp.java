package com.igeek.manager;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingApp {
	
	private static ArrayList<GoodItem> goodItems = new ArrayList<>();
	
	public static void main(String[] args) {
		// 为集合准备数据
		initData();

		// 打印欢迎语句
		System.out.println("欢迎使用超市管理系统!");

		// 使用死循环完成反复操作的逻辑
		// for(;;) {}
		while (true) {
			// 使用switch给出操作选择：1输入购买数量2打印小票3退出
			// 提示信息
			System.out.println("请输入您要进行的操作:1输入购买数量   2打印小票   3退出");

			// 通过键盘录入得到数据
			Scanner sc = new Scanner(System.in);
			int optNumber = sc.nextInt();
			// 完成switch中三个case的逻辑
			switch (optNumber) {
			case 1:
				System.out.println("给所有数据量赋值");
				enterNumber();
				break;
			case 2:
				// 调用打印购物小票的方法
				System.out.println("打印购物小票");
				printReceipt();
				break;
			case 3:
				System.out.println("欢迎下次光临");
				// 退出程序
				System.exit(0);
			default:
				System.out.println("请输入正确的数字!");
				break;
			}
		}

	}

	public static void printReceipt() {
		System.out.println("欢迎光临");
		System.out.println("品名\t\t售价\t数量\t金额");
		System.out.println("-----------------------------------");
		
		int totalNumber = 0;
		double totalMoney = 0.0;
		for (GoodItem g : goodItems) {
			System.out.println(g.getName()+g.getId()+"\t"+g.getPrice()+"\t"+g.getNumber()+" "+g.getUnit()+"\t"+g.getMoney());
			totalNumber += g.getNumber();
			totalMoney += g.getMoney();
		}
		System.out.println("共"+goodItems.size()+"项商品");
		System.out.println("共计:"+totalNumber+"件");
		System.out.println("总计:"+totalMoney);
	}

	public static void enterNumber() {
		//遍历
		for (int i = 0; i < goodItems.size(); i++) {
			GoodItem goodItem = goodItems.get(i);
			String name = goodItem.getName();
			System.out.println("请输入"+name+"的购买数量:");
			Scanner scanner = new Scanner(System.in);
			int goodItemNumber = scanner.nextInt();
			//金额:单价*数量
			goodItem.setMoney(goodItemNumber*goodItem.getPrice());
			goodItem.setNumber(goodItemNumber);
		}
		
		
	}
	//初始化商品
	public static void initData() {
		GoodItem sls = new GoodItem("少林寺核桃", "090115", 15.5, 0, "个", 0);
		GoodItem shk = new GoodItem("尚康饼干", "090027", 14.5, 0, "个", 0);
		GoodItem pm = new GoodItem("康师傅方便面", "090028", 4.5, 0, "袋", 0);
		goodItems.add(sls);
		goodItems.add(shk);
		goodItems.add(pm);
	}

}
