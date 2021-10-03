package classMethod;

import classMethod.human.Human01;

public class ClassMethod01 {
	public static void main(String[] args) {
		Human01 yamada = new Human01();
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "歳です。");
		
		Human01 sato = new Human01("佐藤", 25);
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "歳です。");
	}
}
