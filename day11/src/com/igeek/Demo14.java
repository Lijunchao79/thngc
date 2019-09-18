package com.igeek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
* 需求:
* 具体规则：
	1. 组装54张扑克牌
	2. 将54张牌顺序打乱
	3. 三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张留作底牌。
	4. 查看三人各自手中的牌（按照牌的大小排序）、底牌
	手中扑克牌从大到小的摆放顺序：大王,小王,2,A,K,Q,J,10,9,8,7,6,5,4,3
	
	分析：	
	A:准备牌：
		完成数字与纸牌的映射关系：
		使用双列Map(HashMap)集合，完成一个数字与字符串纸牌的对应关系(相当于一个字典)。
	B:洗牌：
		通过数字完成洗牌发牌
	C:发牌：
		将每个人以及底牌设计为ArrayList<Integer>,将最后3张牌直接存放于底牌，剩余牌通过对3取模依次发牌。
		存放的过程中要求数字大小与斗地主规则的大小对应。
		将代表不同纸牌的数字分配给不同的玩家与底牌。
	D:看牌：
		通过Map集合找到对应字符展示。
		通过查询纸牌与数字的对应关系，由数字转成纸牌字符串再进行展示。
 */
public class Demo14 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		//组装54张扑克牌
		//花色
		ArrayList<String> colors = new ArrayList<>();
		colors.add("♣");
		colors.add("♦");
		colors.add("♠");
		colors.add("♥");
		//数字
		ArrayList<String> numbers = new ArrayList<>();
		for (int i = 3; i <=10; i++) {
			numbers.add(i+"");
		}
		Collections.addAll(numbers, "J","Q","K","A","2");
		
		int cardNumber = 0;
		
		//遍历数字匹配花色
		for (String number : numbers) {
			for (String color : colors) {
				String card = color+number;
				map.put(cardNumber, card);
				cardNumber++;
			}
		}
		
		//添加大小王
		map.put(cardNumber++, "小王");
		map.put(cardNumber, "大王");
		
		System.out.println(map);
		
		//准备牌
		ArrayList<Integer> poker = new ArrayList<>();
		for (int i = 0; i < 54; i++) {
			poker.add(i);
		}
		
		//洗牌
		Collections.shuffle(poker);
		
		//发牌
		ArrayList<Integer> player1 = new ArrayList<>();
		ArrayList<Integer> player2 = new ArrayList<>();
		ArrayList<Integer> player3 = new ArrayList<>();
		ArrayList<Integer> dipai = new ArrayList<>();
		//玩家依次摸牌		
		for (int i = 0; i < poker.size()-3; i++) {
			//代表这张牌的数字
			Integer card = poker.get(i);
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
		
		Collections.sort(player1);
		Collections.sort(player2);
		Collections.sort(player3);
		Collections.sort(dipai);
		
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player3);
		System.out.println(dipai);
		
		System.out.println("**********************");
		
		for (int i = player1.size()-1; i >= 0; i--) {
			Integer key = player1.get(i);
			String thisCard = map.get(key);
			System.out.print(thisCard+" ");
		}
		System.out.println();
		for (int i = player2.size()-1; i >= 0; i--) {
			Integer key = player2.get(i);
			String thisCard = map.get(key);
			System.out.print(thisCard+" ");
		}
		System.out.println();
		for (int i = player3.size()-1; i >= 0; i--) {
			Integer key = player3.get(i);
			String thisCard = map.get(key);
			System.out.print(thisCard+" ");
		}
		System.out.println();
		for (int i = dipai.size()-1; i >= 0; i--) {
			Integer key = dipai.get(i);
			String thisCard = map.get(key);
			System.out.print(thisCard+" ");
		}
		
	}

}
