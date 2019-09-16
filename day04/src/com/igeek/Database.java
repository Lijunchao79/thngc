package com.igeek;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	List<Item> items = new ArrayList<>();
	
	//添加功能
	public void add(Item itme) {
		items.add(itme);
	}

	//列表展示的功能
	public void list() {
		for (Item item : items) {
			item.print();
		}
	}
	
	public static void main(String[] args) {
		Database database = new Database();
		Cd cd = new Cd("卡路里","火箭少女101");
		Cd cd2 = new Cd("往后余生", "马良/孙茜茹");
		Cd cd3 = new Cd("演员", "薛之谦");
		database.add(cd);
		database.add(cd2);
		database.add(cd3);
		
		Dvd dvd = new Dvd("哪吒之魔童降世", "饺子");
		Dvd dvd2 = new Dvd("送我上青云", "滕丛丛");
		database.add(dvd);
		database.add(dvd2);
		
		Game game = new Game("荒野大镖客救赎2", "ps4");
		database.add(game);
		
		database.list();
	}

}
