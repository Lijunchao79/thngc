package com.igeek;

public class TestDog {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.shout();
		
		BigDog bigDog = new BigDog();
		bigDog.shout();
		
		Canidae canidae = new Dog();
		canidae.shout();

	}

}
