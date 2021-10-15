package Polymorphism;

import Polymorphism.Human.employee;
import Polymorphism.Human.human;
import Polymorphism.Human.student;

public class polymorphism01 {
	public static void main(String[] args) {
		human human01 = new student("佐藤", 17, 70);
		System.out.println("Humanクラスのメソッド：プロフィールを紹介します。" + human01.getProfile());
		
		human human02 = new employee("田中", 28, "システム部");
		System.out.println("Humanクラスのメソッド：プロフィールを紹介します。" + human02.getProfile());
	}

}
