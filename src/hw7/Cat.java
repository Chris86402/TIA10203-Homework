package hw7;

import java.io.Serializable;

public class Cat extends Animal implements Serializable { // 序列化空介面
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}

}
