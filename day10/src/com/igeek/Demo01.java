package com.igeek;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author zx
 * @version 1.0
 * @description:模拟斗地主案例
 *  A:准备牌：
		牌可以设计为一个ArrayList<String>,每个字符串为一张牌。
		每张牌由花色、数字两部分组成，我们可以使用花色集合与数字集合嵌套迭代完成每张牌的组装。
		牌由Collections类的shuffle方法进行随机排序。
	B:发牌：
		将每个人以及底牌设计为ArrayList<String>,将最后3张牌直接存放于底牌，剩余牌通过对3取模依次发牌。
	C:看牌：
		直接打印每个集合
 */
public class Demo01 {
	
	public static void main(String[] args) {
		
		//牌
		ArrayList<String> poker = new ArrayList<>();
		
		//花色
		ArrayList<String> colors = new ArrayList<>();
		colors.add("♣");
		colors.add("♦");
		colors.add("♠");
		colors.add("♥");
		//数字
		ArrayList<String> numbers = new ArrayList<>();
		for (int i = 2; i <= 10; i++) {
			numbers.add(i+"");
		}
		numbers.add("J");
		numbers.add("Q");
		numbers.add("K");
		numbers.add("A");
		//组装
		for (String color : colors) {
			for (String number : numbers) {
				String temp = color+number;
				poker.add(temp);
			}
		}
		
		poker.add("大☺");
		poker.add("小☺");
		
//		System.out.println(poker);
		
		//洗牌
		Collections.shuffle(poker);
		
//		System.out.println(poker);
		
		//发牌
		ArrayList<String> player1 = new ArrayList<>();
		ArrayList<String> player2 = new ArrayList<>();
		ArrayList<String> player3 = new ArrayList<>();
		ArrayList<String> dipai = new ArrayList<>();
		
		for (int i = 0; i < poker.size()-3; i++) {
			//拿到牌
			String card = poker.get(i);
			//取模
			if(i%3 == 0) {
				player1.add(card);
			}else if (i%3 == 1) {
				player2.add(card);
			}else if (i%3 == 2) {
				player3.add(card);
			}
		}
		//底牌
		for (int i = poker.size()-3; i < poker.size(); i++) {
			dipai.add(poker.get(i));
		}
		//打印
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player3);
		System.out.println(dipai);
		
		
	}

}
