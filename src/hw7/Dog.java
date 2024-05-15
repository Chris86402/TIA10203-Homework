package hw7;

import java.io.Serializable;

public class Dog extends Animal implements Serializable { // 序列化空介面
	private String name;

	public Dog(String name) {
		super();
		this.name = name;
	}

	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
