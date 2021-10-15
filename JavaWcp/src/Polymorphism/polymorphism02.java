package Polymorphism;

import Polymorphism.Human.human;
import Polymorphism.Human.student;

public class polymorphism02 {
	public static void main(String[] args) {
		human human = new student("佐藤", 17, 70);
		
		polymorphism02 polymorphism = new polymorphism02();
		
		polymorphism.printName();
		polymorphism.printName("松本");
		polymorphism.printName("松本", "清水");
		polymorphism.printName(human);
	}
	
	public void printName() {
		System.out.println("中川です。");
	}
	
	public void printName(String name) {
		System.out.println(name + "です。");
	}
	
	public void printName(String name1, String name2) {
		System.out.println(name1 + "と" + name2 + "です。");
	}
	
	public void printName(human human) {
		System.out.println(human.getName() + "です。");
	}

}
